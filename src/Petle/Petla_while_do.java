package Petle;

public class Petla_while_do {

    public static void main(String[] args) {

        int index = 10;
//        while (index >= 0) {
//            System.out.println(index);
//            index--;
//            if (index == 0) {
//                System.out.println("boooom!");}
//        }

        do {
            if (index > 0) {
                System.out.println(index);
            }
            else {
                System.out.println("KABOOOOOOM");
            }
            index--;
        } while (index >= 0);

    }
}
