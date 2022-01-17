public class Main {

    public static void main(String[] args) {

        prostokat prostokat = new prostokat();
        prostokat.nazwaFigury("prostokat");
        System.out.println(prostokat.obwod(5, 6));
        System.out.println(prostokat.pole(2, 6));


        kwadrat kwadrat = new kwadrat();
        kwadrat.nazwaFigury("kwadrat");
        System.out.println(kwadrat.obwod(532, 131));
        System.out.println(kwadrat.pole(113, 56));


        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

    }
}
