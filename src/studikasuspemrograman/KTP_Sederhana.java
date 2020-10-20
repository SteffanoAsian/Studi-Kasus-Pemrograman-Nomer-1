/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasuspemrograman;

import java.util.Scanner;

/**
 *
 * @author MADCOMS
 */
public class KTP_Sederhana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi Variabel
        String Nama, Alamat, TTL, JenisKelamin, Agama, Pekerjaan, Kewarganegaraan;
        int NIK;
        
        //Membuat Scanner
        Scanner ktp = new Scanner (System.in);
         
         //tampilan output
         System.out.println("<<Input Data Anda>>");
         System.out.print("NIK :");
         NIK = ktp.nextInt();
         System.out.print("Nama Lengkap :");         
         Nama = ktp.nextLine();
         System.out.print("Tempat/Tanggal Lahir:");
         TTL = ktp.nextLine();
         System.out.print("Jenis Kelamin :");
         JenisKelamin = ktp.nextLine();
         System.out.print("Alamat :");
         Alamat = ktp.nextLine();
         System.out.print("Agama :");
         Agama = ktp.nextLine();
         System.out.print("Kewarganegaraan :");
         Kewarganegaraan = ktp.nextLine();
         System.out.print("Pekerjaan :");
         Pekerjaan = ktp.nextLine();
         
         //Menampilkan Output
         System.out.println("KARTU TANDA PENDUDUK");
         System.out.println("NIK : "+NIK);
         System.out.println("Nama : "+Nama);
         System.out.println("Tempat/Tanggal Lahir: "+TTL);
         System.out.println("Jenis Kelamin: "+JenisKelamin);
         System.out.println("Alamat : "+Alamat);
         System.out.println("Agama : "+Agama);
         System.out.println("Kewarganegaraan : "+Kewarganegaraan);
         System.out.println("Pekerjaan :"+Pekerjaan);
    }
}
