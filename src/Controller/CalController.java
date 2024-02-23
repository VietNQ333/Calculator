package Controller;

import View.*;

public class CalController extends Menu<String>{
    CalView calView = new CalView();
    public CalController(String title, String[] mChon){
        super(title, mChon);
    }
    @Override
    public void execute(int n){
        switch(n){
            case 1: calView.nCal();
                    break;
            case 2: calView.bCal();
                    break;
            case 3: System.out.println("Goodbye!");
                    System.exit(0);
            default: System.out.println("Not a valid option!");
                    System.out.println("Enter again!");        
        }
    }
    public static void main(String[] args){
        String[] mChon = {"Normal calculation", "BMI calculation", "Exit"};
        CalController calController = new CalController("Calculator", mChon);
        calController.run();
    }
}
