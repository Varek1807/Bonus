public class Main {
    public static void main(String[] args) {
        int balance = 100; // баланс до пополнения счета
        int amount = 100; // сумма пополнения
        int bonus; // начисленно бонусов
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Итого баланс = " + (balance + amount + bonus));
    }
}
