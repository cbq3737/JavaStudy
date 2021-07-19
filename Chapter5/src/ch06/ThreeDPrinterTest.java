package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		ThreeDPrinter3 printer= new ThreeDPrinter3();
		
		printer.setMaterial(powder);//printer에다가 powder 재료를 넣는다.
		Powder p = (Powder)printer.getMaterial();//이렇게 반환하려고 하면 반환값이 Object이므로 형변환을 해줘야한다. 
		System.out.println( p.toString());
	}
}
