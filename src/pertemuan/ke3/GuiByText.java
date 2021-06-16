package pertemuan.ke3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiByText extends JFrame {

    JLabel label1            = new JLabel("Nama Lengkap");
    JTextField textField     = new JTextField();
    JButton tombol           = new JButton("Greet");

    JLabel panjang           = new JLabel("Panjang");
    JLabel lebar             = new JLabel("Lebar");
    JLabel hasil             = new JLabel("Hasil");

    JTextField inputPanjang  = new JTextField();
    JTextField inputLebar    = new JTextField();
    JTextField tfHasil       = new JTextField();
    JButton btnHitung        = new JButton("Hitung Luas");

    GuiByText(){
        setSize(640,480);
        setLocationRelativeTo(null);
        setTitle("Gui By Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void letakkanKomponen() {
        getContentPane().setLayout(null);
        getContentPane().add(label1);
        getContentPane().add(textField);
        getContentPane().add(tombol);

        label1.setBounds(16, 32, 100, 25);
        textField.setBounds(124, 32, 300, 25);
        tombol.setBounds(232, 32, 200, 25);

        getContentPane().add(panjang);
        getContentPane().add(lebar);
        getContentPane().add(hasil);
        getContentPane().add(inputPanjang);
        getContentPane().add(inputLebar);
        getContentPane().add(tfHasil);
        getContentPane().add(btnHitung);

        panjang.setBounds(16, 80, 100, 25);
        inputPanjang.setBounds(124, 80, 100, 25);

        lebar.setBounds(16, 113, 100, 25);
        inputLebar.setBounds(124, 113, 100, 25);

        btnHitung.setBounds(16, 146, 208, 25);

        hasil.setBounds(16, 179, 100, 25);
        tfHasil.setBounds(124, 179, 100, 25);

    }
    void hitungLuas ()
    {
        btnHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int panjang = Integer.parseInt(inputPanjang.getText());
                int lebar = Integer.parseInt(inputLebar.getText());

                int hasil = panjang * lebar;
                String luas = String.valueOf(hasil);

                tfHasil.setText(luas);
            }
        });
    }

    void klikTombol()
    {
        tombol.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama =  textField.getText();
                JOptionPane.showMessageDialog(null, "Hai "+ nama);
            }
        });
    }


    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.letakkanKomponen();
        guiByText.setVisible(true);
        guiByText.klikTombol();
        guiByText.hitungLuas();
    }
}
