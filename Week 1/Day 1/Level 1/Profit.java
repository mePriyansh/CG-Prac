class Profit {
    public static void main(String[] args)
    {
        int cp=129,sp=191;
        int profit = sp-cp;
        double profit_percent = (profit*100)/cp;
        System.out.println("The Cost Price is INR "+ cp + " and Selling Price is INR "+ sp);
        System.out.println("The Profit is INR "+ profit + "  and Profit Percentage is "+ profit_percent);
    }
}