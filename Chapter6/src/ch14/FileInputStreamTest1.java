package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			// read()는 int형을 반환하는데 doc을 찾아보면 알 수 있겠지만,파일을 읽어들인 후 끝까지 다 읽었을 때 반환할게 없다면 -1을
			// 반환한다.그래서 바이트형이 아닌 int형이다.
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());
			System.out.println((char) fis.read());

		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
					e.printStackTrace();
			}catch(Exception e2) { //이미 exception발생한 상태에서 close하려는데 위에서 이미 null상태이므로 이것 역시 catch무을 작성해줘야 한다.
				System.out.println(e2);
			}
		}
		System.out.println("end");
	}
}
