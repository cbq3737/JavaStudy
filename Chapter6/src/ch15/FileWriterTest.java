package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("writer.txt")) {
			fw.write('A');
			char[] cbuf = {'B','C','D','E','F','G'};
			fw.write(cbuf);
			fw.write("안녕하세여,글을 작성합니다.");
			fw.write(cbuf,1,2);
			fw.write("65");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다");
	}
}
