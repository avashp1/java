import java.io.FileNotFoundException;

public class SubdivisionTester {

	public static void main(String[] args) throws FileNotFoundException{
		House h1 = new House();
		h1.setBedrooms(3);
		h1.setFamilyRoomArea(300.5);
		h1.setLivingRoomArea(180.3);
		h1.setStyle("Ranch");
		h1.setPlot(1.0);		
		
		House h2 = new House("Colonial", 200, 300, 1, 2.5);

		Subdivision subdivision = new Subdivision();
		subdivision.add(h1);
		subdivision.add(h2);
		
		System.out.println("List: " + subdivision.list() + "\n");
		System.out.println("List by area: " + subdivision.listByArea(0, 1000) + "\n");
		System.out.println("List by plot: " + subdivision.listByPlot(0, 0.9));
		System.out.println("List by bedrooms: " + subdivision.listByBedrooms(1, 3) + "\n");
		
		System.out.println("Size: " + subdivision.size() + "\n");
		
		System.out.println("Find 'ranch': " + subdivision.find("Ranch") + "\n");
		System.out.println("Get at index 1: " + subdivision.get(1) + "\n");
		
		System.out.println("ToString: " + subdivision.toString() + "\n");
		
		System.out.println("Sort by Area: " + subdivision.sortByArea() + "\n");
		System.out.println("Sort by Plot: " + subdivision.sortByPlot() + "\n");
		
		System.out.println("Write file: " + subdivision.toDisk() + "\n");
		System.out.println("Read file: " + subdivision.fromDisk() + "\n");
		
		subdivision.remove(0);
		System.out.println("Removed at index 0");
		System.out.println(subdivision.list() + "\n");
		
		System.out.println("Added after:");
		subdivision.add(h1);
		System.out.println(subdivision.list() + "\n");
		
		subdivision.update(1, h2);
		System.out.println("Updated at index 1");
		System.out.println(subdivision.list() + "\n");
		
	}

}