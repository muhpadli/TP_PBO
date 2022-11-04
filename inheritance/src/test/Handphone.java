
package test;

import paket3.Gadget;
import paketInterface.MyInterface;

public class Handphone extends Gadget implements MyInterface{
    private int kapasitasRam;
    
    public Handphone(String merk, String warna, int kapasitasRam){
        super.merk = merk;
        super.warna = warna;
        this.kapasitasRam = kapasitasRam;
    }
    
    private String stringInfostate() {
        String infoState = "Handphone\nMerk\t\t: " + merk
                +"\nWarna \t\t: "+ warna
                +"\nKapasitas RAM\t: "+kapasitasRam+" GB";
        return infoState;
    }
    
    @Override
    public String getStringInfoState() {
        return stringInfostate();
    }
    
}
