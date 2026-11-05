package homeWork;

import java.util.ArrayList;
import java.util.List;

public class manageBudget {

    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>(List.of(159.63, 368.21, 982.44, 3902.99, 1328.41));
        double budget = 3000.53;
        double total = 0;
        int item = 0;

        for (int i = 0; i < prices.size(); i++) {
            if ((total + prices.get(i)) > budget) {
                break;
            }
            total += prices.get(i);
            item = i + 1;
        }
        System.out.printf("Куплено: " + item + " товара на сумму %.2f%n", total);
        System.out.printf("Остаток бюджета: %.2f%n", (budget - total));
        System.out.println("Не куплено: " + (prices.size() - item) + " товара");
    }
}
