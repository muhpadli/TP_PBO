
package test;

import paket2.AlatTulis;
import paketInterface.MyInterface;

public class Buku extends AlatTulis implements MyInterface{
    
    public Buku(String kodeBuku, String judulBuku, String penulis, int tahun, String penerbit){
        super.kodeBuku = kodeBuku;
        super.judulBuku = judulBuku;
        super.penulis = penulis;
        super.tahun = tahun;
        super.penerbit = penerbit;
    }
    
    private String stringInfostate() {
        String infoState = "Buku\nKode Buku\t: "+kodeBuku
                +"\nJudul Buku\t: "+judulBuku
                +"\nPenulis\t\t: "+penulis
                +"\nTahun Terbit\t: "+tahun
                +"\nPenerbit\t: "+penerbit;
        return infoState;
    }
    
    @Override
    public String getStringInfoState() {
        return stringInfostate();
    }  
    
}
