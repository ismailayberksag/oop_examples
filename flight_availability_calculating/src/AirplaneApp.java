import java.util.Scanner;
public class AirplaneApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Yakıt kullanım oranı bilgisi
        System.out.println("Yakıt kullanım oranını girin: ");
        Airplane.setYakitKullanimOrani(sc.nextInt());

        while(true){
            //Kullanıcıdan uçak bilgileri alınır
            System.out.println("Yeni bir uçak için yolcu kapasitesini girin: ");
            int kapasite = sc.nextInt();

            Airplane airplane = new Airplane(kapasite);

            //Kullanıcıdan sefer bilgileri alınır
            System.out.println("Uçuş süresini girin (saat): ");
            int ucusSure = sc.nextInt();

            System.out.println("Bilet fiyatını girin:");
            int biletFiyati = sc.nextInt();

            System.out.println("Yakit fiyatını girin: ");
            int yakitFiyati = sc.nextInt();

            //Seferin uygunluk kontrolü
            boolean seferUygunMu = airplane.seferUygunMu(ucusSure, biletFiyati, yakitFiyati);

            if(seferUygunMu) {
                System.out.println("Sefer UYGUN. Kar edilecektir.");
            }
            else{
                System.out.println("Sefer UYGUN DEĞİL. Kar edilemeyecektir.");
                }

            // Yeni uçak girdisi
            System.out.println("Yeni bir uçak bilgisi girmek ister misiniz? (E/H): ");
            char devam = sc.next().charAt(0);
            if(devam == 'H' || devam == 'h') break;
        }
        sc.close();
    }
}
