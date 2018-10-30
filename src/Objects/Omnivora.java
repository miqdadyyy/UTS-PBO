/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author Miqdad
 */
public class Omnivora extends Hewan{
    
    private ArrayList<String> makananYangDimakan;
    
    public Omnivora(String nama, int masaHidup, String caraReproduksi, String caraBergerak, int jumlahKaki) {
        super(nama, masaHidup, "Daging", caraReproduksi, caraBergerak, jumlahKaki);
        makananYangDimakan = new ArrayList<String>();
    }
    
    public void tambahMakananYangDimakan(String makanan) {
        makananYangDimakan.add(makanan);
    }
    
    public void hapusMakananYangDimakan(String makanan){
        for (int i = 0; i < makananYangDimakan.size(); i++) {
            if (makananYangDimakan.get(i).equals(makanan)) {
                makananYangDimakan.remove(i);
                break;
            }
        }
    }
    
    public boolean apakahMemakanMakanan(String makanan) {
        for (int i = 0; i < makananYangDimakan.size(); i++) {
            if (makananYangDimakan.get(i).equals(makanan)) {
                return true;
            }
        }
        return false;
    }
    
    public void daftarMakananYangDimakan() {
        for (int i = 0; i < makananYangDimakan.size(); i++) {
            System.out.println((i + 1) + ". " + makananYangDimakan.get(i));
        }
    }
    
    public void memakanHewan(String makanan){
        if(apakahMemakanMakanan(makanan)){
            System.out.println("Makanan " + nama + " memakan makanan " + makanan);
        } else{
            System.out.println("Makanan " + nama + " tidak memakan makanan " + makanan);
        }
    }
    
}
