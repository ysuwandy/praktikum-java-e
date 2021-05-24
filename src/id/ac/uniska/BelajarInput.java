package id.ac.uniska;

import javax.swing.*;
import java.util.Scanner;

public class BelajarInput {

    public static void main(String[] args) {

        String namalengkap;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama Lengkap anda : ");
        namalengkap = input.nextLine();

        System.out.println("Nama Lengkap Anda Adalah"+namalengkap);


    }
}
