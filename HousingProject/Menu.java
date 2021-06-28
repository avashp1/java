import java.io.FileNotFoundException;
import java.util.*;
public class Menu {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		Subdivision s1 = new Subdivision();
		s1.fromDisk();
		System.out.println(s1.list());
		String user = "0";
		do {
			System.out.println("\n[0] to Exit");
			System.out.println("[1] Display All Houses in the Subdivision");
			System.out.println("[2] Add a House to the Subdivision");
			System.out.println("[3] Delete a House in the Subdivision");
			System.out.println("[4] Change a House in the Subdivision");
			System.out.println("[5] Filter Subdivision by Total Area and Display");
			System.out.println("[6] Filter Subdivision by Plot Size and Display");
			System.out.println("[7] Sort Subdivision by Total Area and Display");
			System.out.println("[8] Sort Subdivision by Plot Size and Display");
			System.out.println("[9] Save Subdivision to Text File");
			System.out.println("Enter a number from 0 to 9: \n");
			user = input.nextLine();
			switch(user) {
			case "0":
				System.exit(0);
				break;
			case "1":
				System.out.println(s1.list());
				break;
			case "2":
				System.out.println("Enter style: ");
				String style = input.nextLine();
				System.out.println("Enter number of bedrooms: ");
				int bRooms = Integer.parseInt(input.nextLine());
				System.out.println("Enter family room area: ");
				double fRoom = Double.parseDouble(input.nextLine());
				System.out.println("Enter living room area: ");
				double lRoom = Double.parseDouble(input.nextLine());
				System.out.println("Enter plot area: ");
				double plot = Double.parseDouble(input.nextLine());
				House h1 = new House(style, lRoom, fRoom, bRooms, plot);
				s1.add(h1);
				break;
			case "3":
				System.out.println("Enter index of house to delete: ");
				int index = Integer.parseInt(input.nextLine());
				s1.remove(index);
				break;
			case "4":
				System.out.println("Enter index of house to update: ");
				int i = Integer.parseInt(input.nextLine());
				s1.remove(i);
				System.out.println("Enter style: ");
				String s = input.nextLine();
				System.out.println("Enter number of bedrooms: ");
				int b = Integer.parseInt(input.nextLine());
				System.out.println("Enter family room area: ");
				double f = Double.parseDouble(input.nextLine());
				System.out.println("Enter living room area: ");
				double l = Double.parseDouble(input.nextLine());
				System.out.println("Enter plot area: ");
				double p = Double.parseDouble(input.nextLine());
				House h2 = new House(s, l, f, b, p);
				s1.update(i, h2);
				break;
			case "5":
				System.out.println("Enter floor for filter: ");
				double floor = Double.parseDouble(input.nextLine());
				System.out.println("Enter ceiling for filter: ");
				double ceiling = Double.parseDouble(input.nextLine());
				System.out.println(s1.listByArea(floor, ceiling));
				break;
			case "6":
				System.out.println("Enter floor for filter: ");
				double flor = Double.parseDouble(input.nextLine());
				System.out.println("Enter ceiling for filter: ");
				double ceil = Double.parseDouble(input.nextLine());
				System.out.println(s1.listByPlot(flor, ceil));
				break;
			case "7":
				System.out.println(s1.sortByArea());
				break;
			case "8":
				System.out.println(s1.sortByPlot());
				break;
			case "9":
				System.out.println("Save to file: " + s1.toDisk());
				break;
				default:
					System.out.println("Invalid input");
					break;
			}
		}while(user != "0");
		
	}
}
