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
public class Hewan extends MakhlukHidup {

    private String caraBergerak;
    private int jumlahKaki;

    public Hewan(String nama, int masaHidup, String makanan, String caraReproduksi, String caraBergerak, int jumlahKaki) {
        super(nama, masaHidup, makanan, caraReproduksi);
        this.caraBergerak = caraBergerak;
        this.jumlahKaki = jumlahKaki;
    }

    public void cekStatusHewan() {
        System.out.println("Hewan " + nama + " dalam keadaan " + getStatus());
    }

    public void tidur() {
        cekStatusHewan();
        setStatus(false);
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
        setStatus(true);
        cekStatusHewan();
    }

    public void jalan(int langkah) {
        System.out.println("Hewan " + nama + " " + caraBergerak + " sebanyak " + langkah + " langkah");
    }

    public void alatGerak() {
        if (jumlahKaki == 0) {
            System.out.println("Hewan " + nama + " bergerak dengan cara " + caraBergerak);
        } else {
            System.out.println("Hewan " + nama + " bergerak " + caraBergerak + " dan memiliki kaki " + jumlahKaki);
        }
    }
    
    public void makan(){
        System.out.println("Hewan " + nama + " sedang memakan " + makanan);
    }

}
