import java.util.ArrayList;
import java.util.List;

public class MainApplication {
    public static void main(String[] args) {
        List<KarbonAyakizi> carbonFootprints = new ArrayList<>();

        carbonFootprints.add(new Yapi(1000));
        carbonFootprints.add(new Arac(500));
        carbonFootprints.add(new Bisiklet());

        for (KarbonAyakizi cf : carbonFootprints) {
            System.out.println(cf + " - Carbon footprint: " + cf.getKarbonAyakizi() + " kg CO2");
        }
    }
}