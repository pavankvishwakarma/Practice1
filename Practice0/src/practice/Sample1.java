package practice;
import javax.swing.text.html.HTMLDocument.HTMLReader.FormAction;

class point{
	int x;
	int y;
	public point(int a , int b){
		x= a;
		y= b;
	}
	public String toString(){
		return "the a and b are "+x+" "+y;
	}
}

public class Sample1 {

	
	
	public static void swap(point a1, point a2){
		a1.x=100;
		a1.y=100;
		
		point t=a1;
		a1=a2;
		a2=t;
	}
	
	public static void main(String[] args) {
		
		point p[]= new point[10];
		for (int i = 0; i < p.length; i++) {
			p[i]= new point(i+1,i+2);
			System.out.println(p[i]);
		}
		System.exit(0);
		point p1 = new point(0,0);
		point p2 = new point(0,0);
		
		System.out.println("p1.x="+p1.x+" p1.y="+p1.y);
		System.out.println("p2.x="+p2.x+" p2.y="+p2.y);
		
		swap(p1,p2);
		
		System.out.println("p1.x="+p1.x+" p1.y="+p1.y);
		System.out.println("p2.x="+p2.x+" p2.y="+p2.y);
		
	}
}



