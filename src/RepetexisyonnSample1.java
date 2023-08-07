
public class RepetexisyonnSample1 {

	public static void main(String[] args) {
		
		//テストの点数を入力
		System.out.println("テストの点数を入力してください");
		int score = new java.util.Scanner(System.in).nextInt();
		
		
		//テストの点数が80点以下なら再テストを繰り返す
		while (score < 80) {
			System.out.println("勉強する");
			
			System.out.println("再テストの点数を入力してください");
			score = new java.util.Scanner(System.in).nextInt();
			
		}
		
		System.out.println("合格しました");
		
	}

}
