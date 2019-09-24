/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author 
 * Nama         : Anindira Dina Fitriani
 * Kelas        : IF11 - K
 * Deskripsi    : Pengaksesan Variabel
 */
public class Latihan5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int jumlahKambing = 88;
        
        //method untuk menampilkan jumlah kambing
        public void getJumlahKambing() {
            System.out.println("Jumlah Kambing: " + jumlahKambing);
        }
        
        public void tambahKambing(){
            jumlahKambing = jumlahKambing +5;
            System.out.println("jumlah kambing setelah ditambah: "+ jumlahKambing);
        }
        
        public static void main(String{} args) {
            KambingGlobal KambingSusu = new KambingGlobal();
            
            //menambahkan satu kambing
            KambingSusu.tambahKambing();
            
            //menampilkan jumlah kambing yang ada
            KambingSusu.getJumlahKambing();
}
    }
    
}
