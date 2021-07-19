package design.proxy;

public class BrowserProxy implements IBrowser {
	private String url;
	private Html html;
	//Html을 캐싱해야하기 때문에 html을 갖고 있는다.
	public BrowserProxy(String url) {
		this.url = url;
	}
	@Override
	public Html show() {
		//캐싱 작업
		if(html == null) {
			this.html = new Html(url);
			//새롭게 받아오는 것.
			System.out.println("BrowserProxy loading html from:"+url);
		}
		System.out.println("BrowserProxy use cache html:"+url);
		return html;
	}
	
}
