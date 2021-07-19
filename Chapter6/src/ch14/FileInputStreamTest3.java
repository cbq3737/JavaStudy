package ch14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		int i;
		try(FileInputStream fis = new FileInputStream("input2.txt");) {
			byte[] bs = new byte[10];
			//read(byte[]) : 바이트 수 반환, -1은 바이트 수가 end of file이란 말 
			//i는 문자가 아닌 바이트 수가 됨
			while((i= fis.read(bs)) != -1) {
				for(int j=0;j<10;j++) {
					System.out.print((char)bs[j]);
				}
				System.out.println(" : " + i +"바이트 읽음");
			}
		} catch (IOException e) {
			System.out.println(e);
		}	
	}
}
