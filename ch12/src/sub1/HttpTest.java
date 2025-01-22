package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜 : 2025/01/22
 * 이름 : 김준서
 * 내용 : Java HTTP 통신 실습하기
 */

public class HttpTest {
	
	public static void main(String[] args) {
		
		
		FileOutputStream fos = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://google.com");
		try {
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./result.txt");
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				fos.write(line.getBytes());
			}
			
			
		} catch (IOException e) {
				e.printStackTrace();
		}		
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
