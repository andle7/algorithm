import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 대소문자바꿔서출력하기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		String result = "";
		char let;
		
		for (int i = 0; i < str.length(); i++) {
			let = 0;
			if(Character.isLowerCase(str.charAt(i))) {
				let = Character.toUpperCase(str.charAt(i));
			}else {
				let = Character.toLowerCase(str.charAt(i));
			}
		
			result += let;
		}
	
		
		System.out.println(result);
	}

}
