public class Main {
    public static void main(String[] args) {
        int score = 200;
        int refill = 1200;
        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        }
        else {
            bonus = 0;
        }
        int bonusamount = score + refill + bonus;
        System.out.println("Сумма на счету: " + bonusamount + " рублей, бонус равен: " + bonus + " рублям.");
    }
}
