public class archive {
    private Film filmler[];
    private int FilmSayisi;

    public archive(int kapasite){
        filmler = new Film[kapasite];
        FilmSayisi = 0;
    }
    public void addFilm(Film film){
        if(FilmSayisi<filmler.length){
            filmler[FilmSayisi++] = film;
            System.out.println("Film Eklendi." + film.getTitle());
        }
        else{
            System.out.println("Film Eklenemedi!");
        }
    }
    public void displayFilms(){
        System.out.println("Filmler : ");
        for (Film film : filmler){
            if(film != null){
                System.out.println(film.getTitle()+ " - " + film.getDirector() + " - " + film.getDurum());
            }
        }
    }
    public void findAvailableFilms(){
        System.out.println("Kullanılabilir Filmler : ");
        for (Film film : filmler){
            if(film != null && film.getDurum() == Durum.MEVCUT){
                System.out.println(film.getTitle() + " - " +film.getDirector() + " - " + film.getDurum());
            }
        }
    }
}
