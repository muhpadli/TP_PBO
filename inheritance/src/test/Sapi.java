
package test;

import paket6.Hewan;
import paketInterface.MyInterface;

public class Sapi extends Hewan implements MyInterface{

    public Sapi(String makanan, int umur, double tinggi){
        super.makanan = makanan;
        super.umur = umur;
        super.tinggi = tinggi;
    }
    
    private String stringInfostate() {
        String infoState = "Sapi\nMakanan\t: "+makanan
                +"\nUmur\t: "+ umur
                +" Tahun \nTinggi\t: "+tinggi;
        return infoState;
    }
    
    @Override
    public String getStringInfoState() {
        return stringInfostate();
    }
    
}
