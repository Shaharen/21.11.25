import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 회원가입 -> id 와 pw 필요
		String[] id = { "" , "" , "" }; // <--- 오류가 안남
		// new String[3]; --> null값이 들어가서 오류가 뜸
		int[] pw = new int[3];	 

		// "회원가입을 시작합니다!" 문구를 출력
		// 회원가입을 해주세요
		// 반복 ! 단 3명 초과로 회원가입시 종료

//		System.out.println("회원가입을 시작합니다!");
//		for (int i = 0; i <= 3; i++) {
//			if ( i == 3 ) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			System.out.print("id 입력 : ");
//			id[i] = sc.next();
//			System.out.print("pw 입력 : ");
//			pw[i] = sc.nextInt();
//			
//		}
		int member = 0; // 회원의 수
		while (true) {

			System.out.println("1. 회원가입  2. 로그인  3. 프로그램 종료");
			int menu = sc.nextInt();
			// 1번이 눌렸을때 회원가입 안내
			if (menu == 1) {
				if (member < 3) {
					System.out.println("회원가입 시작");
					System.out.print("ID를 입력해주세요");
					id[member] = sc.next();
					System.out.print("PW를 입력해주세요");
					pw[member] = sc.nextInt();
					member++;
				} else {
					System.out.println("종료!");
					break;
				}
				// 2번이 눌렸을때 로그인
			} else if (menu == 2) {
				System.out.println("로그인 시작");
				System.out.print("ID 입력 >> ");
				String inputId = sc.next();
				System.out.print("PW 입력 >> ");
				int inputPw = sc.nextInt();
				int cnt = 0; // 로그인 성공확인 변수 생성 <----------------------------------***
				// 배열에서 값을 찾아 값이 있다면 로그인 성공 출력 , 없으면 로그인 실패 출력
				for (int i = 0; i < id.length; i++) {
					if (inputId.equals(id[i]) && inputPw == pw[i]) {
						System.out.println("로그인 성공");
						cnt++; // 새로운 변수를 증가시킴 -> 로그인 성공 <----------------------***
					}
				}
				if (cnt == 0) {
					System.out.println("다시 로그인 해주세요");
				}

				// else if (!(inputId.equals(id[0]) || inputId.equals(id[1]) ||
				// inputId.equals(id[2]))) {
//						System.out.println("아이디를 다시 입력해주세요");
//					}

				// 3번이 눌렸을때 종료
			} else if (menu == 3) {
				System.out.println("프로그램 종료합니다!");
				break;
			} else {
				System.out.println("재입력 하세요");
			}
		}

	}

}
