package calculator_2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {
    public int firstOperand;
    public int secondOperand;
    public String operator;
    private final ArrayList<Integer> results = new ArrayList<>();
    int result = 0;
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    public Calculator() {}
     public int operation(int firstOperand, int secondOperand, String operator) throws Exception{

        boolean judge_operator = Pattern.matches(OPERATION_REG, operator);
        boolean judge_operand1 = Pattern.matches(NUMBER_REG, Integer.toString(firstOperand));
        boolean judge_operand2 = Pattern.matches(NUMBER_REG, Integer.toString(secondOperand));

        if(judge_operator==false){
            throw new BadInputException("연산자");
        }else if(judge_operand1==false){
            throw new BadInputException("양수");
        }else if(judge_operand2==false){
            throw new BadInputException("양수");
        }

             Scanner sc = new Scanner(System.in);

             switch (operator) {
                 case "+":
                     result = firstOperand + secondOperand;
                     results.add(result);
                     return results.getLast();

                 case "-":
                     result = firstOperand - secondOperand;
                     results.add(result);
                     return results.getLast();

                 case "*":
                     result = firstOperand * secondOperand;
                     results.add(result);
                     return results.getLast();

                 case "/":
                     if(secondOperand == 0){
                         System.out.println("나눗셈 연산에서 두번째 정수에 0이 입력될 수 없습니다!");
                         break;
                     }
                     else{
                         result = firstOperand / secondOperand;
                         results.add(result);
                         return results.getLast();

                     }
                 default:
                     System.out.println("다시 입력해주세요 : ");

             }

         return 0;
     }

     public void setFirstOperand(int firstOperand) {
        this.firstOperand = firstOperand;

     }

    public void setSecondOperand(int secondOperand) {
        this.secondOperand = secondOperand;

    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public void getResults(){
        System.out.println(results.toString());
    }

    public void setResults(int index, int a){
        results.set(index, a);
        System.out.println("수정 후 결과 값들 : " + results.toString());
    }

    public void deleteFirst(){
        results.removeFirst();
        System.out.println(results.toString());
        this.results.toString();
    }


}
