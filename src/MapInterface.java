import java.util.HashMap;
import java.util.Map;

/**
 * Created by dmitry.arefyev on 08.11.2016.
 */
public class MapInterface {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<String, Integer>();

        //Наполняем таблицу повторяемости из командной строки
        for (String a : args) {
            Integer freq = m.get(a);
            m.put(a, (freq==null) ? 1 : freq+1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}
