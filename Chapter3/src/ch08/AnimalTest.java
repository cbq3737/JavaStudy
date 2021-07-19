package ch08;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	public void eating() {
		 System.out.println("aaa");
	}
}
class Human extends Animal{
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}
class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날라다닙니다.");
	}
	public void flying() {
		System.out.println("독수리가 양 날개를 쭉 펴고 날아다닙니다.");
	}
}
public class AnimalTest {

	public static void main(String[] args) {
		Animal hanimal = new Human();
		Animal tanimal = new Tiger();
		Animal eanimal = new Eagle();

	
//		test.moveAnimal(hanimal);
//		test.moveAnimal(tanimal);
//		test.moveAnimal(eanimal);
		
		ArrayList<Animal> animalList = new ArrayList<>();
		animalList.add(hanimal);//Animal만 들어가야할때 어차피 Animal타입이니까
		animalList.add(tanimal);
		animalList.add(eanimal);
		
//		for(Animal animal:animalList) {
//			animal.move();
//		}
		
		AnimalTest test = new AnimalTest();
		test.testDownCasting(animalList);
	}
	public void testDownCasting(ArrayList<Animal> animalList) {
		for(int i =0;i<animalList.size();i++) {
			Animal animal = animalList.get(i);
			if(animal instanceof Human) {
				Human human = (Human)animal;
				human.readBook();
			}
			else if(animal instanceof Tiger){
				Tiger tiger = (Tiger)animal;
				tiger.hunting();
			}
			else if(animal instanceof Eagle){
				Eagle eagle = (Eagle)animal;
				eagle.flying();
			}
			else {
				System.out.println("unsupported type");
			}
		}
	}
	public void moveAnimal(Animal animal) {
		animal.move();
	}
}
