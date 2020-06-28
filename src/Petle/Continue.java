package Petle;

public class Continue {

    public static void main(String[] args) {

        // tu jest jakas TOTALNA DooooPA --> potrzebuję jakiś logiczny przykłąd

        int index = 10;
        while (index > 0) {
            if (index % 3 == 0) {
                continue;
            }
            if (index == 0) {
                System.out.println(index);
            }
            else  {
                System.out.println("boooom!");}
            }
            index--;

    }
}
