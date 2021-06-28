public class House {
	
	int bedrooms;
	double familyRoom;
	double livingRoom;
	String style;
	double plot;
	
	public House() {
		this.bedrooms = 0;
		this.familyRoom = 0;
		this.livingRoom = 0;
		this.style = "Unknown";
		this.plot = 0;
	}
	
	public House(String style, double familyRoom, double livingRoom, int bedrooms, double plot) {
		this.style = style;
		this.familyRoom = familyRoom;
		this.livingRoom = livingRoom;
		this.bedrooms = bedrooms;
		this.plot = plot;
		
	}
	
	public int getBedrooms() {
		return this.bedrooms;
	}
	public double getFamilyRoomArea() {
		return this.familyRoom;
	}
	public double getLivingRoomArea() {
		return this.livingRoom;
	}
	public double getPlot() {
		return this.plot;
	}
	public String getStyle() {
		return this.style;
	}
	public double getTotalArea() {
		return ((this.bedrooms * 300) + this.familyRoom + this.livingRoom);
	}
	
	public int compareArea(House otherHouse) {
		if(this.getTotalArea() - otherHouse.getTotalArea() < 0) {
			return -1;
		}
		else if (this.getTotalArea() - otherHouse.getTotalArea() > 0) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
	public void setBedrooms(int beds){
		this.bedrooms = beds;
	}
	public void setFamilyRoomArea(double family) {
		this.familyRoom = family;
	}
	public void setLivingRoomArea(double living) {
		this.livingRoom = living;
	}
	public void setPlot(double acres) {
		this.plot = acres;
	}
	public void setStyle(String type) {
		this.style = type;
	}
	
	public String toString() {
		return "House style = " + this.style + ", bedrooms = " + this.bedrooms + ", family room area = " + this.familyRoom + ", living room area = " + this.livingRoom + ", plot = " + this.plot + ", square feet  = " + this.getTotalArea();
	}
	
}
