
public class HouseTester {
	public static void main(String[] args) {
		House h1 = new House();
		House h2 = new House();
		
		h1.setBedrooms(2);
		h1.setFamilyRoomArea(400);
		h1.setLivingRoomArea(800);
		h1.setPlot(2.6);
		h1.setStyle("Colonial");
		
		System.out.println("House 1: ");
		System.out.println(h1.toString() + "\n");
		
		h2.setBedrooms(4);
		h2.setFamilyRoomArea(650);
		h2.setLivingRoomArea(300);
		h2.setPlot(1.2);
		h2.setStyle("Ranch");
		
		System.out.println("House 2: ");
		System.out.println(h2.toString() + "\n");
		
		if(h1.compareArea(h2) < 0) {
			System.out.println("House 2 is bigger in area.");
		}
		else if(h1.compareArea(h2) > 0) {
			System.out.println("House 1 is bigger in area.");
		}
		else {
			System.out.println("Both houses have the same area.");
		}
		
	}
}