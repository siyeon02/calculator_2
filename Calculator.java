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
                     //System.out.println("결과 : ");
                     return firstOperand + secondOperand;
                 //break;
                 case "-":
                     //System.out.println("결과 : ");
                     return firstOperand - secondOperand;
                 //break;
                 case "*":
                     //System.out.println("결과 : ");
                     return firstOperand * secondOperand;
                 //break;
                 case "/":
                     if(secondOperand == 0){
                         System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다!");
                         break;
                     }
                     else{
                         //System.out.println("결과 : ");
                         return firstOperand / secondOperand;

                     }

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
