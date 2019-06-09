package Webdriverprogrames;

public class ConditionalStatements {

	public static void main(String[] args) {

		int x=100,y=200,z=15,a=150;
		
		if(x>y&x>z&x>a){
			System.out.println("x is bigger value");
		}
		else if(y>z&y>a){
			System.out.println("y is bigger value");
		}
		else if(z>a){
			System.out.println("z is bigger value");
		}
		else{
			System.out.println("a is bigger value");
		}
		
		
	}

}

