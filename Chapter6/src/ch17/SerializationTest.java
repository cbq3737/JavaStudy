package ch17;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Externalizable{
	String name;
	String job;
	
	public Person(){}
	public Person(String name,String job) {
		this.name= name;
		this.job = job;
	}
	public String toString() {
		return name + "," + job;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {	
		out.writeUTF(name);
		out.writeUTF(job);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		job = in.readUTF();
	}
}

public class SerializationTest {

	public static void main(String[] args) {
		
		Person personLee = new Person("이순신","대표이사");
		Person personKim = new Person("김유신","상무이사");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.txt"));){
			oos.writeObject(personLee);
			oos.writeObject(personKim);
		}catch(IOException e) {
			System.out.println(e);
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.txt"));){
			Person pLee = (Person)ois.readObject();
			Person pKim = (Person)ois.readObject();
			System.out.println(pLee);
			System.out.println(pKim);
		}catch(IOException e) {
			System.out.println(e);
		}catch(ClassNotFoundException c) { //안에 클래스가 없을 수도 있으므로
			System.out.println(c);
		}
	}
}
