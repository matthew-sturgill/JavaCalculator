package CalculatorPackage;

/**
 * Created by matthewsturgill on 10/11/16.
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Calculator {
    Scanner userCalcInput = new Scanner (System.in);
    double num1;
    double num2;
    String algebra;
    double calctotal;
    double calctotalplusbill;
    int serviceRate;
    double bill;
    double salesTaxAdd;
    double adjustedBill;
    ArrayList <Double> history = new ArrayList<>();


    public Calculator(){}

    void calc() {

        Scanner userMenu = new Scanner(System.in);
        int userChoice;
        while (true) {
            System.out.println("*Choose 1 for Calculator" + "\n" + "*Choose 2 for tip calculator" + "\n" + "*Choose 3 for Sales tax calculator" + "\n" + "*Choose 4 for history of answers" + "\n" + "*Choose 5 to delete history" + "\n" + "*Choose 6 for help" + "\n" + "*Choose 7 to exit");
            userChoice = userMenu.nextInt();
            switch (userChoice) {
                case 1:
                    calcWork();
                    break;

                case 2:
                    tipCalc();
                    break;

                case 3:
                    salesTax();
                    break;

                case 4:
                    showHistory();
                    break;

                case 5:
                    deleteHistory();
                    break;

                case 6:
                    showHelp();
                    break;

                case 7:
                    System.out.println("Thank you");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose a correct menu option");
            }


        }
    }

    //Below is method for calculator.
     public void calcWork() {
        System.out.println("First number?");
        num1 = userCalcInput.nextDouble();
        System.out.println("Second number?");
        num2 = userCalcInput.nextDouble();

        System.out.println("Choose +, -, *, or /");

        algebra = userCalcInput.next();
        switch (algebra) {
            case "+":
                calctotal = (num1 + num2);
                System.out.println(calctotal);
                history.add(calctotal);

                break;
            case "-":
                calctotal = num1 - num2;
                System.out.println(calctotal);
                System.out.println(calctotal);
                history.add(calctotal);

                break;
            case "*":
                calctotal = num1 * num2;
                System.out.println(calctotal);
                System.out.println(calctotal);
                history.add(calctotal);

                break;

            case "/":
                calctotal = num1 / num2;
                System.out.println(calctotal);
                System.out.println(calctotal);
                history.add(calctotal);

                break;
            default:
                System.out.println("You did something wrong, try again");
                break;
        }
    }

    //Below is method for tip calculator.
     public void tipCalc(){
        System.out.print("Amount of your bill?");
        bill = userCalcInput.nextDouble();
        System.out.print("Rate your service on a scale of 1-5. 5 being the best. 1 being the worst");
        serviceRate = userCalcInput.nextInt();
        switch (serviceRate){
            case 1:
                calctotal = (bill * 0.05) * 100 / 100;
                calctotalplusbill = calctotal + bill;
                System.out.println("Leave $" + calctotal + "\n" + "For a total of: $" + calctotalplusbill);
                history.add(calctotal);
                break;
            case 2:
                calctotal = (bill * 0.10) * 100 / 100;
                calctotalplusbill = calctotal + bill;
                System.out.println("Leave $" + calctotal + "\n" + "For a total of: $" + calctotalplusbill);
                history.add(calctotal);
                break;
            case 3:
                calctotal = (bill * 0.15) * 100 / 100;
                calctotalplusbill = calctotal + bill;
                System.out.println("Leave $" + calctotal + "\n" + "For a total of: $" + calctotalplusbill);
                history.add(calctotal);
                break;
            case 4:
                calctotal = (bill * 0.20) * 100 / 100;
                calctotalplusbill = calctotal + bill;
                System.out.println("Leave $" + calctotal +"\n" + "For a total of: $" + calctotalplusbill);
                history.add(calctotal);
                break;
            case 5:
                calctotal = (bill * 0.25) * 100 / 100;
                calctotalplusbill = calctotal + bill;
                System.out.println("Leave $" + calctotal + "\n" + "For a total of: $" + calctotalplusbill);
                history.add(calctotal);
                break;
            default:
                System.out.print("Sorry you did something wrong. Try again.");
        }
    }

    //Below is method for sales tax.
    public void salesTax() {
        System.out.print("What is your grocery total?");
        bill = userCalcInput.nextDouble();
        System.out.print("Input your state sales tax. Example 6 for Kentucky.");
        salesTaxAdd = userCalcInput.nextDouble();
        adjustedBill = (bill * (salesTaxAdd * 0.01));
        System.out.println("Your added sales tax will be: $" + (bill * (salesTaxAdd * 0.01)) + "\n"+ "For a total of: $" + (bill + (bill * (salesTaxAdd * 0.01))));
        history.add(adjustedBill);


    }
    public void showHistory(){
        System.out.println(history);
    }
    public void showHelp(){
        System.out.println("Please choose a menu item 1-4." +"\n" + "Input your numbers or bill total." +"\n" +"Choose +, -, *, or / in calculator" + "Rate your service 1,2,3,4,5 in tip calculator" + "\n" + "Sales tax calculator input your sales tax as follows. KY sales tax is 6% so I would input 6" +"\n" + "Choose 3 to see all previous equations performed or choose 5 to remove all history");
    }
    public void deleteHistory(){
        history.clear();
    }


}



