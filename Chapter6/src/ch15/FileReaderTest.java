package ch15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		//FileIputStream은 깨진다. 문자로 읽을수 없기 때문에 
		try(FileReader fis = new FileReader("reader.txt")) {
			int i;
			while((i = fis.read())!= -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
