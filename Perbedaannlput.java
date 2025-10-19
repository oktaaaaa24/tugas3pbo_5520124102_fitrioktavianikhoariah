import java.io.*;
import java.util.*;

public class Perbedaannlput {
    public static void main(String[] args) throws IOException {
        // Menggunakan Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama (Scanner): ");
        String nama1 = sc.nextLine();

        // Menggunakan BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan nama (BufferedReader): ");
        String nama2 = br.readLine();

        System.out.println("Nama dari Scanner       : " + nama1);
        System.out.println("Nama dari BufferedReader: " + nama2);
    }
}