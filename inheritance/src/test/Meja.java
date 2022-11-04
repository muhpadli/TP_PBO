
package test;

import paket9.Mebel;
import paketInterface.MyInterface;

public class Meja extends Mebel implements MyInterface{

    public Meja(String bentuk, String warna, String bahan, int harga){
        super.bentuk = bentuk;
        super.warna = warna;
        super.bahan = bahan;
        super.harga = harga;
    }
    
    private String stringInfostate() {
        String infoState = "Meja\nBentuk\t\t: "+bentuk
                +"\nWarna \t\t: "+ warna
                +"\nBahan Pembuat\t: "+bahan
                +"\nHarga\t\t: Rp. "+harga;
        return infoState;
    }
    
    @Override
    public String getStringInfoState() {
        return stringInfostate();
    }
}
