package ch02;

import java.net.StandardSocketOptions;

public class MyArray {
	int[] intArr; //int array
	int count; // 개수
	
	public int ARRAY_SIZE; //capacity
	public static final int ERROR_NUM = -9999999;
	public MyArray() {
		count =0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	public MyArray(int size) {
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	public void addElement(int num) {
		if(count >= ARRAY_SIZE) {
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	public void insertElement(int position,int num) {
		if(count >= ARRAY_SIZE) {//더이상 넣을 메모리가 없을 시
			System.out.println("not enough memory");
			return;
		}
		if(position<0 || position > count) {//넣을 위치가 말이 안되는 위치일 경우
			System.out.println("insert Error");
			return;
		}
		for(int i = count-1;i>=position;i--) {//맨마지막위치에서부터 여야한다. 
			intArr[i+1] = intArr[i]; //뒤로 하나씩 밀림
		}//맨끝에 있는 애부터 가야한다.맨 앞에 있는 애부터가면 값이 덮혀쓰이기 때문에
		intArr[position] = num;
		count++;
	}
	public int removeElement(int position) {
		
		if(isEmpty()) { //아무것도 없는 지울 수는 없으니까
			System.out.println("There is no element");
			return ERROR_NUM; 
		}
		
		if(position <0 || position > count-1) {//인덱스의 최대 위치는 count-1
			System.out.println("remove Error");
			return ERROR_NUM;
		}
		int element = intArr[position]; //우리가 반환할 애.
		for(int i= position;i<count-1;i++) {//반환해준 그 위치부터,최고 인덱스인count-1까지
			intArr[i]= intArr[i+1]; //그위치부터 뒤에있는걸 한번 앞으로 땡김
		}
		count--; //총 요소 갯수하나빠졌으므로 
		return element;
	}
	public int getSize() {
		return count;
	}
	public boolean isEmpty() {
		if(count ==0) {
			return true;
		}
		else {
			return false;
		}
	}
	public int getElement(int position) {
		if(position < 0 || position > count-1) {
			System.out.println("검색 위치 오류, 현재 리스트의 개수는"+count+"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	public void printAll() {
		if(count ==0) {
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		for(int i=0;i<count;i++) {
			System.out.println(intArr[i]);
		}
	}
	public void removeAll() {
		for(int i=0;i<count;i++) {
			intArr[i]=0;
		}
		count =0;
	}
}
