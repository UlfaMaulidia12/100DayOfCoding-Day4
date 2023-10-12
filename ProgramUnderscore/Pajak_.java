package ProgramUnderscore;

import java.util.Scanner;

public class Pajak_ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        System.out.println("Angka yang Anda masukkan: " + angka);

            System.out.print("Hitung pajak lagi? (Y/N): ");
        char ulangi = input.next().charAt(0);
        while (ulangi == 'Y' || ulangi == 'y');
        input.close();
    }
}
