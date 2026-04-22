public class Besucher {
    final String name = "Nutzer";

    void beitragLesen(Beitrag beitrag, String username) {
        System.out.println(username + " liest Beitrag: " + beitrag.text);
    }
}
