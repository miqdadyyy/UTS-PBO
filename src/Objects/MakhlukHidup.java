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
public class MakhlukHidup {

    protected String nama;
    protected int masaHidup;
    protected String makanan;
    protected String caraReproduksi;
    protected boolean status;

    public MakhlukHidup(String nama, int masaHidup, String makanan, String caraReproduksi) {
        this.nama = nama;
        this.masaHidup = masaHidup;
        this.makanan = makanan;
        this.caraReproduksi = caraReproduksi;
        this.status = true;
    }

    public String getNamaMakhlukHidup() {
        return this.nama;
    }

    public int getLamaMasaHidup() {
        return this.masaHidup;
    }

    public void caraReproduksi() {
        System.out.println("Makhluk hidup " + nama + " bereproduksi dengan cara " + caraReproduksi);
    }
    
    public void makanan(){
        System.out.println("Makhluk hidup " + nama + " makan " + makanan);
    }
    
    public void setStatus(boolean status){
        this.status = status;
    }
    
    public String getStatus(){
        if(this.status){
            return "Hidup";
        } else {
            return "Mati";
        }
    }
}
