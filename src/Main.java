public class Main {

    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int price = 23_000;
        int miles = service.calculate(price);

        System.out.println();
        System.out.println("Цена билета = 23.000 руб.");
        System.out.println("Бонусные мили: " + service.calculate(price = 23_000) + " миль");

        System.out.println();
        System.out.println("Цена билета = 10.000 руб.");
        System.out.println("Бонусные мили: " + service.calculate(price = 10_000) + " миль");

        System.out.println();
        System.out.println("Цена билета = 15.000 руб.");
        System.out.println("Бонусные мили: " + service.calculate(price = 15_000) + " миль");

        System.out.println();
        System.out.println("Цена билета = 19.375 руб.");
        System.out.println("Бонусные мили: " + service.calculate(price = 19_375) + " миль");

        System.out.println();
        System.out.println("Цена билета = 21.296 руб.");
        System.out.println("Бонусные мили: " + service.calculate(price = 21_296) + " миль");
    }
}