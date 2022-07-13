public class main {
    public static void main(String[] args) {

        int account = 100; // начальный счет
        int add = 1000; // сумма пополнения
        int bonus = add/100; // бонус за каждые полные 100 рублей пополнения


        System.out.println("Итоговая сумма на счету:");
        if (add >= 1000) System.out.println( account + add+ bonus );
        else System.out.println(account + add);

        System.out.println("Бонусных баллов:");
        if (add >= 1000) System.out.println(bonus );
        else System.out.println("Бонусов нет");


    }
}