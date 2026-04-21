public class RegistrierterBesucher {
    String name;

    Beitrag beitragVerfassen(String inhalt) {
        System.out.println(name + " ist dabei einen Beitrag zu erstellen!");
        Beitrag neuerBeitrag = new Beitrag();
        neuerBeitrag.text = inhalt;
        neuerBeitrag.verfasserNamen = name;
        return neuerBeitrag;
    }
}
