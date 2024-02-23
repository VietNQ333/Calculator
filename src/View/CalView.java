package View;

import Model.*;

public class CalView {
    BMICal bmiCal = new BMICal();
    NormalCal normalCal = new NormalCal();
    
    public void nCal(){
        System.out.println("Start operating :");
        double result = normalCal.cal();
        System.out.println("Your final result is: " + result);
    }

    public void bCal(){
        double result = bmiCal.cal("Enter your weight: ", "Enter your height: ");
        System.out.println("Your BMI is : " + result);
    }

}
