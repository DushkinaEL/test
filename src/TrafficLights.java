public class TrafficLights {
    public static void main (String[] args) {
        String light = "Red";
        switch (light) {
            case "Green" :
                System.out.println("Go");
                break;
            case "Yellow" :
                System.out.println("Wait");
                break;
            case "Red" :
                System.out.println("Stop");
                break;
            default:
                System.out.println("neverno");
        }
    }
}
