/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166010_latihan26_waktusaatini;
import java.util.*;
import java.text.*;
/**
 *
 * @author ACER
 * NAMA : Mufida Anggradita
 * KELAS : PBO26
 * NIM : 22166010
 * DESKRIPSI PROGRAM : Waktu Saat ini
 */
public class SI_RegPagi_22166010_Latihan26_WaktuSaatIni {

    public static void main(String[] args) {
        
      Date HariSekarang = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("E, dd.MM.yyyy hh:mm:ss a zzz");

      System.out.println("Hari ini adalah hari: " + ft.format(HariSekarang));
    
    }
    
}

