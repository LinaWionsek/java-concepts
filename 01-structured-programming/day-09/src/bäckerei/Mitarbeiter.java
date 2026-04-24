package bäckerei;

public class Mitarbeiter {
    public int ofenHitze; // public (jeder)
    protected String familienname; // inheritance-private (jeder in der Vererbungsfamilie)
    String zuständigkeit; // package-private (jeder im eigenen Paket)
    private double gehalt; // private (nur die Klasse selbst)
}