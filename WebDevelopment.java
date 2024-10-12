public class WebDevelopment extends CodingClass {
    private String[] frameworks;

    public WebDevelopment(int classId, double price, String courseName, int duration, Review[] reviews, String[] frameworks) {
        super(classId, price, courseName, duration, reviews);
        this.frameworks = frameworks;
    }

    public void printDetails() {
        int classId = getClassId();
        String courseName = getCourseName();
        int duration = getDuration();
        double price = getPrice();
        
        // Review[] reviews = getReview;
        System.out.println("~~COURSE INFORMATION~~\n  - Class Id: " + classId + "\n  - Course Name: " + courseName + "\n  - Duration: " + duration + " weeks\n  - Price: " + price);
        System.out.println("Course Description: \nThis course offers an in depth dive into Web Development through the use of frameworks like: " + String.join(", ", this.frameworks));
    }
}
