package design;

import java.util.concurrent.atomic.AtomicLong;

import design.adapter.AirConditioner;
import design.adapter.Cleaner;
import design.adapter.Electronic110V;
import design.adapter.HairDryer;
import design.adapter.SocketAdapter;
import design.aop.AopBrowser;
import design.decorator.A3;
import design.decorator.A4;
import design.decorator.A5;
import design.decorator.Audi;
import design.decorator.AudiDecorator;
import design.decorator.ICar;
import design.facade.Ftp;
import design.facade.Reader;
import design.facade.SftpClient;
import design.facade.Writer;
import design.observer.Button;
import design.observer.IButtonListener;
import design.proxy.Browser;
import design.proxy.BrowserProxy;
import design.proxy.IBrowser;
import design.singleton.Aclass;
import design.singleton.BClass;
import design.singleton.SocketClient;
import design.strategy.AppendStrategy;
import design.strategy.Base64Strategy;
import design.strategy.Encoder;
import design.strategy.EncodingStrategy;
import design.strategy.NormalStrategy;

public class Main {

	public static void main(String[] args) {
		Encoder encoder = new Encoder();
		//전략 집어넣기 
		//Base64
		EncodingStrategy base64 = new Base64Strategy();
		
		//normal
		EncodingStrategy normal = new NormalStrategy();
		
		//message
		String message = "hello java";

		//전략 주입
		encoder.setEncodingStrategy(base64);
		String baseResult  = encoder.getMessage(message);

		encoder.setEncodingStrategy(normal);
		String normalResult = encoder.getMessage(message);
		
		encoder.setEncodingStrategy(new AppendStrategy());
		String appendResult = encoder.getMessage(message);
		
//		System.out.println(baseResult);
//		System.out.println(normalResult);
		System.out.println(appendResult);
	}

	
	//콘센트 = 110v만 powerOn하는 작업
	public static void connect(Electronic110V electronic110v) {
		electronic110v.powerOn();
	}
}
