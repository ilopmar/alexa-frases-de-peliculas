package quotes;

public class Quote {
    private String movie;
    private String text;

    public Quote(String movie, String text) {
        this.movie = movie;
        this.text = text;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quote{" +
            "movie='" + movie + '\'' +
            ", text='" + text + '\'' +
            '}';
    }
}
