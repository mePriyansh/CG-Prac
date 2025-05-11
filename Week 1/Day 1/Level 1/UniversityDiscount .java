class UniversityDiscount {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercent =10;
        double discount = (fee* (double)discountPercent)/100;
        fee = fee - (int)discount;
        System.out.println("The discount amount is INR "+ (int)discount + " and final discounted fee is INR "+ fee);
    }    
}