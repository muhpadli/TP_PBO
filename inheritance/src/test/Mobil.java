
package test;

import paket5.Transportasi;
import paketInterface.MyInterface;

public class Mobil extends Transportasi implements MyInterface{
    private String kodePlat;
    
    public Mobil(String merk, String warna, double kecepatan, String kodePlat){
        super.merk = merk;
        super.warna = warna;
        super.kecepatan = kecepatan;
        this.kodePlat = kodePlat;
    }
    
    private String stringInfostate() {
        String infoState = "Mobil \nMerk\t\t: "+merk
                +"\nWarna\t\t: "+warna
                +"\nKecepatan\t: "+kecepatan
                +"\nKode Plat\t: "+kodePlat;
        return infoState;
    }
    
    @Override
    public String getStringInfoState() {
        return stringInfostate();
    }  
    
}
