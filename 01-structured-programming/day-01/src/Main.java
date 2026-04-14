public class Main {
    public static void main(String[] args) {
        var höhe = 3; // Höhe als Zahl mit der eingabe 3
        var breite = 4;
        höhe = höhe * höhe; // Höhe wird zu Höhe^2
        // Math.pow(höhe, 2)
        breite = breite * breite;
        // Math.pow(breite, 2)
        var summe = höhe + breite; // Summe wird zu höhe + breite
        var resultat = Math.sqrt(summe); // sqrt -> square root -> Quadratwurzel
        System.out.println(resultat); // println -> print line -> eine Zeile ausgeben
    }
}