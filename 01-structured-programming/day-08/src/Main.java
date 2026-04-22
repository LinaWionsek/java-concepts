public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";

        System.out.println(person1.name); // Alice

        Person person2 = person1;

        System.out.println(person2.name); // Alice

        person1.name = "Bob";
        System.out.println(person2.name); // Bob
    }
}