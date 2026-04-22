public class RegistrierterBesucher extends Besucher {
    String name;

    Beitrag beitragVerfassen(String inhalt) {
        System.out.println(name + " ist dabei einen Beitrag zu erstellen!");
        Beitrag neuerBeitrag = new Beitrag();
        neuerBeitrag.text = inhalt;
        neuerBeitrag.verfasser = this; //referenz (Adresse) von Objekt das diese Methode ausführt Die Adresse von Registrierter Besucher
        // der verfasser bin ich selbst
        return neuerBeitrag;
    }
}