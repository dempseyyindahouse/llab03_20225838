package disc;

public class DigitalVideoDisc {
    private static int nbDigitalVideoDiscs = 0;
    private int id;
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    // Constructor full
    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0f);
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this(title, category, null, 0, cost);
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this(title, category, director, 0, cost);
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    // In thông tin DVD
    @Override
    public String toString() {
        return "DVD - " + this.title + " - " + this.category + " - " 
                + this.director + " - " + this.length + " minutes: " 
                + this.cost + "$";
    }

    // Kiểm tra tiêu đề
    public boolean isMatch(String title) {
        return this.title != null && this.title.equalsIgnoreCase(title);
    }
}
