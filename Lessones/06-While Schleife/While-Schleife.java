public class WhileSchleife {
    public static void main(String[] args) {
        int zahl = 1;

        // Solange die Bedingung wahr ist (zahl <= 5), wird die Schleife wiederholt
        while (zahl <= 5) {
            System.out.println("Die Zahl ist: " + zahl);
            zahl++; // zahl wird jedes Mal um 1 größer
        }

        System.out.println("Schleife beendet!");
    }
}
