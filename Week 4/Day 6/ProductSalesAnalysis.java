import java.util.*;
import java.util.stream.*;

class Sale {
    String productId;
    int quantity;
    double price;

    public String getProductId() { return productId; }
    public int getQuantity() { return quantity; }
    public double getPrice() { return price; }
}

class ProductSales {
    String productId;
    double totalRevenue;

    public ProductSales(String productId, double totalRevenue) {
        this.productId = productId;
        this.totalRevenue = totalRevenue;
    }

    public double getTotalRevenue() { return totalRevenue; }
}

class ProductSalesAnalysis {
    public List<ProductSales> analyzeSales(List<Sale> sales) {
        return sales.stream()
                .filter(s -> s.getQuantity() > 10)
                .collect(Collectors.groupingBy(Sale::getProductId,
                        Collectors.summingDouble(s -> s.getQuantity() * s.getPrice())))
                .entrySet().stream()
                .map(e -> new ProductSales(e.getKey(), e.getValue()))
                .sorted(Comparator.comparingDouble(ProductSales::getTotalRevenue).reversed())
                .limit(5)
                .collect(Collectors.toList());
    }
}
