
package test;

import paket8.Aksesoris;
import paketInterface.MyInterface;

public class Gelang extends Aksesoris implements MyInterface{

    public Gelang(String warna, String bahan, int harga){
        super.warna = warna;
        super.bahan = bahan;
        super.harga = harga;
    }
    
    
    private String stringInfostate() {
        String infoState = "Gelang\nWarna\t\t: "+warna
                +"\nBahan Pembuat\t: "+ bahan
                +"\nHarga\t\t: Rp."+harga;
        return infoState;
    }
    
    @Override
    public String getStringInfoState() {
        return stringInfostate();
    }
    
}
