import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 1���� ���ڿ� �迭 ���� �� { �� , �� } ���� �ʱ�ȭ
		// ���ڸ� �Է¹޾� ¦���ΰ�� �� Ȧ���ΰ�� �� �� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);

		String[] array = { "��", "��" };

		System.out.println("==== ���� ���� Start! ====");
		System.out.print("���ڸ� �Է����ּ��� >>> ");
		int num = sc.nextInt();

		String[] array2 = new String[num]; // �Է��� ���ڸ� ���̷� ���� �迭 ����

		// index 0�� 1 �ݺ���� -> 2 �̻��� ���ڴ� ������ �������� ������ �纯��
		for (int i = 0; i < num; i++) {
			int j = i;
			if (i >= 2) {
				i = i % 2;
			}
			System.out.print(array[i]);
			i = j;
		}
		System.out.println();

		// array2 ���
		// ¦���� �� Ȧ���� �� ä�� �ְ� ��ü ���
		for (int i = 0; i < array2.length; i++) {
			if (i % 2 == 0) {
				array2[i] = "��";
			} else {
				array2[i] = "��";
			}
		}
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i]);
		}
		System.out.println();
		// �迭 ��ü ��� ���
		System.out.println(Arrays.toString(array2));

	}

}
