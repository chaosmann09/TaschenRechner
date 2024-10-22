import java.util.Scanner;

public class Main {

    private static int zahl1;
    private static int zahl2;
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1 - Addition \n" +
                            "2 - Subtraktion \n" +
                            "3 - Multiplikation \n" +
                            "4 - Division");
        String rechnenzeichen = sc.nextLine();
        System.out.println("Gebe eine zahl ein");
        zahl1 = sc.nextInt();
        System.out.println("In der Variabel zahl1 ist nun " + zahl1 + " gespeichert. Gebe nun eine zweite Zahl ein");
        zahl2 = sc.nextInt();
        double ergebnis = 0;
        switch (rechnenzeichen) {
            case "1":
                ergebnis = zahl1 + zahl2;
                break;
            case "2":
                ergebnis = zahl1 - zahl2;
                break;
            case "3":
                ergebnis = zahl1 * zahl2;
                break;
            case "4":
                ergebnis = zahl1 / zahl2;
                break;
        }
        System.out.println("Das Ergebnis lautet: " + ergebnis);
    }
}
