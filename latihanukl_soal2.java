
import java.util.Scanner;
public class latihanukl_soal2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //SOAL 1 DI SOAL SEDANG
        System.out.println("MENGHITUNG FAKTORIAL");
        System.out.print("Masukkan sebuah bilangan: ");
        int n = input.nextInt();

        if (n < 0) {
            System.out.println("Tidak bisa menghitung faktorial bilangan negatif.");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + n + " adalah: " + faktorial);
        }

        //SOAL 2 DI SOAL SEDANG - volume tabung
        System.out.print("\nMasukan jari-jari : ");
        double r = input.nextDouble();
        System.out.print("Masukan tinggi : ");
        double t = input.nextDouble();
        double volume = volumeTabung(r, t);
        System.out.println("Volume tabung adalah : " + volume);
        input.close();
    }

   
    static double volumeTabung(double jariJari, double tinggi) {
        return Math.PI * jariJari * jariJari * tinggi;
    }
}