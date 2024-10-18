public class CodingClass {
    private int classId;
    private double price;
    private Review[] reviews;
    private String courseName;
    private int duration;
    private String description;
    private String fullDescription;
    private int pageNumber;

    public CodingClass(int classId, double price, String courseName, int duration, Review[] reviews, String description, int pageNumber) {
        this.classId = classId;
        this.price = price;
        this.courseName = courseName;
        this.duration = duration;
        this.reviews = reviews;
        this.description = description;
        this.pageNumber = pageNumber;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getClassId() {
        return this.classId;
    }

    public int getDuration() {
        return this.duration;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }
    public String getFullDescription() {
        return this.fullDescription;
    }

    public void setFullDescription(String description) {
        this.fullDescription = "     Course Description: \n         " + description;
    }

    public void printReviews() {
        for (int i = 0; i < this.reviews.length; i++) {
            System.out.println("         " + Integer.toString(i + 1) + ". \n          Stars: " + Double.toString(this.reviews[i].getStars()) + "\n          Review: " + this.reviews[i].getReview());
        }
    }

    public void printDetails() {
        // Review[] reviews = getReview;
        System.out.println("Page 1-" + Integer.toString(this.pageNumber)+ ":\n" + "~~~~~~~ " + this.courseName + " ~~~~~~~");
        System.out.println(this.fullDescription + "\n");

        System.out.println("     Course Information: \n       - Class Id: " + this.classId + "\n       - Course Name: " + this.courseName + "\n       - Duration: " + this.duration + " weeks\n       - Price: " + this.price + "\n");
        System.out.println("     Reviews: ");
        this.printReviews();
    }
}
