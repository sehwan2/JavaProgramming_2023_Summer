import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*�� ����� �ϴ� �������� �� ������ ������. �� ����� �̸��� 'ö��'�� '����'�̴�. ���� "ö�� >>"�� ����ϰ� "����", "����", "��" 
 * �� �ϳ��� ���ڿ��� �Է¹޴´�. �׸��� "���� >>"�� ����ϰ� ���������� �Է¹޴´�. �Է¹��� ���ڿ��� ���Ͽ� ���� �̰���� �Ǻ��Ͽ� ���ڸ� ���
 * �Ѵ�.*/


public class Rock_Paper_Sissor {
	static String chulsu;
	static String yunghee;
	static int Rock, Paper, Sissor = 0;
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static void Game() throws IOException{
		System.out.println("������ �����մϴ�. ����, ����, �� �߿��� �Է�.");
		System.out.print("ö�� >>");
		chulsu = br.readLine();
		check(chulsu);
		System.out.print("���� >>");
		yunghee = br.readLine();
		check(yunghee);
		
		
	}
	static void check(String str) {
		if(str.equals("����")) {
			Sissor++;
		}else if(str.equals("����")) {
			Rock++;
		}else if(str.equals("��")) {
			Paper++;
		}else System.out.println("�߸��� �Է��Դϴ�.");
	}
	
	static void result() {
		if(Rock == 2 || Paper == 2 || Sissor == 2) {
			System.out.println("�����ϴ�.");
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		Game();
	}
}
