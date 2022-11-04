
package test;

import paket1.BangunDatar;
import paketInterface.MyInterface;

public class Persegi extends BangunDatar implements MyInterface{
    //deklarasi field
    private double sisi;
    
    public Persegi(double sisi){
        this.sisi = sisi;
    }

    @Override
    public double hitungLuas() {
        luas = Math.pow(sisi,2);
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = sisi* 4;
        return keliling;
    }
    
    private String stringInfoState(){
        String infoState = "Persegi\nSisi\t: "+sisi
                +"\nluas\t: "+luas
                +"\nKeliling: "+keliling;
        return infoState;
    }
    
    @Override
    public String getStringInfoState() {
        return stringInfoState();
    }

    
}
