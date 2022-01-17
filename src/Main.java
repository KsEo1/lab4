public class Main {
    public static void main(String[] args) {

        Dom house = new Dom();
        house.setBudynek("testowy");
        house.powierzchnia(120.0);
        house.adresBudynku("Ceynowy 5");
        house.liczbaOkien(15);
        house.liczbaMieszkancow(4);
        house.poleBudynku(3.1, 4.5);
        house.kolorDomu(KolorEnum.gray);

        System.out.println(house.toString());

        System.out.println();

        Budynek house2 = new Dom();
        house2.setBudynek("house_two");
        house2.powierzchnia(40);
        house.adresBudynku("Ceynowy 12");
        house.liczbaOkien(36);
        house.liczbaMieszkancow(3);
        house.poleBudynku(2.2, 3);
        house.kolorDomu(KolorEnum.blue);

        System.out.println(house2.toString());
    }
}




        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */


