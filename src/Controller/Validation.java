package Controller;

import java.util.Scanner;

public class Validation {
    private final Scanner in = new Scanner(System.in);
    private final String opReg = "[-+*/^=]";

    public String checkInputString() {
        //loop until user input correct
        while (true) {
            String result = in.nextLine().trim();
            if (result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }


    public String checkOp(){
        while(true){
            String result = checkInputString();
            if(result.matches(opReg)){
                return result;
            }else{
                System.out.println("Not a valid operation (+-*/^=)");
                System.out.println("Enter again!");
            }
        }
    }

    public int checkInt(){
        while(true){
            String result = checkInputString();
            try{
                return Integer.parseInt(result);
            }catch(NumberFormatException e){
                System.out.println("Not a number !");
                System.out.println("Enter again !");
            }
        }
    }

    public double checkDouble(){
        while(true){
            String result = checkInputString();
            try{
                return Double.parseDouble(result);
            }catch(NumberFormatException e){
                System.out.println("Not a number !");
                System.out.println("Enter again !");
            }
        }
    }

    public double checkDiv(double a){
        double result = a;
        while(true){
            if(result == 0){
                System.out.println("Can't be divided by zero");
                result = checkDouble();
            }else{
                return result;
            }
        }    
    }


    public double checkWnH(){
        while(true){
            Double result = checkDouble();
            if(result <= 0){
                System.out.println("Invalid input!");
                System.out.println("Please enter again!");
            }else{
                return result;
            }
        }
    }

}

