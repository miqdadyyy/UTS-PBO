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
public class Herbivora extends Hewan{
    
    private ArrayList<String> tumbuhanYangDimakan;
    
    public Herbivora(String nama, int masaHidup, String caraReproduksi, String caraBergerak, int jumlahKaki) {
        super(nama, masaHidup, "Tumbuhan", caraReproduksi, caraBergerak, jumlahKaki);
        tumbuhanYangDimakan = new ArrayList<String>();
    }
    
    public void tambahTumbuhanYangDimakan(String tumbuhan) {
        tumbuhanYangDimakan.add(tumbuhan);
    }
    
    public void hapusTumbuhanYangDimakan(String tumbuhan){
        for (int i = 0; i < tumbuhanYangDimakan.size(); i++) {
            if (tumbuhanYangDimakan.get(i).equals(tumbuhan)) {
                tumbuhanYangDimakan.remove(i);
                break;
            }
        }
    }
    
    public boolean apakahMemakanTumbuhan(String tumbuhan) {
        for (int i = 0; i < tumbuhanYangDimakan.size(); i++) {
            if (tumbuhanYangDimakan.get(i).equals(tumbuhan)) {
                return true;
            }
        }
        return false;
    }
    
    public void daftarTumbuhanYangDimakan() {
        for (int i = 0; i < tumbuhanYangDimakan.size(); i++) {
            System.out.println((i + 1) + ". " + tumbuhanYangDimakan.get(i));
        }
    }
    
    public void memakanHewan(String tumbuhan){
        if(apakahMemakanTumbuhan(tumbuhan)){
            System.out.println("Tumbuhan " + nama + " memakan tumbuhan " + tumbuhan);
        } else{
            System.out.println("Tumbuhan " + nama + " tidak memakan tumbuhan " + tumbuhan);
        }
    }
    
}
