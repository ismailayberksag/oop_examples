public class kutuphane {
    private kitap[] kitaplar;
    private int kitapSayisi;

    public kutuphane(int kapasite){
        kitaplar = new kitap[kapasite];
        kitapSayisi = 0;
    }

    public void addBook(kitap kitap){
        if(kitapSayisi < kitaplar.length){
            kitaplar[kitapSayisi++] = kitap;
            System.out.println("Kitap eklendi: "+kitap.getTitle());
        }
        else{
            System.out.println("Kütüphane Dolu!");
        }
    }
    public void displayBooks(){
        System.out.println("Kütüphanedeki Kitaplar:");
        for(kitap kitap : kitaplar){
            if(kitap != null){
                System.out.println(kitap.getTitle()+ " - " +kitap.getAuthor() + " - " +kitap.getStatus());
            }
        }
    }
    public void findAvailableBooks(){
        System.out.println("Mevcut Kitaplar:");
        for(kitap kitap : kitaplar){
            if(kitap != null && kitap.getStatus() == KitapDurumu.MEVCUT){
                System.out.println(kitap.getTitle()+ " - " +kitap.getAuthor());
            }
        }
    }
}
