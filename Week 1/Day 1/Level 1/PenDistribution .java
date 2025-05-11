class PenDistribution {
    public static void main(String[] args) {
        int pens=14, students=3;
        int pensPerStudent=pens/students;
        int pensLeft=pens%students;
        System.out.println("The Pen Per Student is "+ pensPerStudent + " and pen not distributed is "+ pensLeft);
    }    
}