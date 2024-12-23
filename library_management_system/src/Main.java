public class Main {
    public static void main(String[] args) {

        kutuphane kutuphane = new kutuphane(5);

        kutuphane.addBook(new kitap("Savaş ve Barış", "Lev Tolstoy", KitapDurumu.MEVCUT));
        kutuphane.addBook(new kitap("1984", "George Orwell", KitapDurumu.ODUNC));
        kutuphane.addBook(new kitap("Dönüşüm", "Franz Kafka", KitapDurumu.REZERVE));
        kutuphane.addBook(new kitap("Beyaz Gemi", "Cengiz Aytmatov", KitapDurumu.MEVCUT));
        kutuphane.addBook(new kitap("Suç ve Ceza", "Fyodor Dostoyevski", KitapDurumu.ODUNC));

        kutuphane.displayBooks();
        kutuphane.findAvailableBooks();
    }
}