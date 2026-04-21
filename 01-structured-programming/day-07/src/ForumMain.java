public class ForumMain {
    public static void main(String[] args) {
        RegistrierterBesucher nutzer = new RegistrierterBesucher(); // Instanziierung
        nutzer.name = "Alice";

        Beitrag meinBeitrag = nutzer.beitragVerfassen("Es war einmal eine Gruppe angehender Softwareentwickler..."); // indirekte Instanziierung

        // Darstellen
        System.out.println("Beitrag:");
        System.out.println(meinBeitrag.text);
        System.out.println("Verfasst von:");
        System.out.println(meinBeitrag.verfasserNamen);

        nutzer.beitragLesen(meinBeitrag);
    }
}