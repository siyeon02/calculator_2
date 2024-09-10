package calculator_2;

import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("종료는 exit 입력/종료 원치 않으면 아무키나 입력: ");
                String text = sc.next();
                if (text.equals("exit")) {
                    break;
                }

                System.out.println("첫번째 양수를 입력하시오 : ");
                int a = sc.nextInt();
                calc.setFirstOperand(a);

                sc.nextLine();

                System.out.println("연산자를 입력하시오 : ");
                String operator = sc.next();
                calc.setOperator(operator);

                System.out.println("두번째 양수를 입력하시오 : ");
                int b = sc.nextInt();
                calc.setSecondOperand(b);

                System.out.println("결과 : " + calc.operation(a, b, operator));

                System.out.println("결과 값들을 수정하시겠습니까? (y/n): ");
                String answer1 = sc.next();

                if (Objects.equals(answer1, "y")) {
                    calc.getResults();
                    System.out.println("수정하고 싶은 결과의 인덱스와 값을 입력해주세요 : ");
                    int index = sc.nextInt();
                    int result_s = sc.nextInt();
                    calc.setResults(index, result_s);
                }


                System.out.println("첫번째 결과 값을 삭제하시겠습니까? (y/n): ");
                String answer2 = sc.next();

                if (Objects.equals(answer2, "y")) {
                    calc.deleteFirst();
                    System.out.println("첫번째 결과 값이 삭제되었습니다.");

                } else {
                    continue;
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
