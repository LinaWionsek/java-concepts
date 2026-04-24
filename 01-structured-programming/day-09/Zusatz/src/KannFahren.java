public interface KannFahren {
    public void fahren();

    default public void hupen() {
        System.out.println("Tuuuut!");
    }
}
