package com.gqt.corejava.Project;
import java.util.Scanner;

public class QuizGameApp2 {
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

        // ---------------- Question 2 -------------
        System.out.println("Q2 :Who developed the theory of relativity?");
        System.out.println("\nOptions: \n[A]:Isaac Newton\n[B]:Albert Einstein\n[C]:Nikola Tesla\n[D]:Stephen Hawking");

        System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
        String Knownanswer2 = sc.nextLine();

        if (Knownanswer2.equals("yes")) {
            System.out.print("Enter your answer (A/B/C/D): ");
            answer = sc.nextLine().toUpperCase();
        } else if (Knownanswer2.equals("no")) {
            System.out.println("Lifelines ");
            System.out.println("[1]: Audience Poll");
            System.out.println("[2]: 50/50");
            System.out.println("[3]: Quit");
            System.out.println("Enter the lifeline:");
            int lifelines = sc.nextInt();
            sc.nextLine(); // consume newline

            if (lifelines == 1) {
                if (!audienceUsed) {
                    System.out.println("Audience Poll: [A] 5% [B] 90% [C] 3% [D]: 2%");
                    answer = sc.nextLine().toUpperCase();
                    System.out.print("Enter your answer: ");
                    
                    audienceUsed = true;
                } else {
                    System.out.println("Audience Poll already used.");
                    System.out.print("Enter your answer (A/B/C/D): ");
                    answer = sc.nextLine().toUpperCase();
                   
                }
            } else if (lifelines == 2) {
                if (!fiftyFiftyUsed) {
                    System.out.println("50/50: [B] Albert Einstein and [D] Stephen Hawking");
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
        	prize = 20000;
            System.out.println(GREEN + "Congratulations! Correct answer. You won Rs 20000"  + RESET);
            
        } else {
        	
            System.out.println(RED + "Sorry, wrong answer. You go home with Rs. 0" + RESET);
            prize=0;
            System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
            
            return;
        }

        // ---------------- Question 3 -------------
        System.out.println("Q3 :Which gas do plants absorb from the atmosphere?");
        System.out.println("\nOptions: \n[A]: Oxygen\n[B]: Nitrogen\n[C]: Carbon Dioxide\n[D]: Hydrogen");

        System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
        String Knownanswer3 = sc.nextLine();

        if (Knownanswer3.equals("yes")) {
            System.out.print("Enter your answer (A/B/C/D): ");
            answer = sc.nextLine().toUpperCase();
        } else if (Knownanswer3.equals("no")) {
            System.out.println("Lifelines ");
            System.out.println("[1]: Audience Poll");
            System.out.println("[2]: 50/50");
            System.out.println("[3]: Quit");
            System.out.println("Enter the lifeline:");
            int lifelines = sc.nextInt();
            sc.nextLine(); // consume newline

            if (lifelines == 1) {
                if (!audienceUsed) {
                    System.out.println("Audience Poll: [A] 10% [B] 5% [C] 80% [D]: 5%");
                    System.out.print("Enter your answer: ");
                    answer = sc.nextLine().toUpperCase();
                    audienceUsed = true;
                } else {
                    System.out.println("Audience Poll already used.");
                    System.out.print("Enter your answer (A/B/C/D): ");
                    answer = sc.nextLine().toUpperCase();
                    
                }
            } else if (lifelines == 2) {
                if (!fiftyFiftyUsed) {
                    System.out.println("50/50: [C] Carbon Dioxide and [D] Hydrogen");
                    System.out.print("Enter your answer: ");
                    
                    fiftyFiftyUsed = true;
                } else {
                    System.out.println("50/50 already used.");
                    System.out.print("Enter your answer (A/B/C/D): ");
                    answer = sc.nextLine().toUpperCase();
                    
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

        if (answer.equals("C")) {
        	prize = 30000;
            System.out.println(GREEN + "Congratulations! Correct answer. You won 30000" + RESET);
            
        } else {
            System.out.println(RED + "Sorry, wrong answer. You go home with Rs. 0" + RESET);
            prize=0;
            System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
            

        }

 // ---------------- Question 4 -------------
    System.out.println("Q4 :What is the boiling point of water at sea level?");
    System.out.println("\nOptions: \n[A]:100°C\n[B]:90°C\n[C]:120°C\n[D]:80°C");

    System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
    String Knownanswer4 = sc.nextLine();

    if (Knownanswer4.equals("yes")) {
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = sc.nextLine().toUpperCase();
    } else if (Knownanswer4.equals("no")) {
        System.out.println("Lifelines ");
        System.out.println("[1]: Audience Poll");
        System.out.println("[2]: 50/50");
        System.out.println("[3]: Quit");
        System.out.println("Enter the lifeline:");
        int lifelines = sc.nextInt();
        sc.nextLine();

        if (lifelines == 1) {
            if (!audienceUsed) {
                System.out.println("Audience Poll: [A] 90% [B] 5% [C] 2% [D]: 3%");
                System.out.print("Enter your answer: ");
                answer = sc.nextLine().toUpperCase();
                answer = sc.nextLine().toUpperCase();
                audienceUsed = true;
            } else {
                System.out.println("Audience Poll already used.");
                System.out.print("Enter your answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase();
               
            }
        } else if (lifelines == 2) {
            if (!fiftyFiftyUsed) {
                System.out.println("50/50: [A] 100°C and [B] 90°C");
                System.out.print("Enter your answer: ");
                
                fiftyFiftyUsed = true;
            } else {
                System.out.println("50/50 already used.");
                System.out.print("Enter your answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase();
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

    if (answer.equals("A")) {
    	prize = 40000;
        System.out.println(GREEN + "Congratulations! Correct answer. You won Rs 40000" + prize + RESET);
        
    } else {
        System.out.println(RED + "Sorry, wrong answer. You go home with Rs. 0" + RESET);
        prize=0;
        System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
        
        return;
    }

    // ---------------- Question 5 -------------
    System.out.println("Q5 :Who is known as the father of computers?");
    System.out.println("\nOptions: \n[A]:Charles Babbage\n[B]:Alan Turing\n[C]:Bill Gates\n[D]:Steve Jobs");

    System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
    String Knownanswer5 = sc.nextLine();

    if (Knownanswer5.equals("yes")) {
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = sc.nextLine().toUpperCase();
    } else if (Knownanswer5.equals("no")) {
        System.out.println("Lifelines ");
        System.out.println("[1]: Audience Poll");
        System.out.println("[2]: 50/50");
        System.out.println("[3]: Quit");
        System.out.println("Enter the lifeline:");
        int lifelines = sc.nextInt();
        sc.nextLine();

        if (lifelines == 1) {
            if (!audienceUsed) {
                System.out.println("Audience Poll: [A] 85% [B] 5% [C] 5% [D]: 5%");
                System.out.print("Enter your answer: ");
                answer = sc.nextLine().toUpperCase();
                
                audienceUsed = true;
            } else {
                System.out.println("Audience Poll already used.");
                System.out.print("Enter your answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase();
            }
        } else if (lifelines == 2) {
            if (!fiftyFiftyUsed) {
                System.out.println("50/50: [A] Charles Babbage and [C] Bill Gates");
                System.out.print("Enter your answer: ");
                
                fiftyFiftyUsed = true;
            } else {
                System.out.println("50/50 already used.");
                System.out.print("Enter your answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase();
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

    if (answer.equals("A")) {
        prize = 50000;
        System.out.println(GREEN + "Congratulations! Correct answer. You won Rs 50000 " + prize + RESET);
    } else {
        System.out.println(RED + "Sorry, wrong answer. You go home with Rs. 0" + RESET);
        prize=0;
        System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
        
        return;
    }

        
 // ---------------- Question 6 -------------
    System.out.println("Q6 :Which programming language is known for its use in data science?");
    System.out.println("\nOptions:\n[A]:Java\n[B]:Python\n[C]:C#\n[D]:Ruby");
   
    System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
    String Knownanswer6 = sc.nextLine();

    if (Knownanswer6.equals("yes")) {
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = sc.nextLine().toUpperCase();
    } else if (Knownanswer6.equals("no")) {
        System.out.println("Lifelines ");
        System.out.println("[1]: Audience Poll");
        System.out.println("[2]: 50/50");
        System.out.println("[3]: Quit");
        System.out.println("Enter the lifeline:");
        int lifelines = sc.nextInt();
        sc.nextLine();

        if (lifelines == 1) {
            if (!audienceUsed) {
                System.out.println("Audience Poll: [A] 25% [B] 85% [C] 5% [D]: 5%");
                System.out.print("Enter your answer: ");
                answer = sc.nextLine().toUpperCase();
                audienceUsed = true;
            } else {
                System.out.println("Audience Poll already used.");
                System.out.print("Enter your answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase();
            }
        } else if (lifelines == 2) {
            if (!fiftyFiftyUsed) {
                System.out.println("50/50: [B] Python and [D] Ruby");
                System.out.print("Enter your answer: ");
                answer = sc.nextLine().toUpperCase();
                fiftyFiftyUsed = true;
            } else {
                System.out.println("50/50 already used.");
               
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
        prize = 60000;
        System.out.println(GREEN + "Congratulations! Correct answer. You won Rs 60000 " + prize + RESET);
    } else {
        System.out.println(RED + "Sorry, wrong answer. " + RESET);
        prize=50000;
        System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
        
        return;
    }

    

 // ---------------- Question 7 -------------
    System.out.println("Q7 :What is the capital of Japan?");
    System.out.println("\nOptions: \n[A]:Seoul\n[B]:Tokyo\n[C]:Beijing\n[D]:Bangkok");
   
    System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
    String Knownanswer7 = sc.nextLine();

    if (Knownanswer7.equals("yes")) {
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = sc.nextLine().toUpperCase();
    } else if (Knownanswer7.equals("no")) {
        System.out.println("Lifelines ");
        System.out.println("[1]: Audience Poll");
        System.out.println("[2]: 50/50");
        System.out.println("[3]: Quit");
        System.out.println("Enter the lifeline:");
        int lifelines = sc.nextInt();
        sc.nextLine();

        if (lifelines == 1) {
            if (!audienceUsed) {
                System.out.println("Audience Poll: [A] 25% [B] 85% [C] 5% [D]: 5%");
                System.out.print("Enter your answer: ");
                answer = sc.nextLine().toUpperCase();
                audienceUsed = true;
            } else {
                System.out.println("Audience Poll already used.");
                System.out.print("Enter your answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase();
            }
        } else if (lifelines == 2) {
            if (!fiftyFiftyUsed) {
                System.out.println("50/50: [B] Tokyo and [C]Beijing ");
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
        prize = 70000;
        System.out.println(GREEN + "Congratulations! Correct answer. You won Rs 70000" + prize + RESET);
    } else {
        System.out.println(RED + "Sorry, wrong answer. " + RESET);
        prize=50000;
        System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
        
        return;
    }

    
 // ---------------- Question 8 -------------
    System.out.println("Q8 :Which element has the chemical symbol 'O'?");
    System.out.println("\nOptions: \n[A]:Gold\n[B]:Osmium\n[C]:Oxygen\n[D]:Ozone");
    
    System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
    String Knownanswer8 = sc.nextLine();

    if (Knownanswer8.equals("yes")) {
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = sc.nextLine().toUpperCase();
    } else if (Knownanswer8.equals("no")) {
        System.out.println("Lifelines ");
        System.out.println("[1]: Audience Poll");
        System.out.println("[2]: 50/50");
        System.out.println("[3]: Quit");
        System.out.println("Enter the lifeline:");
        int lifelines = sc.nextInt();
        sc.nextLine();

        if (lifelines == 1) {
            if (!audienceUsed) {
                System.out.println("Audience Poll: [A] 15% [B] 5% [C] 75% [D]: 5%");
                System.out.print("Enter your answer: ");
                answer = sc.nextLine().toUpperCase();
                audienceUsed = true;
            } else {
                System.out.println("Audience Poll already used.");
                System.out.print("Enter your answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase();
            }
        } else if (lifelines == 2) {
            if (!fiftyFiftyUsed) {
                System.out.println("50/50: [A]Osmium  and [C]Oxygen ");
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

    if (answer.equals("C")) {
        prize = 80000;
        System.out.println(GREEN + "Congratulations! Correct answer. You won Rs 80000 " + prize + RESET);
    } else {
        System.out.println(RED + "Sorry, wrong answer. " + RESET);
        prize=70000;
        System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
        
        return;
    }

    
 
 // ---------------- Question 9 -------------
    System.out.println("Q9 :How many bones are in the adult human body?");
    System.out.println("\nOptions: \n[A]:206\n[B]:210\n[C]:205\n[D]:201");
   
    System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
    String Knownanswer9 = sc.nextLine();

    if (Knownanswer9.equals("yes")) {
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = sc.nextLine().toUpperCase();
    } else if (Knownanswer9.equals("no")) {
        System.out.println("Lifelines ");
        System.out.println("[1]: Audience Poll");
        System.out.println("[2]: 50/50");
        System.out.println("[3]: Quit");
        System.out.println("Enter the lifeline:");
        int lifelines = sc.nextInt();
        sc.nextLine();

        if (lifelines == 1) {
            if (!audienceUsed) {
                System.out.println("Audience Poll: [A] 85% [B] 5% [C] 5% [D]: 5%");
                System.out.print("Enter your answer: ");
                answer = sc.nextLine().toUpperCase();
                audienceUsed = true;
            } else {
                System.out.println("Audience Poll already used.");
                System.out.print("Enter your answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase();
            }
        } else if (lifelines == 2) {
            if (!fiftyFiftyUsed) {
                System.out.println("50/50: [A]206  and [C] 205");
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

    if (answer.equals("A")) {
        prize = 90000;
        System.out.println(GREEN + "Congratulations! Correct answer. You won Rs 90000 " + prize + RESET);
    } else {
        System.out.println(RED + "Sorry, wrong answer. " + RESET);
        prize=70000;
        System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
        
        return;
    }

    

 // ---------------- Question 10 -------------
    System.out.println("Q10 :What does CPU stand for?");
    System.out.println("\nOptions: \n[A] Central Program Unit\n[B]Control Process Unit\n[C]Central Processing Unit\n[D]Computer Primary Unit");

    System.out.println("Enter 'yes' if you know the answer or 'no' to use lifelines");
    String Knownanswer10 = sc.nextLine();

    if (Knownanswer10.equals("yes")) {
        System.out.print("Enter your answer (A/B/C/D): ");
        answer = sc.nextLine().toUpperCase();
        
    } else if (Knownanswer10.equals("no")) {
    	
        System.out.println("Lifelines ");
        System.out.println("[1]: Audience Poll");
        System.out.println("[2]: 50/50");
        System.out.println("[3]: Quit");
        System.out.println("Enter the lifeline:");
        int lifelines = sc.nextInt();
        sc.nextLine();

        if (lifelines == 1) {
            if (!audienceUsed) {
                System.out.println("Audience Poll: [A] 15% [B] 5% [C] 95% [D]: 5%");
                System.out.print("Enter your answer: ");
                answer = sc.nextLine().toUpperCase();
                audienceUsed = true;
            } else {
                System.out.println("Audience Poll already used.");
                System.out.print("Enter your answer (A/B/C/D): ");
                answer = sc.nextLine().toUpperCase();
            }
        } else if (lifelines == 2) {
            if (!fiftyFiftyUsed) {
                System.out.println("50/50: [A] Central Program Unit and [C]Central Processing Unit ");
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

    if (answer.equals("C")) {
        prize = 100000;
        System.out.println(GREEN + "Congratulations! Correct answer. k " + prize + RESET);
    } else {
        System.out.println(RED + "Sorry, wrong answer. You go home with Rs. 0" + RESET);
        prize=70000;
        System.out.println(PURPLE + "You go home with Rs. " + prize + RESET);
        
        return;
    }

    // Final Thank You
    System.out.println(PURPLE + "Thanks for playing! You won Rs. " + prize + RESET);
}
}
    
    
  
    
  