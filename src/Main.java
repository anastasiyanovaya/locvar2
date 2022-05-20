public class Main {
    public static void main(String[] args) {
        int money = 100; //количество денег на текущем счете
        int cost = 1100; //сумма пополнения
        int bonus = (cost / 100); //количество бонусных рублей
        int sum = money + cost + bonus;
        int sum2 = money + cost;

        if (cost > 1000) {
            System.out.println("Итоговый счёт " + sum + " количество бонусных рублей " + bonus);
        } else {
            System.out.println("Бонусов нет " + "сумма пополнения " + sum2);
        }
    }
}
