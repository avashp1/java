import java.util.*;
import java.io.*;

public class Lab9c {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String fileName;
		ArrayList<String> boyNames = new ArrayList<String>();
        ArrayList<String> girlNames = new ArrayList<String>();
		ArrayList<String> both = new ArrayList<String>();
		
		System.out.print("Enter a file name for baby name ranking: ");
		fileName = input.nextLine();
		openFile(fileName, boyNames, girlNames);
		common(boyNames, girlNames, both);
		display(both);
	}
	
	public static void openFile(String fileName, ArrayList<String> boyNames, ArrayList<String> girlNames) {
		try {
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()) {
				String line = file.nextLine();
				String[] split = line.split("\\s+");
				boyNames.add(split[1]);
				girlNames.add(split[3]);
				}
		}
		catch(FileNotFoundException e) {
			System.out.println("The file was not found.");
		}
	}
	public static void common(ArrayList<String> boyNames, ArrayList<String> girlNames, ArrayList<String> both) {
        for(int i=0; i<boyNames.size(); i++) {
        	if(girlNames.contains(boyNames.get(i))) {
        		both.add(boyNames.get(i));
        	}
        }
	}
	public static void display(ArrayList<String> both) {
		System.out.println((both.size()) + " names are used for both genders");
		System.out.print("They are ");
		for(int i=0; i<both.size(); i++) {
			System.out.print(both.get(i) + ", ");
		}
	}
}
