/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan46.tandanyakamu;

/**
 *
 * @author Alfi Nurizkya
 * Nama     : Alfi Nurizkya
 * NIM      : 10119036
 * Kelas    : IF-1
 * Deskripsi Program : Program Menghitung Usia
 */

import java.util.Date;
import java.util.Scanner;
public class Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date date = new Date();
        TandanyaKamu age = new TandanyaKamu(date.getYear());
        System.out.print("Masukkan Tahun Lahir Anda : ");
        age.setYearBirth(scan.nextInt());
        System.out.println("\n======Hasil Perhitungan Umur======");
        System.out.println("Tahun lahir anda : " + age.getYearBirth());
        System.out.println("Hari ini tahun : " + age.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah "+age.hitungUmur()+" tahun");
        System.out.println("Tandanya Kamu "+age.tandanyaKamu(age.hitungUmur()));
    }
}
