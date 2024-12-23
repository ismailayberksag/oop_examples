public class Film {
    private String title;
    private String director;
    private Durum durum;

    public  Film(String title, String director, Durum durum){
        this.title = title;
        this.director = director;
        this.durum = durum;
    }

    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public Durum getDurum(){
        return durum;
    }
}
