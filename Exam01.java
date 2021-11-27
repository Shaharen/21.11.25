import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 1차원 문자열 배열 선언 후 { 수 , 박 } 으로 초기화
		// 숫자를 입력받아 짝수인경우 수 홀수인경우 박 을 출력하는 프로그램
		Scanner sc = new Scanner(System.in);

		String[] array = { "수", "박" };

		System.out.println("==== 수박 게임 Start! ====");
		System.out.print("숫자를 입력해주세요 >>> ");
		int num = sc.nextInt();

		String[] array2 = new String[num]; // 입력한 숫자를 길이로 갖는 배열 생성

		// index 0과 1 반복출력 -> 2 이상의 숫자는 저장후 나머지로 변경후 재변경
		for (int i = 0; i < num; i++) {
			int j = i;
			if (i >= 2) {
				i = i % 2;
			}
			System.out.print(array[i]);
			i = j;
		}
		System.out.println();

		// array2 사용
		// 짝수는 수 홀수는 박 채워 넣고 전체 출력
		for (int i = 0; i < array2.length; i++) {
			if (i % 2 == 0) {
				array2[i] = "수";
			} else {
				array2[i] = "박";
			}
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]);
		}
		System.out.println();
		// 배열 전체 출력 방법
		System.out.println(Arrays.toString(array2));

	}

}
