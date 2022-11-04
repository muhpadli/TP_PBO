
package test;

public class Main {
    public static void main(String[] args){
        //instan objek untuk class Persegi
        Persegi persegi = new Persegi(6);
        persegi.hitungKeliling();
        persegi.hitungLuas();
        System.out.println(persegi.getStringInfoState());
        System.out.println("----------------------------------");
        
        //instan objek untuk class Kotak
        Kotak kotak = new Kotak(8,6,4);
        kotak.hitungVolume();
        kotak.hitungLuasPermukaan();
        System.out.println(kotak.getStringInfoState());
        System.out.println("----------------------------------");
        
        //instan objek untuk class Buku
        Buku buku = new Buku("BK11","Laskar Pelangi", "Andrea Hirata", 2005,"Jaya Abadi" );
        System.out.println(buku.getStringInfoState());
        System.out.println("----------------------------------");
        
        //instan objek untuk class Handphone
        Handphone hp = new Handphone("VIVO", "Gold", 2 );
        System.out.println(hp.getStringInfoState());
        System.out.println("----------------------------------");
        
        //instan objek untuk class Baju
        Baju baju = new Baju("Coklat - Hitam", "Batik", "L" );
        System.out.println(baju.getStringInfoState());
        System.out.println("----------------------------------");
        
        //instan objek untuk class Mobil
        Mobil mobil = new Mobil("Avanza", "Hitam", 275, "DD");
        System.out.println(mobil.getStringInfoState());
        System.out.println("----------------------------------");
        
        //instan objek untuk class Sapi
        Sapi sapi = new Sapi("Rumput Gajah", 3, 1.45);
        System.out.println(sapi.getStringInfoState());
        System.out.println("----------------------------------");
        
        //instan objek untuk class Pohon Kelapa
        PohonKelapa pohon = new PohonKelapa("Berlapis", "serabut", "menjari", 27);
        System.out.println(pohon.getStringInfoState());
        System.out.println("----------------------------------");
        
        //instan objek untuk class Gelang
        Gelang gelang = new Gelang("Gold", "emas", 270000);
        System.out.println(gelang .getStringInfoState());
        System.out.println("----------------------------------");
        
        //instan objek untuk class Meja
        Meja meja= new Meja("Bundar", "Transparan", "Kaca", 2500000);
        System.out.println(meja .getStringInfoState());
        System.out.println("----------------------------------");
    }
}
