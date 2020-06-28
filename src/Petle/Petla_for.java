package Petle;

public class Petla_for {

    public static void main(String[] args) {
         /*
            int i = 0 - warunek startowy
            i < 5 -- warunek końca
            i++ -- na samym końcu przebiegu pętli zwiększa indeks o 1
             */
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ ": jestem w petli");
//            if (i == 2) {
//                break; //lub return
//            }
        }
        System.out.println("jestem poza petla");

        powerOfNumber(5, 3);
    }

    private static void powerOfNumber(int liczbaKtoraChcemyPodniescDoPotegi, int potega) {
        int result = 1; // liczba do potęgi zerowej
        for (int i = 0; i < potega; i++) {
            result = result * liczbaKtoraChcemyPodniescDoPotegi; // result *= number
        }
        System.out.println(result);
    }
}
