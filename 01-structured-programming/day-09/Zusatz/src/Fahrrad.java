public class Fahrrad implements KannFahren {
    @Override
    public void fahren() {  // MUSS implementiert werden

    }

    @Override
    public void hupen() { // KANN überschrieben werden
        System.out.println("Klingeling!");
    }
}
