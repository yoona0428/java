import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1);

        Scanner sc1 = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num2 = sc1.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1 + num2);

        Scanner sc2 = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num3 = sc2.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1 + num2 + num3);

        Scanner sc3 = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num4 = sc3.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1 + num2 + num3 + num4);

        Scanner sc4 = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num5 = sc4.nextInt();
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", num1 + num2 + num3 + num4 + num5);
    }
}
