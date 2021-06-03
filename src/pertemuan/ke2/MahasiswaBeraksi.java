package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MahasiswaBeraksi {
    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat( "dd-mm-yyyy");

        Date tglHariIni = new Date();

        mhs.npm = "19630317";
        mhs.nama= "Muhammad Yuswandy";
        mhs.tanggalLahir = formatTanggal.parse("08-05-2001");

        System.out.println("NPM "+mhs.npm);
        System.out.println("NAMA "+mhs.nama);
        System.out.println("TANGGAL LAHIR "+ formatTanggal.format(mhs.tanggalLahir));


        System.out.println("================================================================");

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.npm = "19630000";
        mhs2.nama= " Yuswandy";
        mhs2.tanggalLahir = formatTanggal.parse("01-02-2003");

        System.out.println("NPM "+mhs2.npm);
        System.out.println("NAMA "+mhs2.nama);
        System.out.println("TANGGAL LAHIR "+ formatTanggal.format(mhs2.tanggalLahir));


    }
}
