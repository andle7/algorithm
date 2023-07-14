import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자바꿔서출력하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String result = "";
		int value = 0;
		char let;
		
		for (int i = 0; i < str.length(); i++) {
			value = (int)str.charAt(i);
			let = 0;
			if(value >= 65 && value <= 90) {
				let = (char)(value+32);
			} else if(value >= 97 && value <= 122) {
				let = (char)(value-32);
			}
			
			result += let;
		}
	
		
		System.out.println(result);
	}

}