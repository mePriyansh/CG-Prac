import java.util.*;
import java.util.stream.*;

class Transaction {
    String transactionId;
    String policyNumber;
    double amount;
    String transactionDate;
    boolean isFraudulent;

    public boolean isFraudulent() { return isFraudulent; }
    public double getAmount() { return amount; }
    public String getPolicyNumber() { return policyNumber; }
}

class FraudAlert {
    String policyNumber;
    long fraudCount;
    double fraudTotal;

    public FraudAlert(String policyNumber, long count, double total) {
        this.policyNumber = policyNumber;
        this.fraudCount = count;
        this.fraudTotal = total;
    }
}

class FraudDetection {
    public List<FraudAlert> detectFraud(List<Transaction> transactions) {
        return transactions.stream()
                .filter(t -> t.isFraudulent() && t.getAmount() > 10000)
                .collect(Collectors.groupingBy(Transaction::getPolicyNumber,
                        Collectors.summarizingDouble(Transaction::getAmount)))
                .entrySet().stream()
                .map(e -> new FraudAlert(e.getKey(), e.getValue().getCount(), e.getValue().getSum()))
                .filter(f -> f.fraudCount > 5 || f.fraudTotal > 50000)
                .collect(Collectors.toList());
    }
}
