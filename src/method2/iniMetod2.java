/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method2;

import javax.swing.JOptionPane;

/**
 *
 * @author 62852
 */
public class iniMetod2 {
void method2 (String operasi, double bil1, double bil2){
        double hasil =0;
        
        switch (operasi) {
            case "penjumlahan":
                hasil = bil1 + bil2;
                break;
            case "pengurangan":
                hasil = bil1 - bil2;
                break;
            case "perkalian":
                hasil = bil1 * bil2;
                break;
            case "pembagian":
                if (bil2 != 0) {
                   hasil = bil1 / bil2; 
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Pembagian dengan nol tidak diperbolehkan", "ERROR", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "INPUT-AN TIDAK SESUAI", "ERROR", JOptionPane.ERROR_MESSAGE);
                return;
               
        }
        String txtMessage = " Hasil operasi " + operasi + " dari " + bil1 + " dan " + bil2 + " adalah " + hasil;
        JOptionPane.showMessageDialog(null, txtMessage, "Hasil operasi", JOptionPane.PLAIN_MESSAGE);
    
}
    public static void main(String[] args) {
    Method2 lm = new Method2();
    String operasi = JOptionPane.showInputDialog(null, "Silahkan pilih jenis operasi : \n1. Penjumlahan\n2. Pengurangan\n3. Perkalian\n4. Pembagian ");
    String operasiFix = "";
    switch (operasi) {
        case "1" : operasiFix = "penjumlahan"; break;
        case "2" : operasiFix = "pengurangan"; break;
        case "3" : operasiFix = "perkalian"; break;
        case "4" : operasiFix = "pembagian"; break;
        default: 
            JOptionPane.showMessageDialog(null, "INPUT-AN TIDAK SESUAI", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
    }
    String input1 = JOptionPane.showInputDialog(null, "Masukkan angka pertama : ");
    String input2 = JOptionPane.showInputDialog(null, "Masukkan angka kedua : ");
    try {
        double bil1 = Double.parseDouble(input1);
        double bil2 = Double.parseDouble(input2);
        lm.method2(operasiFix, bil1, bil2);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Input bukan angka!", "ERROR", JOptionPane.ERROR_MESSAGE);
    }

}
}