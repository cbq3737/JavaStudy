package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class BufferedStreamTest {

	public static void main(String[] args) throws IOException {
		long millisecond = 0; //카피되는 시간을 계산하기 위함
		
		try(BufferedInputStream fis = new BufferedInputStream(new FileInputStream("a.zip"))){
			BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream("copy.zip"));
			
			millisecond = System.currentTimeMillis(); 
			int i;
			
			while((i= fis.read())!= -1){
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
		}catch(IOException e) {
			e.printStackTrace();
		}
		 System.out.println(millisecond+" 초 걸렸습니다.");
		 
//		 Socket socket = new Socket();
//		 //그냥 socket.getIntputStream().read()만 하면 채팅할 경우 영어로만 가능해짐 byte이므로
//		 BufferedReader br =  new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		 String str = br.readLine();
	}
}
