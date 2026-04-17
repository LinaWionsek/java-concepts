import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int satzAnzahlKonfiguration = 10;
        Scanner inputscanner = new Scanner(System.in); // Typ scanner öffnen Kommunikationskanal bei dem wir auf unseren input zugreifen
        // scanner kann auf input mitlesen

        String ausgabe = "Bitte gib deinen Namen ein";
        System.out.println(ausgabe);

        String eingabe = inputscanner.nextLine();
        //die nächste Zeile aus meinem Kommunikationskanal / der wartet auf einen Zeilenumbruch (der mit Enter geschenen würde)
        //wir warten auf die Eingabe
        int längeName =  eingabe.length();

        if (längeName < 2) { // IF Anweisung / Verzweigung
            ausgabe = "Eingabe ist zu kurz.";
            System.err.println(ausgabe);
        } else {
            ausgabe = "Hallo " + eingabe + ", schön dass du da bist!";
            System.out.println(ausgabe);
        }

        System.out.println("Welchen Satz soll ich für dich " + satzAnzahlKonfiguration + "x wiederholen?");
        eingabe = inputscanner.nextLine();
        for (int i = 0; i < satzAnzahlKonfiguration; i++) {
            System.out.println(eingabe);
        }

    }
}

