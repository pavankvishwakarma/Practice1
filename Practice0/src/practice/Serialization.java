package practice;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	
	int id;
	String name;
	
	Employee(int id, String name){
		this.id = id;
		this.name=name;
		
	}
	public String toString(){
		return "id ="+id+" name= "+name;
	}
}



public class Serialization {

	public static void serialization(Employee e){
		try {
			FileOutputStream fo = new FileOutputStream("/home/pavan/Desktop/workspace/file/abc.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			oo.writeObject(e);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	
	public static Employee deserialization(){
		
		Employee e=null;
		try {
			
			FileInputStream fo = new FileInputStream("/home/pavan/Desktop/workspace/file/abc.txt");
			ObjectInputStream oo = new ObjectInputStream(fo);
			e =  (Employee) oo.readObject();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
	}
	
	
	public static void main(String args[]){
		Employee e = new Employee(1,"a");
		serialization(e);
		
		
		Employee e2=deserialization();
		System.out.println(e2);
	}
}
