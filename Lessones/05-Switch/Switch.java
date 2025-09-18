public class Switch {
    public static void main(String[] args) {
        int note = 3;

        // Switch überprüft verschiedene Fälle (cases)
        switch (note) {
            case 1:
                System.out.println("Sehr gut");
                break;
            case 2:
                System.out.println("Gut");
                break;
            case 3:
                System.out.println("Befriedigend");
                break;
            case 4:
                System.out.println("Ausreichend");
                break;
            case 5:
                System.out.println("Mangelhaft");
                break;
            case 6:
                System.out.println("Ungenügend");
                break;
            default:
                // Default wird ausgeführt, wenn kein Fall passt
                System.out.println("Keine gültige Note");
        }
    }
}
