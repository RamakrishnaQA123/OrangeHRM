package Javaprogrames;

public class SwitcaseExample {

	public static void main(String[] args) {


		String Signal="yellow";
		
		switch(Signal){
		case "green":
			System.out.println("GO");
			break;
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Dance");
			break;
		
		default:
			System.out.println("cry");
		}
		
	}

}
