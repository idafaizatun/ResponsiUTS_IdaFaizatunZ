/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTSPBOIda;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args){
        Produk Elektronik = new Elektronik("IPad", 5000000, 2);
        Elektronik.tampilkanInfo();
        System.out.println();
        
        Pegawai PegawaiTetap = new PegawaiTetap("Ida", 9000000, 3000000);
        PegawaiTetap.tampilkanInfo();
        System.out.println();
        
        Produk Makanan = new Makanan("Wafer", 3000, "31 September 2025");
        Makanan.tampilkanInfo();
        System.out.println();
       
        Pegawai PegawaiKontrak = new PegawaiKontrak("Faiza", 5000000, 24);
        PegawaiKontrak.tampilkanInfo();
        System.out.println();
    }
}
