public class ForumMain {
    public static void main(String[] args) {
        RegistrierterBesucher nutzer = new RegistrierterBesucher(); // Instanziierung
        Besucher unregistrierterNutzer = new Besucher();
        Besucher unregistrierterNutzer2 = new Besucher();

        nutzer.name = "Alice";
        System.out.println(unregistrierterNutzer.name + " Nutzername");
        Beitrag meinBeitrag = nutzer.beitragVerfassen("Es war einmal eine Gruppe angehender Softwareentwickler..."); // indirekte Instanziierung

        // Darstellen
        System.out.println("Beitrag:");
        System.out.println(meinBeitrag.text);
        System.out.println("Verfasst von:");
        System.out.println(meinBeitrag.verfasserNamen);

        nutzer.beitragLesen(meinBeitrag, nutzer.name);
        unregistrierterNutzer.beitragLesen(meinBeitrag, unregistrierterNutzer.name);
        unregistrierterNutzer2.beitragLesen(meinBeitrag, unregistrierterNutzer2.name);
    }
}