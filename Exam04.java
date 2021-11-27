import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		// 가위바위보
		Scanner sc = new Scanner(System.in);
		
		String cmp = "주먹";
		
		System.out.println("어떤걸 낼껀가요?");
		String user = sc.next(); // 사용자가 입력한 값
		
		// 문자열 A와 B 비교는 A equals("B") 사용
		if (user.equals("보")) {
			System.out.println("이겼당~");
		// 졌다
		}else if (user.equals("가위")) {
			System.out.println("졌습니다.");
		// 비겼다
		}else if (user.equals(cmp)) {
			System.out.println("비겼습니다.");
		}
		
		

	}

}
