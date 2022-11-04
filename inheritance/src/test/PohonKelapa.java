
package test;

import paket7.Pohon;
import paketInterface.MyInterface;

public class PohonKelapa extends Pohon implements MyInterface {

    public PohonKelapa(String jenisBatang, String jenisDaun, String jenisakar, double tinggi){
        super.jenisBatang = jenisBatang;
        super.jenisAkar = jenisDaun;
        super.jenisDaun = jenisDaun;
        super.tinggi = tinggi;
    }
    
    private String stringInfostate() {
        String infoState = "Pohon \nJenis Batang\t: "+jenisBatang
                +"\nJenis Akar\t: "+jenisAkar
                +"\nJenis Daun\t: "+jenisDaun
                +"\nTinggi\t\t: " + tinggi;
        return infoState;
    }
    
    @Override
    public String getStringInfoState() {
        return stringInfostate();
    }  
    
}
