package ProgramTipeDataKarakter;

import java.util.Scanner;

public class Pajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jenis Kelamin Anda: ");
        char jenis_kelamin = input.next().charAt(0);

        System.out.println("jenis kelamin anda: " + jenis_kelamin);
        
        System.out.print("Hitung pajak lagi? (Y/N): ");
        char ulangi = input.next().charAt(0);
        while (ulangi == 'Y' || ulangi == 'y');
        input.close();
    }
}
