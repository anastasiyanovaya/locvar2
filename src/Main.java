public class Main {
    public static void main(String[] args) {
        int money = 100;
        int cost = 1100;
        int bonus = (cost / 100);
        int sum = money + cost + bonus;
        int sum2 = money + cost;

        if (cost > 1000) {
            System.out.println("Итоговый счёт и количество бонусных рублей " + sum);
        } else {
            System.out.println("Бонусов нет " + "сумма пополнения " + sum2);
        }
    }
}
