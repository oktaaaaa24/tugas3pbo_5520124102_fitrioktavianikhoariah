import java.io.*;

public class Tugas2 {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(System.in);
        DataOutputStream out = new DataOutputStream(System.out);

        System.out.print("Nama: ");
        String nama = in.readLine();

        System.out.print("Total Belanja: ");
        double totalBelanja = Double.parseDouble(in.readLine());

        System.out.print("Diskon (%): ");
        double diskon = Double.parseDouble(in.readLine());

        double total = totalBelanja - (totalBelanja * diskon / 100);

        System.out.print("Bayar: ");
        double bayar = Double.parseDouble(in.readLine());

        double kembalian = bayar - total;

        out.writeBytes("\n=== STRUK PEMBELANJAAN ===\n");
        out.writeBytes("Nama        : " + nama + "\n");
        out.writeBytes("Total Belanja: " + totalBelanja + "\n");
        out.writeBytes("Diskon (%)  : " + diskon + "\n");
        out.writeBytes("Total       : " + total + "\n");
        out.writeBytes("Bayar       : " + bayar + "\n");
        out.writeBytes("Kembalian   : " + kembalian + "\n");
    }
}