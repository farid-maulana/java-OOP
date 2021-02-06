package jti.polinema.enkapsulasi;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPeminjaman());

        int menu = 0;
        do {
            System.out.println("\nPilih Menu:");
            System.out.println("1. Pinjam");
            System.out.println("2. Bayar angsuran");
            System.out.println("3. Exit");
            System.out.println("===============================");
            System.out.print(">> ");
            menu = input.nextInt();
            System.out.println("===============================\n");

            switch (menu) {
                case 1:
                    System.out.print("Masukkan jumlah pinjaman: ");
                    int pinjam = input.nextInt();
                    donny.pinjam(pinjam);
                    System.out.println("Jumlah pinjaman saat ini: "
                            + donny.getJumlahPinjaman());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah angsuran: ");
                    int angsur = input.nextInt();
                    donny.angsur(angsur);
                    System.out.println("Jumlah pinjaman saat ini: "
                            + donny.getJumlahPinjaman());
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Pilihan yang Anda masukkan salah");
            }
        } while (menu > 0 && menu <= 3);
    }
}
