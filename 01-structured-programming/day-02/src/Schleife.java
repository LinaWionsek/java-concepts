public class Schleife {
    public static void main(String[] args) {
        var startwert = 1;
        var endwert = 1000;
        var zähler = startwert;

        while(zähler <= endwert) { //solange die Bedingung true ist
            System.out.println(zähler);
            zähler++; // zähler = zähler +1
        }
        System.out.println("Alles fertig!");

        // Alternative Zählschleife
        for (var i = startwert; i <= endwert ; i++) {

        }
    }
}
