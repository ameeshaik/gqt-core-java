package com.gqt.corejava.Project;
import java.util.Scanner;
public class QuizGameApp3 {
	 public static final String GREEN = "\u001B[32m";
	    public static final String RED = "\u001B[31m";
	    public static final String PURPLE = "\u001B[35m";
	    public static final String RESET = "\u001B[0m";

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        boolean audienceUsed = false;
	        boolean fiftyFiftyUsed = false;
	        int prize = 0;

	        String answer = "";

	        // Welcome
	        System.out.println("Welcome to the quiz application");

	        // ---------------- Question 1 -------------
	        System.out.println("Q1 :Which planet is known as the Morning Star ?");
	        System.out.println("\nOptions : \n[A]:Mars\n[B]:Venus\n[C]:Jupiter\n[D]:Saturn\n");

	        System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
	        String Knownanswer1 = sc.nextLine();

	        if (Knownanswer1.equals("yes")) {
	            System.out.print("Enter your answer (A/B/C/D): ");
	            answer = sc.nextLine().toUpperCase();
	        } else if (Knownanswer1.equals("no")) {
	            // lifelines for quiz
	            System.out.println("Lifelines ");
	            System.out.println("[1]: Audience Poll");
	            System.out.println("[2]: 50/50");
	            System.out.println("[3]: Quit");
	            System.out.println("Enter the lifeline:");
	            int lifelines = sc.nextInt();
	            sc.nextLine(); // consume newline

	            if (lifelines == 1) {
	                if (!audienceUsed) {
	                    System.out.println("\nAudience Poll: \n[A] 10%\n[B] 75%\n[C] 20%\n[D]: 15%");
	                    System.out.print("Enter your answer: ");
	                    answer = sc.nextLine().toUpperCase();
	                    audienceUsed = true;
	                } else {
	                    System.out.println("Audience Poll already used.");
	                    return;
	                }
	            } else if (lifelines == 2) {
	                if (!fiftyFiftyUsed) {
	                    System.out.println("50/50: [B] Venus and [C] Jupiter");
	                    System.out.print("Enter your answer: ");
	                    answer = sc.nextLine().toUpperCase();
	                    fiftyFiftyUsed = true;
	                } else {
	                    System.out.println("50/50 already used.");
	                    return;
	                }
	            } else if (lifelines == 3) {
	                System.out.println(PURPLE + "Quit the game" + RESET);
	                return;
	            } else {
	                System.out.println("Invalid lifeline choice");
	                return;
	            }
	        } else {
	            System.out.println("Invalid input! Please enter 'yes' or 'no'.");
	            return;
	        }

	        if (answer.equals("B")) {
	        	prize = 10000;
	            System.out.println(GREEN + "Congratulations! Correct answer. You won Rs" +prize + RESET);
	            
	        } else {
	            System.out.println(RED + "Sorry, wrong answer. " + RESET);
	            prize=0;
	            System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
	            return;
	        }
	    
	    }
}
