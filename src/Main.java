public class Main {
    public static void main(String[] args) {

        int ticketPrice = 78; // Стоимость билета
        int rubles = 20; // Количество рублей для бонусной милли

        int bonusMiles = ticketPrice / rubles;
        System.out.println("Бонусных миль начислено: " + bonusMiles);

    }
}
