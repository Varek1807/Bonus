public class Main {
    public static void main(String[] args) {
        int balans = 100; // баланс до пополнения счета
        int summa = 100; // сумма пополнения
        int bonus; // начисленно бонусов
        if (summa > 1000) {bonus = summa/100;
        }
        else {bonus = 0;
        }

        System.out.println("Итого баланс = " + (balans + summa + bonus));
    }
}
