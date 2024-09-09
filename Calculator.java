package calculator_2;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
    public int firstOperand;
    public int secondOperand;
    public String operator;
    ArrayList<Integer> results = new ArrayList<>();
    int result = 0;

    public Calculator() {}
     public int operation(int firstOperand, int secondOperand, String operator) {


         //while (true) {
             Scanner sc = new Scanner(System.in);

             switch (operator) {
                 case "+":
                     result = firstOperand + secondOperand;
                     results.add(result);
                     return results.get(results.size()-1);

                 case "-":
                     result = firstOperand - secondOperand;
                     results.add(result);
                     return results.get(results.size()-1);

                 case "*":
                     result = firstOperand * secondOperand;
                     results.add(result);
                     return results.get(results.size()-1);

                 case "/":
                     if(secondOperand == 0){
                         System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다!");
                         break;
                     }
                     else{
                         result = firstOperand / secondOperand;
                         results.add(result);
                         return results.get(results.size()-1);

                     }
                 default:
                     System.out.println("다시 입력해주세요 : ");

             }
        // }
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

    public String deleteFirst(){
        results.remove(0);
        System.out.println(results.toString());
        return this.results.toString();
    }


}
