import Objects.*;
/**
 *
 * @author Miqdad
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Omnivora ayam = new Omnivora("ayam", 1, "bertelur", "berjalan", 2);
        
        ayam.memakanHewan("tikus");
        ayam.tambahMakananYangDimakan("cacing");
        ayam.tambahMakananYangDimakan("biji-bijian");
        
        ayam.daftarMakananYangDimakan();
        ayam.cekStatusHewan();
        ayam.makan();
        
        ayam.caraReproduksi();
        
        ayam.jalan(5);
        
        ayam.tidur();
       
// 
        Hewan pertama = new Hewan("Kucing", 3, "Daging", "Melahirkan", "Berjalan", 4);
        pertama.getStatus();
        pertama.jalan(100);
        pertama.alatGerak();
        
        
        Tumbuhan tumbuhan1 = new Tumbuhan("Melati", 1, "fotosintesis");
        
        tumbuhan1.fotosintesis();
        tumbuhan1.tumbuh(10);
        tumbuhan1.cekTinggiTumbuhan();
        tumbuhan1.cekStatusTumbuhan();
        tumbuhan1.makanan();
        tumbuhan1.cekStatusTumbuhan();
    }
    
}
