public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп
        int startingAmount = 100;
        int replenishment = 300;

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.
        int bonus = replenishment > 1000 ? (replenishment / 100) : 0;
        int totalAmount = startingAmount + replenishment + bonus;
        System.out.println("Количество бонусных рублей = " + bonus);
        System.out.println("Итоговый счет: " + totalAmount);
    }
}