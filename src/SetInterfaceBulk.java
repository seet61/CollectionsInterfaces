import java.util.HashSet;
import java.util.Set;

/**
 * Created by dmitry.arefyev on 08.11.2016.
 */
public class SetInterfaceBulk {
    public static void main(String[] args) {
        Set<String> uniques = new HashSet<String>();
        Set<String> dups = new HashSet<String>();

        for (String a:args) {
            boolean flag = uniques.add(a);
            System.out.println(a + ": " + flag);
            if (!flag) {
                dups.add(a);
            }
        }

        uniques.removeAll(dups);

        System.out.println("Unique words: " + uniques);
        System.out.println("Duplicates words: " + dups);
    }
}
