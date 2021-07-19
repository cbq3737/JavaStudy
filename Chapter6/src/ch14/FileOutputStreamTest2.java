package ch14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("output2.txt");) {
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i=0;i<bs.length;i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("입력완료");
	}
}
