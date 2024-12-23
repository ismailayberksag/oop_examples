public class kitap {
    private String title;
    private String author;
    private KitapDurumu status;

    public kitap(String title, String author, KitapDurumu status) {
        this.title = title;
        this.author = author;
        this.status = status;
    }

    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public KitapDurumu getStatus(){
        return status;
    }
}
