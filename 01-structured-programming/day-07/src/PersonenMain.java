public class PersonenMain {
    public static void main(String[] args) {
        Person person1 = new Person(); // Person1 erstellen
        person1.name = "Alice"; // Person1 den Namen Alice geben

        Person person2 = new Person(); // Person2 erstellen
        person2.name = "Bob"; // Person2 den Namen Bob geben

        person1.grüßen(person2); // Alice sagen, sie soll Bob grüßen
        person2.grüßen(person1); // Bob sagen, er soll Alice grüßen
    }
}
