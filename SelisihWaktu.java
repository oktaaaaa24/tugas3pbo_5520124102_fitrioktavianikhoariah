import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan waktu pertama (HH:MM): ");
        String w1 = sc.nextLine();

        System.out.print("Masukkan waktu kedua (HH:MM): ");
        String w2 = sc.nextLine();

        LocalTime t1 = LocalTime.parse(w1);
        LocalTime t2 = LocalTime.parse(w2);

        Duration selisih = Duration.between(t1, t2);
        long jam = Math.abs(selisih.toHours());
        long menit = Math.abs(selisih.toMinutes() % 60);

        System.out.println("Selisih waktu: " + jam + " jam " + menit + " menit");
    }
}