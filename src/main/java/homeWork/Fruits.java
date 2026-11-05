package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Fruits {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Яблоко", "Банан", "Апельсин", "Груша", "Киви"));
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + ". " + fruits.get(i));
        }
    }
}
