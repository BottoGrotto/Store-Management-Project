import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Review[] wBR = {new Review(4.7, "I can't believe that this course exists! It is so well made worth the price."),
                        new Review(4.8, "This is a top tier course that allowed me to get a job at facebook!")};
        String[] frameworks = {"HTML", "CSS", "Javascript"};
        WebDevelopment wDC = new WebDevelopment(234, 1259.99, "Intro To Web Development", 10, wBR, frameworks);
    }

}