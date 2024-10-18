public class WebDevelopment extends CodingClass {
    private String[] frameworks;
    

    public WebDevelopment(int classId, double price, String courseName, int duration, Review[] reviews, String[] frameworks, String description, int pageNumber) {
        super(classId, price, courseName, duration, reviews, description, pageNumber);
        this.frameworks = frameworks;
        this.setFullDescription(this.getDescription() + String.join(", ", this.frameworks));
    }
}
