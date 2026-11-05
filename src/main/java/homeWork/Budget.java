package homeWork;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    public static void main(String[] args) {
        List<Double> prices = new ArrayList<>(List.of(159.63, 368.21, 982.44, 3902.99, 1328.41));

        double budget = 10000.53;
        double total = 0.00;

        for (int i = 0; i < prices.size(); i++) {
            total += prices.get(i);
        }
        System.out.printf("Общая сумма всех товаров: %.2f%n", total);

        if (budget > total) {
            System.out.printf("Бюджета хватает! Остаток: %.2f%n", (budget - total));
        } else {
            System.out.printf("Бюджета не хватает! Недостаток: %.2f%n", (total - budget));
        }
    }
}
