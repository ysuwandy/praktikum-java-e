package pertemuan.ke2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MahasiswaBeraksiMethod {

    public static void main(String[] args) throws ParseException {
        Mahasiswa mhs2 = new Mahasiswa();
        SimpleDateFormat formatTanggal = new SimpleDateFormat( "dd-mm-yyyy");
        mhs2.nama= " Yuswandy";
        mhs2.tanggalLahir = formatTanggal.parse("01-02-2003");

        mhs2.tampilkanIdentitasDiri();

        System.out.println("Usia "+mhs2.nama+" adalah "+mhs2.hitungUsia()+" Tahun");

        System.out.println(mhs2.hitungakali(7, 9));

        mhs2.SapaNama("Yuswandy");

    }
}
