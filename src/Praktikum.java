public class Praktikum {

    public static void main(String[] args) {
        int money = 500; // Деньги на корм
        int foodPerDay = 100; // Стоимость пачки корма
        int days = 0; // Дни, когда вы сможете покупать корм
        for ( int i = money ; (i - foodPerDay) >= 0 ; i = i - 100 ) {
            days = days + 3;
            System.out.println("На " + days + "-й день останется " + (i - 100) + " рублей.");
        }
        System.out.println("Денег хватит на " + days + " дней.");
    }

}
