import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class Subdivision {
	private ArrayList<House> houses = new ArrayList<>();
	public Subdivision() {
		
	}
	
	public boolean add(House h) {
		houses.add(h);
		if(houses.contains(h)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public House get(int i) {
		try {
			return houses.get(i);
		}
		catch(IndexOutOfBoundsException error) {
			return null;
		}
	}
	
	public int size() {
		return houses.size();
	}
	
	public ArrayList<House> list(){
		return houses;
	}
	
	public ArrayList<House> listByBedrooms(int floor, int ceiling){
		ArrayList<House> listByBedrooms = new ArrayList<>();
		for(int i=0; i<houses.size(); i++) {
			int numBeds = houses.get(i).getBedrooms();
			if(floor <= numBeds && ceiling >= numBeds) {
				listByBedrooms.add(houses.get(i));
			}
		}
		return listByBedrooms;
	}
	
	public ArrayList<House> listByArea(double floor, double ceiling){
		ArrayList<House> listByArea = new ArrayList<>();
		for(int i=0; i<houses.size(); i++) {
			double sqft = houses.get(i).getTotalArea();
			if(floor <= sqft && ceiling >= sqft) {
				listByArea.add(houses.get(i));
			}
		}
		return listByArea;
	}
	
	public ArrayList<House> listByPlot(double floor, double ceiling){
		ArrayList<House> listByPlot = new ArrayList<>();
		for(int i=0; i<houses.size(); i++) {
			double plot = houses.get(i).getPlot();
			if(floor <= plot && ceiling >= plot) {
				listByPlot.add(houses.get(i));
			}
		}
		return listByPlot;
	}
	
	public ArrayList<House> sortByPlot(){
		
		ArrayList<House> temp = (ArrayList<House>) houses.clone();
		
		House min = new House();
		int minIndex;
		for(int i=0; i<houses.size(); i++) {
			min = houses.get(i);
			minIndex = i;
			for(int j = i+1; j < houses.size(); j++) {
				if(min.getPlot() - houses.get(j).getPlot() > 0) {
					min = houses.get(j);
					minIndex = j;
				}
			}
			if(minIndex == i) {
				;
			}
			else {
				House tempo = houses.get(i);
				houses.set(i, houses.get(minIndex));
				houses.set(minIndex, tempo);
			}
			
		}
		ArrayList<House> temp2 = (ArrayList<House>) houses.clone();
		for(int i=0; i<houses.size(); i++) {
			houses.set(i, temp.get(i));
		}
		return temp2;
	}
	
	public ArrayList<House> sortByArea(){
		ArrayList<House> temp = (ArrayList<House>) houses.clone();
		
		House min = new House();
		int minIndex;
		for(int i=0; i<houses.size(); i++) {
			min = houses.get(i);
			minIndex = i;
			for(int j = i+1; j < houses.size(); j++) {
				if(min.compareArea(houses.get(j)) > 0) {
					min = houses.get(j);
					minIndex = j;
				}
			}
			if(minIndex == i) {
				;
			}
			else {
				House tempo = houses.get(i);
				houses.set(i, houses.get(minIndex));
				houses.set(minIndex, tempo);
			}
			
		}
		ArrayList<House> temp2 = (ArrayList<House>) houses.clone();
		for(int i=0; i<houses.size(); i++) {
			houses.set(i, temp.get(i));
		}
		return temp2;
	}
	
	public House find(String style) {
		for(int i=0; i<houses.size(); i++) {
			if(houses.get(i).getStyle() == style)
				return houses.get(i);
		}
		return null;
	}
	
	@Override
	public String toString() {
		String output = "";
		for(int i=0; i<houses.size(); i++) {
			output += houses.get(i).toString() + "\n";
		}
		return output;
	}
	
	public boolean toDisk(){
		File file = new File("subdivision.txt");
		PrintWriter text;
		try {
			text = new PrintWriter(file);
			String line = "";
			for(int i=0; i < houses.size(); i++) {
				line += houses.get(i).getStyle() + "," + houses.get(i).getFamilyRoomArea() + "," + houses.get(i).getLivingRoomArea() + "," + houses.get(i).getBedrooms() + "," + houses.get(i).getPlot() + "\n";
			}
			text.print(line);
			text.close();
			return true;
		} catch (FileNotFoundException e) {
			return false;
		}
		
	}
	
	public boolean fromDisk() throws FileNotFoundException {
		File file = new File("subdivision.txt");
		Scanner input;
			input = new Scanner(file);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				String[] house = line.split(",");
				String s = house[0];
				double fRoom = Double.parseDouble(house[1]);
				double lRoom = Double.parseDouble(house[2]);
				int bRoom = Integer.parseInt(house[3]);
				double p = Double.parseDouble(house[4]);
				House h = new House();
				h.setStyle(s);
				h.setBedrooms(bRoom);
				h.setLivingRoomArea(lRoom);
				h.setFamilyRoomArea(fRoom);
				h.setPlot(p);
				houses.add(h);
			}
				return true;
	}
	
	public void remove(int position) {
		houses.remove(position);
	}
	
	public void update(int position, House houseToUpdate) {
		houses.remove(position);
		houses.add(position, houseToUpdate);
	}
}
