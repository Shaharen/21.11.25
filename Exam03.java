import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// ȸ������ -> id �� pw �ʿ�
		String[] id = { "" , "" , "" }; // <--- ������ �ȳ�
		// new String[3]; --> null���� ���� ������ ��
		int[] pw = new int[3];	 

		// "ȸ�������� �����մϴ�!" ������ ���
		// ȸ�������� ���ּ���
		// �ݺ� ! �� 3�� �ʰ��� ȸ�����Խ� ����

//		System.out.println("ȸ�������� �����մϴ�!");
//		for (int i = 0; i <= 3; i++) {
//			if ( i == 3 ) {
//				System.out.println("���α׷� ����");
//				break;
//			}
//			System.out.print("id �Է� : ");
//			id[i] = sc.next();
//			System.out.print("pw �Է� : ");
//			pw[i] = sc.nextInt();
//			
//		}
		int member = 0; // ȸ���� ��
		while (true) {

			System.out.println("1. ȸ������  2. �α���  3. ���α׷� ����");
			int menu = sc.nextInt();
			// 1���� �������� ȸ������ �ȳ�
			if (menu == 1) {
				if (member < 3) {
					System.out.println("ȸ������ ����");
					System.out.print("ID�� �Է����ּ���");
					id[member] = sc.next();
					System.out.print("PW�� �Է����ּ���");
					pw[member] = sc.nextInt();
					member++;
				} else {
					System.out.println("����!");
					break;
				}
				// 2���� �������� �α���
			} else if (menu == 2) {
				System.out.println("�α��� ����");
				System.out.print("ID �Է� >> ");
				String inputId = sc.next();
				System.out.print("PW �Է� >> ");
				int inputPw = sc.nextInt();
				int cnt = 0; // �α��� ����Ȯ�� ���� ���� <----------------------------------***
				// �迭���� ���� ã�� ���� �ִٸ� �α��� ���� ��� , ������ �α��� ���� ���
				for (int i = 0; i < id.length; i++) {
					if (inputId.equals(id[i]) && inputPw == pw[i]) {
						System.out.println("�α��� ����");
						cnt++; // ���ο� ������ ������Ŵ -> �α��� ���� <----------------------***
					}
				}
				if (cnt == 0) {
					System.out.println("�ٽ� �α��� ���ּ���");
				}

				// else if (!(inputId.equals(id[0]) || inputId.equals(id[1]) ||
				// inputId.equals(id[2]))) {
//						System.out.println("���̵� �ٽ� �Է����ּ���");
//					}

				// 3���� �������� ����
			} else if (menu == 3) {
				System.out.println("���α׷� �����մϴ�!");
				break;
			} else {
				System.out.println("���Է� �ϼ���");
			}
		}

	}

}
