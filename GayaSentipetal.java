import java.util.Scanner;

public class GayaSentipetal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan massa (kg): ");
        double m = sc.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        double v = sc.nextDouble();

        System.out.print("Masukkan jari-jari (m): ");
        double r = sc.nextDouble();

        double fc = (m * v * v) / r;

        System.out.println("Gaya Sentripetal (Fc) = " + fc + " N");
    }
}