import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // // // Web Development Class Setup:
        Review[] wDR = {new Review(4.7, "I can't believe that this course exists! It is so well made worth the price."),
                        new Review(4.8, "This is a top tier course that allowed me to get a job at facebook!")};
        String[] frameworks = {"HTML", "CSS", "Javascript"};
        WebDevelopment wDC = new WebDevelopment(234, 1259.99, "Intro to Web Development", 10, wDR, frameworks, "This course offers an in depth dive into Web Development through the use of frameworks like: ", 1);


        // // // Game Development Class Setup:
        Review[] gDR = {new Review(4.5, "Amazing course for beginners! I went from knowing nothing about game development to building my own games in Unity."),
                        new Review(4.9, "Perfect for learning the basics of game dev. I loved starting with Python and Pygame, then moving on to more advanced tools."),
                        new Review(5, "Exceeded my expectations. This course made game development feel accessible and fun, even for a complete beginner.")};
        String[] engines = {"Godot", "Unity", "PyGame", "Unreal Engine"};
        String[] languages = {"Python", "C++", "C#"};
        GameDevelopment gDC = new GameDevelopment(256, 1399.99, "Intro to Game Development", 15, gDR, engines, languages ,"This course teaches you to design, program, and build interactive video games from scratch. You'll learn core concepts like game mechanics, level design, graphics, and sound, while mastering animation, physics, and AI. Engines covered: ", 2);

        int userInput = -1;
        String page1 = " ~~~~~~~ Dev Depot ~~~~~~~ \n    1. Catalog\n    2. About\n    3. Credits";
        String page2 = "Page 1: \n ~~~~~~~ Catalog ~~~~~~~ \n    1. Intro to Web Development\n    2. Game Development";
        String page3 = "Page 2: \n ~~~~~~~ About ~~~~~~~ \n     Creator: Otto Cardoso\n     Project: Unit 2 Store Management Project\n     Date: 10/15/2024 ";
        int currentPage = 1;

        while (userInput != 0) {
            if (currentPage == 1) {
                System.out.println(page1);
                System.out.print("Enter # to go to page or enter 0 to end: ");
            } else if (currentPage == 2) {
                System.out.println(page2);
                System.out.print("Enter # to go to page or enter -1 to go back or 0 to end: ");
            } else if (currentPage == 21) {
                wDC.printDetails();
                System.out.print("Enter -1 to go back or 0 to end: ");
            } else if (currentPage == 22) {
                gDC.printDetails();
                System.out.print("Enter -1 to go back or 0 to end: ");
            } else if (currentPage == 3) {
                System.out.println(page3);
                System.out.print("Enter -1 to go back or 0 to end: ");
            }


            userInput = input.nextInt();
            
            if (currentPage == 1) {
                if (userInput == 1) {
                    currentPage = 2;
                } else if (userInput == 2) {
                    currentPage = 3;
                }
            } else if (currentPage == 2) {
                if (userInput == -1) {
                    currentPage = 1;
                } else if (userInput == 1) {
                    currentPage = 21;
                } else if (userInput == 2) {
                    currentPage = 22;
                }
            } else if (currentPage == 21 || currentPage == 22) {
                if (userInput == -1) {
                    currentPage = 2;
                }
            } else if (currentPage == 3) {
                if (userInput == -1) {
                    currentPage = 1;
                }
            }
            


            
            
            

            
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        input.close();
    }

}