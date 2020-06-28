package Petle;

public class Petla_while {

    public static void main(String[] args) {

        int index = 0;
        while (index < 3) {
            System.out.println(index);
            index++;
        }

        int index2 = 10;
        while (index2 > 0) {
            System.out.println(index2);
            index2--;
        }

        int index3 = 10;
        while (index3 > 0) {
            System.out.println(index3);
            index3--;
            if (index3 == 0) {
                System.out.println("boooom!");}

        }

    }
}
