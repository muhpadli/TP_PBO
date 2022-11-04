
package test;

import paket4.Pakaian;
import paketInterface.MyInterface;

public class Baju extends Pakaian implements MyInterface {
    
    public Baju(String warnaBaju, String tipeBaju, String ukuranBaju){
        super.warnaBaju = warnaBaju;
        super.tipeBaju = tipeBaju;
        super.ukuranBaju = ukuranBaju;
    }

    private String stringInfostate() {
        String infoState = "Baju\nTipe\t: "+tipeBaju
                +"\nWarna\t: "+warnaBaju
                +"\nUkuran\t: "+ukuranBaju;
        return infoState;
    }
    
    @Override
    public String getStringInfoState() {
        return stringInfostate();
    } 
}
