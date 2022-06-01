package tugas.praktikum;
import java.util.Scanner;

public class KonversiSuhu {

    public static void main(String[] args) {

        boolean kon = true;
        double inputSuhu;
        int pilihMenu;

        konversi suhuCelcius = new konversi();
        Scanner input = new Scanner(System.in);

        System.out.println("KONVERSI SUHU AIR PAK RUSLAN");
        System.out.println("-------------------------");
        System.out.print("Input Suhu Celcius : ");
        inputSuhu = input.nextDouble();
        System.out.println(" ");

        while (kon == true) {
            System.out.println("1. Lihat hasil konversi");
            System.out.println("2. Edit data konversi");
            System.out.println("3. Exit");
            System.out.println("-------------------------");
            System.out.print("Pilih Menu : ");
            pilihMenu = input.nextInt();
            System.out.println("-------------------------");
            switch (pilihMenu) {
                case 1:
                    System.out.println("Reamur = " + suhuCelcius.keReamur(inputSuhu) + "°C");
                    System.out.println("Fahrenheit = " + suhuCelcius.keFahrenheit(inputSuhu) + "°F");
                    System.out.println("Kelvin = " + suhuCelcius.keKelvin(inputSuhu) + "°K");
                    System.out.println( suhuCelcius.kondisiAir(inputSuhu));
                    break;
                case 2:
                    System.out.print("Input Suhu Celcius : ");
                    inputSuhu = input.nextDouble();
                    break;
                case 3:
                    input.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak ada menu");
                    break;
            }
            System.out.println(" ");
        }
    }
}

    class konversi{

        double keReamur(double c){
            return(c * 0.8);
        }
        double keFahrenheit(double c){
            return(c * 1.8 +32);
        }
        double keKelvin(double c){
         return(c + 273);
    }
    String kondisiAir(double kondisi){
        if (kondisi < 0) {
            return("Kondisi Air Beku");
        }
        else if(kondisi > 0 && kondisi < 100) {
            return("Kondisi Air Normal");
        }
        else {
            return("Kondisi Air Mendidih");
        }
    }
}


