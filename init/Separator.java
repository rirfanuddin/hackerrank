package init;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Separator {

	public static void main(String[] args) {
		String line = "oeyeoy@gmail.com;ulfaintania1@gmail.com;paskaadil@gmail.com;erlinac1@gmail.com;";
		List<String> list = new ArrayList<String>();
		String[] sections = line.split(";");
		
		for(int i=0; i<sections.length; i++) {
			list.add(sections[i]);
		}
	
		
		for(String name : list ) {
			System.out.println(name);
		}
		

	}

}
