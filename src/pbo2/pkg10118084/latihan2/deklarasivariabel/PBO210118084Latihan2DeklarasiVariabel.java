/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan2.deklarasivariabel;

/**
 *
 * @author 
 * Nama  : Divi Adiffia Freza Alana
 * Kelas : PBO2
 * Nim   : 10118084
 * Deskripsi Program : Program ini berisi program untuk menampilkan Deklarasi & pengaksesan Variabel

 */
public class PBO210118084Latihan2DeklarasiVariabel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi variabel
        int nilaiInt;
        final double PHI = 3.14; //konstanta uppercase
        boolean nilaiLogika;
        char nilaiKarakter;
        
        //memberi nilai ke variabel
        nilaiInt = 78;
        nilaiLogika = false;
        nilaiKarakter = 'D';
        
        //menampilkan hasil
        System.out.println("");
        System.out.println("Isi variabel nilai = " + nilaiInt);
        System.out.println("Isi nilai variabel PHI = " +PHI);
        System.out.println("Isi variabel logika = " +nilaiLogika );
        System.out.println("Isi variabel karakter = " +nilaiKarakter);
    }
    
}
