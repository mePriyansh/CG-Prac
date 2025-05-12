import java.util.*;
import java.util.stream.*;

class Claim {
    String claimId;
    String policyNumber;
    double claimAmount;
    String claimDate;
    String status;

    public String getPolicyNumber() { return policyNumber; }
    public double getClaimAmount() { return claimAmount; }
    public String getStatus() { return status; }
}

class PolicyClaimSummary {
    String policyNumber;
    double totalClaimAmount;
    double averageClaimAmount;

    public PolicyClaimSummary(String policyNumber, double total, double avg) {
        this.policyNumber = policyNumber;
        this.totalClaimAmount = total;
        this.averageClaimAmount = avg;
    }

    public double getTotalClaimAmount() { return totalClaimAmount; }
}

class ClaimsAnalysis {
    public List<PolicyClaimSummary> analyzeClaims(List<Claim> claims) {
        return claims.stream()
                .filter(c -> c.getStatus().equals("Approved") && c.getClaimAmount() > 5000)
                .collect(Collectors.groupingBy(Claim::getPolicyNumber,
                        Collectors.summarizingDouble(Claim::getClaimAmount)))
                .entrySet().stream()
                .map(e -> new PolicyClaimSummary(e.getKey(), e.getValue().getSum(), e.getValue().getAverage()))
                .sorted(Comparator.comparingDouble(PolicyClaimSummary::getTotalClaimAmount).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }
}
