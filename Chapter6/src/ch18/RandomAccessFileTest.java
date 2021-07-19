package ch18;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		//rw는 read,write
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("pointer:"+ rf.getFilePointer());
	
		rf.writeDouble(3.14);
		//4+8
		System.out.println("pointer:"+ rf.getFilePointer());
	
		rf.writeUTF("안녕하세요");
		//한글이 세바이트씩 잡힌다.널까지해서 17바이트 잡힘
		System.out.println("pointer:"+ rf.getFilePointer());
		
		//이미 포인터는 돌아가있는데 바로 읽어버리면 맞지 않으므로 에러가 발생한다.
		//seek는 어떤 포지션으로 가라라는 의미의 메서드
		rf.seek(0);
		
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str= rf.readUTF();
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}
}
