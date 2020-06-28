package dzien4.Kolekcje;

import java.util.Stack;

public class Stos {
    public static void main(String[] args) {
        Stack<Integer> stos = new Stack<>();
        stos.push(1);
        stos.push(5);
        stos.push(10);

        System.out.println(stos.peek());

        for (Integer elem:stos) {
            System.out.println(elem);
        }

        //push - wrzucam element na sam koniec (dziala tak samo jak add w liście)
        //pop - ściągnięcie elementu ze stosu / usunięcie ostatniego elementu ze stosu
        while (!stos.empty()) {
            System.out.println(stos.pop());
        }
        System.out.println(stos.size());
    }
}
