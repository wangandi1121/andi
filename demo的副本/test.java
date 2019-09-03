package demo;
import demo.demo;
public class test implements demo{
	
	public void affiche(int num) {
		if(num==1){
			System.out.println(1);
		}
		else if(num==2) {
			System.out.println(2);
		}
		else {
			System.out.println("else");
		}
		System.out.println("affiche");
	}
	
	public static void main(String[] args) {
		test t = new test();
		t.affiche(2);
		System.out.println("test");
		
		

	}
}

