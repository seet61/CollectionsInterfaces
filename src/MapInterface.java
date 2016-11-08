import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dmitry.arefyev on 08.11.2016.
 */
public class MapInterface {
    public static void main(String[] args) {
        //HashMap -- not sorted
        //TreeMap - sorted
        Map<String, Integer> m = new TreeMap<String, Integer>();

        //Наполняем таблицу повторяемости из командной строки
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq==null) ? 1 : freq+1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}
