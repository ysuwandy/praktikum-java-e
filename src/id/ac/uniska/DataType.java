package id.ac.uniska;

import javax.swing.*;

public class DataType {

    public static void main(String[] args) {
        String namaDepan      = "Muhammad";
        String namaAkhir      = "Yuswandy";
        int usia              = 20;
        int targetTahunKuliah = 4;
        double ipk            = 3.8;
        char nilaiAbjad       = 'A';
        boolean tampan        = true;

        System.out.println("Nama Depan :" + namaDepan);
        System.out.println("Nama Akhir :" + namaAkhir);
        System.out.println("usia :" + usia);
        System.out.println("Target Kuliah :"+ targetTahunKuliah);
        System.out.println("IPK :" + ipk);
        System.out.println("Nilai PBO :" + nilaiAbjad);
        System.out.println("Tampan :" + tampan);

        JOptionPane.showMessageDialog(null, "Halo "+namaDepan+" "+namaAkhir, "Ini Judul", JOptionPane.INFORMATION_MESSAGE );
    }
}
