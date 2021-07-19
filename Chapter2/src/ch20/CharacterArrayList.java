package ch20;

public class CharacterArrayList {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		for(int i=0;i<alphabets.length;i++) {
			alphabets[i] = ch++;
		}
		for(char numb:alphabets) {
			System.out.println(numb+","+(int)numb);
		}
	}
}
