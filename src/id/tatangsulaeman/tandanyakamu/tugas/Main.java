/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.tandanyakamu.tugas;
import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan tanda tanda seseorang
 * 
 */
public class Main {
    public static void main( String [] args){
        Scanner inputKeyboard = new Scanner(System.in);
        
        Age dataAge = new Age(2018);
        
        //input tahun lahir
        System.out.print("Masukan Tahun Lahir Anda : ");
        int yearBorn = inputKeyboard.nextInt();
        
        dataAge.setYearBirth(yearBorn);
        
        String outputText = 
                "=====Hasil Perhitungan Umur=====" + "\n" + 
                "Tahun Lahir anda : " + dataAge.getYearBirth() + "\n" +
                "Hari ini tahun : " + dataAge.getYearNow() + "\n" +
                "Umur Kamu Sampai hari ini adalah " + dataAge.hitungUmur() + " Tahun" + "\n" + 
                "Tandanya Kamu " + dataAge.tandanyaKamu(dataAge.hitungUmur()) ;
        System.out.println(outputText);
    }
}
