public class VariablenMitTypen {
    public static void main(String[] args) {
        // Variablen
        //DatenTyp variablenName = wert;

        int integer32 = -123; // Ganzzahlen // -2^31...+2^31-1
        int ergebnis = 1 + 2 - 3 * 4 / 5;

        int a = 10 / 3; // integer-division
        int b = 9 / 3;
        System.out.println(a);
        System.out.println(b);

        double double64 = 50.0; // Fließkommazahl // +-2.2*10^-308...+-1.8*10^308

        int meineGanzzahl = 3;
        double meineKommazahl = meineGanzzahl; // automatische (implizite) Konvertierung
        // fehler: int wiederZurück = meineKommazahl;
        int wiederZurück = (int) meineKommazahl; // explizite Konvertierung

        // Runden
        System.out.println(Math.ceil(1.1)); // aufrunden
        System.out.println(Math.round(1.5));
        System.out.println(Math.floor(1.9)); // abrunden

        // Booleans (wahr oder falsch)
        boolean meineBedingung = true;
        meineBedingung = 1 > 0;
        if (meineBedingung) {
            System.out.println("Wohooo!");
        }

        // Texte
        String name = "Alice";
        String gruß = "Hallo " + name + "!";
        System.out.println(gruß);

        double eingabe = 123.0;
        String ausgabe = "Deine Eingabe: " + eingabe;
        System.out.println(ausgabe);

        System.out.println(1 + "Hallo" + 1); // -> (1 + "Hallo") + 1 -> ("1" + "Hallo) + 1 -> "1Hallo" + 1 -> "1Hallo1"
        System.out.println("Hallo" + 1 + 1); // -> "Hallo1" + 1 -> "Hallo11"
        System.out.println(1 + 1 + "Hallo"); // -> 2 + "Hallo" -> "2Hallo"

        // Reihenfolge
        // ()
        // * /
        // + -
        // && || < > <=
    }
}