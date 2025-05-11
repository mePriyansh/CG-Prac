class EarthVolume {
    public static void main(String[] args) {
        int radius = 6378;
        double volume_km= (4/3)*3.14*radius*radius*radius;
        double volume_miles= volume_km*0.621371;
        System.out.println("Volume of Earth in cubic kilometers is: "+ volume_km + " and cubic miles is "+ volume_miles);
    }    
}

