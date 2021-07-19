package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳을 쓰고 Enter를 누르세요");
		int i;
		try {
			//얘는 바이트로 읽는 얘들을 다 감쌀 수 있다. 지금은 표준입력 스트림을 감싸서 영어,한글이 다 나오도록했지만 FileInputStream을 감싸면 File에서 한글을 읽어들일 수 있다.
			InputStreamReader ips = new InputStreamReader(System.in);
			while((i = ips.read()) != '\n') {				
			//	System.out.println(i);
				System.out.print((char)i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
