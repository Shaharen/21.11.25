import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		
		// ����������
		Scanner sc = new Scanner(System.in);
		
		String cmp = "�ָ�";
		
		System.out.println("��� ��������?");
		String user = sc.next(); // ����ڰ� �Է��� ��
		
		// ���ڿ� A�� B �񱳴� A equals("B") ���
		if (user.equals("��")) {
			System.out.println("�̰��~");
		// ����
		}else if (user.equals("����")) {
			System.out.println("�����ϴ�.");
		// ����
		}else if (user.equals(cmp)) {
			System.out.println("�����ϴ�.");
		}
		
		

	}

}
