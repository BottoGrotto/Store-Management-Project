public class CodingClass {
    private int classId;
    private double price;
    private Review[] reviews;
    private String courseName;
    private int duration;

    public CodingClass(int classId, double price, String courseName, int duration, Review[] reviews) {
        this.classId = classId;
        this.price = price;
        this.courseName = courseName;
        this.duration = duration;
        this.reviews = reviews;
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

    public void printReviews() {
        for (int i = 0; i < this.reviews.length; i++) {
            System.out.println(Integer.toString(i) + "." + this.reviews[i]);
        }
    }
}
