public class Main {
    public static void main(String[] args) {


        archive archive = new archive(5);

        archive.addFilm(new Film("Harry Potter 1 ", "Chris Columbus", Durum.MEVCUT));
        archive.addFilm(new Film("Harry Potter 2 ", "Chris Columbus", Durum.GOSTERİMDE));
        archive.addFilm(new Film("Harry Potter 3 ", "Chris Columbus", Durum.REZERVE));
        archive.addFilm(new Film("Harry Potter 4 ", "Chris Columbus", Durum.MEVCUT));
        archive.addFilm(new Film("Harry Potter 5 ", "Chris Columbus", Durum.GOSTERİMDE));

        archive.displayFilms();
        archive.findAvailableFilms();
    }
}