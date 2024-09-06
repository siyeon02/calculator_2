package calculator_2;

import java.util.Scanner;

public class Calculator {
    public int firstOperand;
    public int secondOperand;
    public String operator;

    public Calculator() {}
     public int operation(int firstOperand, int secondOperand, String operator) {
         while (true) {
             Scanner sc = new Scanner(System.in);
             System.out.println("종료는 exit 입력");
             String text = sc.nextLine();
             if(text.equals("exit")){
                 break;
             }

             switch (operator) {
                 case "+":
                     return firstOperand + secondOperand;
                 //break;
                 case "-":
                     return firstOperand - secondOperand;
                 //break;
                 case "*":
                     return firstOperand * secondOperand;
                 //break;
                 case "/":
                     return firstOperand / secondOperand;
                 //break;
             }
         }

         return 0;
     }

     public int setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;
        return this.firstOperand;

     }

    public int setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;
        return this.secondOperand;

    }

    public String setOperator(String operator) {
        this.operator = operator;
        return this.operator;
    }


}
