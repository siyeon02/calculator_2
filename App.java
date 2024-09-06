package calculator_2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 양수를 입력하시오 : ");
        int a = sc.nextInt();
        calc.setFirstOperand(a);

        sc.nextLine();

        System.out.println("연산자를 입력하시오 : ");
        String operator = sc.nextLine();
        calc.setOperator(operator);

        System.out.println("두번째 양수를 입력하시오 : ");
        int b = sc.nextInt();
        calc.setSecondOperand(b);

        System.out.println("결과 : " + calc.operation(a,b,operator));


    }
}
