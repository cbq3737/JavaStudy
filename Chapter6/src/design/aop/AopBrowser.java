package design.aop;

import design.proxy.Html;
import design.proxy.IBrowser;

public class AopBrowser implements IBrowser {

	private String url;
	private Html html;
	//AOP의 특징중에는 전 후 메소드라는 것이 있다.
	//AOP는 관점지향이다.앞과 뒤를 체크한다.
	private Runnable before;
	private Runnable after;
	
	public AopBrowser(String url,Runnable before,Runnable after) {
		this.url = url;
		this.before = before;
		this.after = after;
	}
	@Override
	public Html show() {
		//전 후로 내가 원하는 기능을 넣어줄 수 있다.지금은 html로딩하는 시간을 봐보자.
		before.run();
		if(html == null) {
			this.html = new Html(url);
			System.out.println("AopBrowser Html loading from :"+url);
		
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		after.run();
		System.out.println("AopBrowser Html cache :"+url);	
	
		return html;
	}
}
