import java.util.HashMap;
import java.util.Map;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class Homework9 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);

        try {
            br = new BufferedReader(new FileReader("db.txt"));

            String id;
            String pw;

            while (true) {
                id = br.readLine();
                if (id == null) break;

                pw = br.readLine();
                if (pw == null) break;

                map.put(id.trim(), pw.trim());
            }

        } catch (IOException e) {
            System.out.println("db.txt 읽기 오류: " + e.getMessage());
            return;

        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("파일 닫기 오류");
            }
        }

        while (true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String inputId = sc.nextLine().trim();

            if (!map.containsKey(inputId)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password: ");
            String inputPw = sc.nextLine().trim();

            if (!map.get(inputId).equals(inputPw)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
        sc.close();
    }
}
