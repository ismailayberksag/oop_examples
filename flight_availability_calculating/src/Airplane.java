public class Airplane {
    private static int toplamUcak;
    private int yolcuKapasitesi;
    public static int yakitKullanimOrani;

    public Airplane(){
        this.yolcuKapasitesi = 0;
        toplamUcak++;
    }
    public Airplane(int yolcuKapasitesi){
        this.yolcuKapasitesi = yolcuKapasitesi;
        toplamUcak++;
    }
    public static int getToplamUcak(){
        return toplamUcak;
    }
    public void setToplamUcak(int toplam){
        toplamUcak = toplam;
    }
    public int getYolcuKapasitesi(){
        return yolcuKapasitesi;
    }
    public void setYolcuKapasitesi(int yolcuKapasitesi){
        this.yolcuKapasitesi = yolcuKapasitesi;
    }
    public static int getYakitKullanimOrani(){
        return yakitKullanimOrani;
    }
    public static void setYakitKullanimOrani(int oran){
        yakitKullanimOrani = oran;
    }

    public boolean seferUygunMu(int ucusSure, int biletFiyati, int yakitFiyati) {
        int maaliyet = ucusSure * yakitFiyati * yakitKullanimOrani;
        int eldeEdilecekPara = yolcuKapasitesi * biletFiyati;

        if (maaliyet * (125 / 100)<eldeEdilecekPara) return true;
        else return false;
    }
}
