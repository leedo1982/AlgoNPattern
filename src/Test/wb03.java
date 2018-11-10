package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class wb03 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String input2 = br.readLine();

		if(null == input || null == input2){
			return ;
		}
		int tabStop = Integer.valueOf(input);
		int startChar = 0;
		int spaceCnt = 0;
		for (int i = 0; i < input2.length(); i++) {
			String regStr = "\\S";
			String regSpace = " ";

			String c = String.valueOf(input2.charAt(i));

			if (c.matches(regSpace)) {
				spaceCnt++;
			}

			if (c.matches(regStr)) {
				startChar = i;
				break;
			}
		}

		int tabCount = startChar - spaceCnt + (spaceCnt / tabStop);

		String tab = "";
		for (int i = 0; i < tabStop * tabCount; i++) {
			tab += " ";
		}

		System.out.println(tab + input2.trim());

	}
}
