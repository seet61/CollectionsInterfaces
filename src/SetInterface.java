import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by dmitry.arefyev on 08.11.2016.
 */
public class SetInterface {
    public static void main(String[] args) {
        Set<String> distinctWords = Arrays.asList(args).stream().collect(Collectors.toSet());
        System.out.println("Stream: " + distinctWords.size() + " distinct words: " + distinctWords);

        Set<String> s = new HashSet<String>();
        for (String a : args) {
            s.add(a);
        }
        System.out.println("For: " + s.size() + " distinct words: " + s);
    }
}
