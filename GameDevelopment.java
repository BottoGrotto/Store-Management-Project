public class GameDevelopment extends CodingClass {
    private String[] engines;
    private String[] languages;
    

    public GameDevelopment(int classId, double price, String courseName, int duration, Review[] reviews, String[] engines, String[] languages, String description, int pageNumber) {
        super(classId, price, courseName, duration, reviews, description, pageNumber);
        this.engines = engines;
        this.languages = languages;
        this.setFullDescription(this.getDescription() + String.join(", ", this.engines) + ". Languages used: " + String.join(", ", this.languages));
    }
}
