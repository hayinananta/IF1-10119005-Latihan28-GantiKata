/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini mengganti kata
 */
public class IF110119005Latihan28GantiKata {
        Scanner scanner = new Scanner(System.in);
        
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner(System.in);
       String Kalimat, Ganti, Kata;
       System.out.println("====Program Mengganti Kata====");
       System.out.println("");
       System.out.print("Masukkan Kalimat : ");
       Kalimat = scanner.nextLine();
       System.out.print("Ganti Kata : ");
       Ganti = scanner.nextLine();
       System.out.print("Menjadi Kata : ");
       Kata = scanner.nextLine();
       
       System.out.println("");
       System.out.println("====Hasil Formatting====");
       System.out.println("");
       System.out.println("Kalimat Awal : " + Kalimat);
       System.out.println("Kalimat Akhir : " + Kalimat.replace(Ganti, Kata)); 
    }
    
}
