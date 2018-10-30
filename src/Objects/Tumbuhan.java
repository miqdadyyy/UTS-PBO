/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Miqdad
 */
public class Tumbuhan extends MakhlukHidup{
    
    private int kadarAir;
    private int tinggiTumbuhan;
    
    public Tumbuhan(String nama, int masaHidup, String caraReproduksi) {
        super(nama, masaHidup, "CO2 dan H2O", caraReproduksi);
        this.kadarAir = 0;
        this.tinggiTumbuhan = 20;
    }
    
    public void fotosintesis(){
        kadarAir -= 10;
        System.out.println("Tumbuhan " + nama + " melakukan fotosintesis");
    }
    
    public void siram(){
        kadarAir += 200;
    }
    
    public void cekStatusTumbuhan(){
        System.out.println("Tumbuhan " + nama + " dalam keadaan " + getStatus() + " dengan kadar air" + kadarAir);
    }
    
    public void tumbuh(int tinggi){
        tinggiTumbuhan += tinggi;
    }
    
    public void cekTinggiTumbuhan(){
        System.out.println("Tumbuhan " + nama + " memiliki tinggi " + tinggiTumbuhan + " mm");
    }
}
