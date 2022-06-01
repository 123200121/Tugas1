package tugas.praktikum;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        int ulang;
        do{
            System.out.println("Menu Hitung");
            System.out.println("==========");
            System.out.println("1. Menghitung Balok");
            System.out.println("2. Menghitung Tabung");
            System.out.println("0. Keluar");

            System.out.print("Pilih: ");
            int pilih = in.nextInt();

            switch(pilih){
                case 1:
                    double p, l, t;
                    System.out.print("Input Panjang : (p) ");
                    p = in.nextInt();
                    System.out.print("Input Lebar : (l) ");
                    l = in.nextInt();
                    System.out.print("Input Tinggi : (t) ");
                    t = in.nextInt();
                    Balok b = new Balok(p, l, t);

                    System.out.println("Luas Persegi Panjang = " + b.hitungLuas());
                    System.out.println("Keliling Persegi Panjang = " + b.hitungKeliling());
                    System.out.println("Volume Balok = " + b.hitungVolume());
                    System.out.println("Luas Permukaan Balok = " + b.hitungLuasP());
                    break;
                case 2:
                    double r;
                    System.out.print("Input Tinggi: (t) ");
                    t = in.nextInt();
                    System.out.print("Input Jari - jari: (r) ");
                    r = in.nextInt();
                    Tabung tbg = new Tabung(r, t);

                    System.out.println("Luas Lingkaran = " + tbg.hitungLuas());
                    System.out.println("Keliling Lingkaran = " + tbg.hitungKeliling());
                    System.out.println("Volume Tabung = " + tbg.hitungVolume());
                    System.out.println("Luas Permukaan Tabung = " + tbg.hitungLuasP());
            }
            System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
            ulang = in.nextInt();
        }while(ulang == 1);
    }
}
