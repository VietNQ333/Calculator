package Model;

import Controller.Validation;

public class BMICal {
    Validation validation = new Validation();
    public double cal(String d1, String d2){
        System.out.println(d1);
        double weight = validation.checkWnH();
        System.out.println(d2);
        double height = validation.checkWnH();
        return weight / (height * height);
    }
}
