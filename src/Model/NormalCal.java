package Model;

import Controller.*;

public class NormalCal{
    Validation validation = new Validation();
    
    public double cal(){
       

        double result = 0;
        System.out.println(result);
        while(true){
                String op = validation.checkOp();
                
             double a ;
            switch(op){
                case "+":
                        a = validation.checkDouble();
                        result = result + a;
                        break;
                case "-": a = validation.checkDouble();
                        result = result - a;
                        break;
                case "*": a = validation.checkDouble();
                        result = result * a;
                        break;
                case "/": a = validation.checkDouble();
                        result = result / validation.checkDiv(a);
                        break;
                case "^": 
                        a = validation.checkDouble();
                        double b = result;
                        for(int i = 0; i < a - 1; i++){
                            result = result * b;
                        }
                        break;
                case "=": return result;                     
            }
        }
    } 
}