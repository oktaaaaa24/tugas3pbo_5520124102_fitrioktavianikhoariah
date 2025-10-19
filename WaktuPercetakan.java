import java.util.Scanner;

public class WaktuPercetakan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah lembar novel: ");
        int lembar = sc.nextInt();

        int detik = lembar; // 1 lembar/detik
        int hari = detik / 86400;
        int sisa = detik % 86400;
        int jam = sisa / 3600;
        sisa %= 3600;
        int menit = sisa / 60;
        detik = sisa % 60;

        System.out.println("Waktu penyelesaian:");
        System.out.println(hari + " hari " + jam + " jam " + menit + " menit " + detik + " detik");
    }
}