public class Review {
    private double stars;
    private String review;

    public Review(double stars, String review) {
        this.stars = stars;
        this.review = review;
    }

    public String getReview() {
        return this.review;
    }

    public double getStars() {
        return this.stars;
    }
}
