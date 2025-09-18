# While-Schleife in Java

Die **while-Schleife** wiederholt Anweisungen, solange eine Bedingung `true` ist.  
Wenn die Bedingung `false` wird, hört die Schleife auf.

## Beispielcode

```java
public class WhileBeispiel {
    public static void main(String[] args) {
        int zahl = 1; // Startwert

        // Solange zahl kleiner oder gleich 5 ist, wird die Schleife ausgeführt
        while (zahl <= 5) {
            System.out.println("Die Zahl ist: " + zahl);
            zahl++; // Erhöhe die Zahl um 1
        }

        System.out.println("Schleife beendet!");
    }
}
