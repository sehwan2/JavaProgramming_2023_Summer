import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*두 사람이 하는 가위바위 보 게임을 만들어보자. 두 사람의 이름은 '철수'와 '영희'이다. 먼저 "철수 >>"를 출력하고 "가위", "바위", "보" 
 * 중 하나를 문자열을 입력받는다. 그리고 "영희 >>"를 출력하고 마찬가지로 입력받는다. 입력받은 문자열을 비교하여 누가 이겼는지 판별하여 승자를 출력
 * 한다.*/


public class Rock_Paper_Sissor {
	static String chulsu;
	static String yunghee;
	static int Rock, Paper, Sissor = 0;
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	static void Game() throws IOException{
		System.out.println("게임을 시작합니다. 가위, 바위, 보 중에서 입력.");
		System.out.print("철수 >>");
		chulsu = br.readLine();
		check(chulsu);
		System.out.print("영희 >>");
		yunghee = br.readLine();
		check(yunghee);
		
		
	}
	static void check(String str) {
		if(str.equals("가위")) {
			Sissor++;
		}else if(str.equals("바위")) {
			Rock++;
		}else if(str.equals("보")) {
			Paper++;
		}else System.out.println("잘못된 입력입니다.");
	}
	
	static void result() {
		if(Rock == 2 || Paper == 2 || Sissor == 2) {
			System.out.println("비겼습니다.");
		}
		
		
	}
	public static void main(String[] args) throws IOException {
		Game();
	}
}
