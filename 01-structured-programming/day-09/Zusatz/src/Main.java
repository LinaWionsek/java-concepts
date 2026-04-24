import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        var fuhrpark = new ArrayList<KannFahren>(); // fuhrpark: kannFahren[]
        Collections.addAll( // füge an die Liste hinter der Variable 'fuhrpark' folgende Objekt-Referenzen an
                fuhrpark,
                new PKW(),
                new Fahrrad(),
                new Fahrrad(),
                new PKW()
        );

        var mengeFahrräder = 100;

        for (int i = 0; i < mengeFahrräder; i++) { // 100 mal: Füge eine Objekt-Referenz an die Liste hinter der Variable 'fuhrpark'
            fuhrpark.add(new Fahrrad());
        }

        for (KannFahren f : fuhrpark) { // für alle Objekte in 'fuhrpark'
            f.hupen(); // benutze die eigene Implementierung von 'hupen'
        }
    }
}