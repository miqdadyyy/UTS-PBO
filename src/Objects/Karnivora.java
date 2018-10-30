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
public class Karnivora extends Hewan {
    
    private ArrayList<String> hewanYangDimakan;
    
    public Karnivora(String nama, int masaHidup, String caraReproduksi, String caraBergerak, int jumlahKaki) {
        super(nama, masaHidup, "Daging dan Tumbuhan", caraReproduksi, caraBergerak, jumlahKaki);
        hewanYangDimakan = new ArrayList<String>();
    }
    
    public void tambahHewanYangDimakan(String hewan) {
        hewanYangDimakan.add(hewan);
    }
    
    public void hapusHewanYangDimakan(String hewan){
        for (int i = 0; i < hewanYangDimakan.size(); i++) {
            if (hewanYangDimakan.get(i).equals(hewan)) {
                hewanYangDimakan.remove(i);
                break;
            }
        }
    }
    
    public boolean apakahMemakanHewan(String hewan) {
        for (int i = 0; i < hewanYangDimakan.size(); i++) {
            if (hewanYangDimakan.get(i).equals(hewan)) {
                return true;
            }
        }
        return false;
    }
    
    public void daftarHewanYangDiburu() {
        for (int i = 0; i < hewanYangDimakan.size(); i++) {
            System.out.println((i + 1) + ". " + hewanYangDimakan.get(i));
        }
    }
    
    public void memakanHewan(String hewan){
        if(apakahMemakanHewan(hewan)){
            System.out.println("Hewan " + nama + " memakan hewan " + hewan);
        } else{
            System.out.println("Hewan " + nama + " tidak memakan hewan " + hewan);
        }
    }
    
}
