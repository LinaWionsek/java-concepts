package entrypoint;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // aus dem Paket "java.util"

        bäckerei.Mitarbeiter bäcker = new bäckerei.Mitarbeiter(); // aus dem Paket "bäckerei"
        konservenfabrik.Mitarbeiter fabrikant = new konservenfabrik.Mitarbeiter(); // aus dem Paket "konservenfabrik"

        System.out.println(bäcker.ofenHitze);
    }
}