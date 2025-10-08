import java.util.Scanner;

public class Homework3 {
    static int max(int[] arr) {
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (max < arr[j]) max = arr[j];
        }
        return max;
    }

    static int min(int[] arr) {
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (min > arr[j]) min = arr[j];
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int num = number.nextInt();

        System.out.print("수를 입력하세요: ");
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = number.nextInt();
        }

        int max1 = max(arr);
        int min1 = min(arr);

        System.out.printf("최대값: %d\n최소값: %d\n", max1, min1);
    }
}
