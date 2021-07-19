package ch07;

public class GenericPrinterTest {

	public static void main(String[] args) {
		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(powder);
		//Object로 만들었을 땐 우리가 형 형변환을 했어야 했지만 
		//제네릭 프로그래밍에 의해 대체문자 T가 모두 Powder로 바뀐다.
		Powder p = powderPrinter.getMaterial();
		System.out.println(powderPrinter.toString());
		
	}
}
