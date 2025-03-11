class Que7 {
    public static void main(String[] args) {
        
        boolean isGreen = true;
        boolean isEmergency = false;
        
        System.out.println("Traffic Light Controller:");
        
        
        if (isGreen == true) {
            if (isEmergency == false) {
                System.out.println("Proceed through intersection");
                System.out.println("Speed limit: 40 mph");
            } else {
                System.out.println("Proceed with caution");
                System.out.println("Emergency vehicle approaching");
            }
        } else {
            if (isEmergency == true) {
                System.out.println("Stop immediately");
                System.out.println("Clear path for emergency vehicle");
            } else {
                System.out.println("Stop at intersection");
                System.out.println("Wait for green light");
            }
        }
    }
}