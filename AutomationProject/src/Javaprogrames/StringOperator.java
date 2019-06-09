package Javaprogrames;

import java.util.ArrayList;
import java.util.List;

public class StringOperator {

	public static void main(String[] args) {
		
List<String> value=new ArrayList<>();

value.add("Manual testing");
value.add("Automation Testing");
value.add("Java");
System.out.println(value.size());

for(int i=0;i<value.size();i++){
	System.out.println(value.get(i));
}
}
}
