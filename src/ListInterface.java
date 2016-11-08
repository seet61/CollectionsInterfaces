import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Делаем выборку для колиства игроков и карт в руку
 * Created by dmitry.arefyev on 08.11.2016.
 */
public class ListInterface {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java ListInterface hands cards");
            return;
        }

        int numHands = Integer.parseInt(args[0]);
        int cardsPerHand = Integer.parseInt(args[1]);

        System.out.println("Рук: " + numHands + ", карт в руке: " + cardsPerHand);

        //Параметры колоды
        String[] suit = new String[] {
                "пики", "червы", "бубны", "трефы"
        };
        String[] rank = new String[] {
                "туз", "2", "3", "4", "5", "6", "7", "8", "9", "10", "валет", "дама", "король"
        };

        //Составляем колоду
        List<String> deck = new ArrayList<String>();
        for (int i=0; i < suit.length; i++) {
            for (int j=0; j < rank.length; j++) {
                deck.add(rank[j] + " " + suit[i]);
            }
        }

        //Мешаем колоду
        Collections.shuffle(deck);

        if (numHands * cardsPerHand > deck.size()) {
            System.out.println("Ошибка: необходимо больше карт чем есть в колоде!");
            return;
        }

        for (int i=0; i<numHands; i++) {
            System.out.println(dealHands(deck, cardsPerHand));
        }

        System.out.println("Осталось карт: " + deck.size());
    }

    public static <E> List<E> dealHands(List<E> deck, int n) {
        int deckSize = deck.size();
        System.out.println("Карт в колоде: " + deck.size());
        List<E> handView = deck.subList(deckSize - n, deckSize);
        List<E> hand = new ArrayList<E>(handView);
        handView.clear();
        return hand;
    }
}
