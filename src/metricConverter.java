import java.util.Scanner;
public class metricConverter {
    
    public static void main(String[] Strings) {
        
        System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nWelcome to Metric Convereter!");

        while (true) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nPossible Conversions:\nkgs -> lbs\ngrams -> ounces\nkm -> miles\nmm-> inches\ninput exit to exit the program");
            System.out.println("Please choose a conversion: (Input either A, B, C, D, or exit)\n(A)kgs -> lbs\t(B)grams -> ounces\t(C)km -> miles\t(D)mm -> inches\t  exit");
            
            String userInput = scanner.nextLine();

            if (userInput.equals("exit") || userInput.equals("Exit")) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHave a nice day!");
                break;

            } else if (userInput.equals("A") || userInput.equals("a")) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nPlease input the kgs you would like to convert to lbs: (Only numeric entries are permitted)");
                
                double userMeasurement = scanner.nextDouble();
                double conversion = (userMeasurement * 2.2046);
                System.out.println(userMeasurement + " kg is " + conversion + " lbs\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("Would you like to convert another number? \t(y)es\t(n)o");
                Scanner input = new Scanner(System.in);
                String userAnswer = input.nextLine();
                
                if (userAnswer.equals("y") || userAnswer.equals("Y") || userAnswer.equals("yes") || userAnswer.equals("Yes")) {
                    continue;
                } else if (userAnswer.equals("n") || userAnswer.equals("N") || userAnswer.equals("no") || userAnswer.equals("No")) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHave a nice day!");
                    break;
                } else {
                    System.out.println("Error: please enter either (y)es or (n)o to proceed");
                }

            
            } else if (userInput.equals("B") || userInput.equals("b")) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nPlease input the grams you would like to convert to ounces: (Only numeric entries are permitted)");

                double userMeasurement = scanner.nextDouble();
                double conversion = (userMeasurement * 0.035274);
                System.out.println(userMeasurement + " grams is " + conversion + " ounces\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("Would you like to convert another number? \t(y)es\t(n)o");
                Scanner input = new Scanner(System.in);
                String userAnswer = input.nextLine();
                
                if (userAnswer.equals("y") || userAnswer.equals("Y") || userAnswer.equals("yes") || userAnswer.equals("Yes")) {
                    continue;
                } else if (userAnswer.equals("n") || userAnswer.equals("N") || userAnswer.equals("no") || userAnswer.equals("No")) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHave a nice day!");
                    break;
                } else {
                    System.out.println("Error: please enter either (y)es or (n)o to proceed");
                }

            
            } else if (userInput.equals("C") || userInput.equals("c")) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nPlease input the km you would like to convert to miles: (Only numeric entries are permitted)");

                double userMeasurement = scanner.nextDouble();
                double conversion = (userMeasurement *  0.62137);
                System.out.println(userMeasurement + " km is " + conversion + " miles\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("Would you like to convert another number? \t(y)es\t(n)o");
                Scanner input = new Scanner(System.in);
                String userAnswer = input.nextLine();
                
                if (userAnswer.equals("y") || userAnswer.equals("Y") || userAnswer.equals("yes") || userAnswer.equals("Yes")) {
                    continue;
                } else if (userAnswer.equals("n") || userAnswer.equals("N") || userAnswer.equals("no") || userAnswer.equals("No")) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHave a nice day!");
                    break;
                } else {
                    System.out.println("Error: please enter either (y)es or (n)o to proceed");
                }

            
            } else if (userInput.equals("D") || userInput.equals("d")) {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nPlease input the mm you would like to convert to inches: (Only numeric entries are permitted)");

                double userMeasurement = scanner.nextDouble();
                double conversion = (userMeasurement * 0.039370);
                System.out.println(userMeasurement + " mm is " + conversion + " inches\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                System.out.println("Would you like to convert another number? \t(y)es\t(n)o");
                Scanner input = new Scanner(System.in);
                String userAnswer = input.nextLine();
                
                if (userAnswer.equals("y") || userAnswer.equals("Y") || userAnswer.equals("yes") || userAnswer.equals("Yes")) {
                    continue;
                } else if (userAnswer.equals("n") || userAnswer.equals("N") || userAnswer.equals("no") || userAnswer.equals("No")) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\nHave a nice day!");
                    break;
                } else {
                    System.out.println("Error: please enter either (y)es or (n)o to proceed");
                }

            
            } else {
                System.out.println("Error: please enter either A, B, C, D, or exit.");
                break;
            }

            }
        }

    }
    

   
    
