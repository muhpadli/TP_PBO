package test;

import paket10.BangunRuang;
import paketInterface.MyInterface;

public class Kotak extends BangunRuang implements MyInterface {
    private double panjang, lebar, tinggi;
    
    public Kotak(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        volume = panjang * lebar * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * ((panjang*lebar)+(lebar * tinggi) + (panjang * tinggi));
        return luasPermukaan;
    }
    
    private String stringInfoState(){
        String infoState = "Kotak\nPanjang\t\t: "+panjang
                +"\nLebar\t\t: "+lebar
                +"\nTinggi\t\t: "+tinggi
                +"\nVolume\t\t: "+volume
                +"\nLuasPermukaan\t: "+luasPermukaan;
        return infoState;
    }

    @Override
    public String getStringInfoState() {
        return stringInfoState();
    }
    
}
