public class Operatoren {
    public static void main(String[] args) {
        //  1. Rechen-Operatoren
        System.out.println("5 + 3 = " + (5 + 3));  // Plus
        System.out.println("5 - 3 = " + (5 - 3));  // Minus
        System.out.println("5 * 3 = " + (5 * 3));  // Mal
        System.out.println("6 / 3 = " + (6 / 3));  // Geteilt

        //  2. Vergleichs-Operatoren
        System.out.println("\n5 > 3? " + (5 > 3));   // Größer?
        System.out.println("5 < 3? " + (5 < 3));     // Kleiner?
        System.out.println("5 == 3? " + (5 == 3));   // Gleich?

        //  3. Logische Operatoren
        System.out.println("\nWahr UND Falsch? " + (true && false));  // UND
        System.out.println("Wahr ODER Falsch? " + (true || false));   // ODER
    }

}
