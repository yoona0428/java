import java.util.Scanner;

public class Homework2 {

    static class Student {
        int studentId;
        String name;
        String major;
        long phoneNumber;

        Student(int studentId, String name, String major, long phoneNumber) {
            this.studentId = studentId;
            this.name = name;
            this.major = major;
            this.phoneNumber = phoneNumber;
        }

        String getPhoneNumber() {
            String phoneStr = Long.toString(phoneNumber);

            if (phoneStr.length() == 10) {
                phoneStr = "0" + phoneStr;
            }

            return phoneStr.substring(0, 3) + "-" +
                    phoneStr.substring(3, 7) + "-" +
                    phoneStr.substring(7);
        }

        public String toString() {
            return studentId + " " + name + " " + major + " " + getPhoneNumber();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();

            students[i] = new Student(id, name, major, phone);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");
        String[] order = {"첫번째 학생: ", "두번째 학생: ", "세번째 학생: "};
        for (int i = 0; i < students.length; i++) {
            System.out.println(order[i] + students[i]);
        }

        sc.close();
    }
}
