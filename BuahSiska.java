import java.io.*;

public class BuahSiska {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int mangga = 70;
        int jambuPerTetangga = 30;
        int jumlahTetangga = 4;
        int manggaBusuk = 15;

        int totalJambu = jambuPerTetangga * jumlahTetangga;
        int totalBuah = (mangga - manggaBusuk) + totalJambu;

        System.out.println("Total buah mangga bagus : " + (mangga - manggaBusuk));
        System.out.println("Total buah jambu        : " + totalJambu);
        System.out.println("Total seluruh buah      : " + totalBuah);
    }
}