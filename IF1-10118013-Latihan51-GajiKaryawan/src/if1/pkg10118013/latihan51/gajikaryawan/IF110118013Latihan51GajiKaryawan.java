/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Kelas : IF-01
 * NIM : 10118013
 */
public class IF110118013Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Manager mngr = new Manager();
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : ");mngr.setNik(input.nextLine());
        System.out.print("Masukkan Nama : ");mngr.setNama(input.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) : ");mngr.setGolongan(input.nextInt());
        System.out.print("Masukkan Jabatan (Manager/Kabag) : ");mngr.setJabatan(input.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");mngr.setKehadiran(input.nextInt());
        
        System.out.println("");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("NIK\t: " + mngr.getNik());
        System.out.println("NAMA\t: " + mngr.getNama());
        System.out.println("GOLONGAN: " + mngr.getGolongan());
        System.out.println("JABATAN\t: " + mngr.getJabatan());
        
        System.out.println("");
        System.out.println("TUNJANGAN GOLONGAN\t\t: " + mngr.tunjanganGolongan(mngr.getGolongan()));
        System.out.println("TUNJANGAN JABATAN\t\t: " + mngr.tunjanganJabatan(mngr.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN\t\t: " + mngr.tunjanganKehadiran(mngr.getKehadiran()));
        
        System.out.println("");
        System.out.println("GAJI TOTAL\t\t: " + mngr.gajiTotal());
    }
    
}
