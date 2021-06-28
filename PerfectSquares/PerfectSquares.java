/*Avash Poudel*/
public class Lab7b {
	public static void main(String[] args) {
		Boolean[] bool = new Boolean[100];
		for(int i=0; i<bool.length; i++) {
			bool[i] = true;
		}
		for(int i=2; i<bool.length+1; i++) {
			for(int j=i-1; j<bool.length; j=j+i) {
				if(bool[j]) {
					bool[j] = false;
				}
				else {
					bool[j] = true;
				}
			}
		}
		for(int i=0; i<bool.length; i++) {
			if(bool[i]) {
				System.out.println("Locker L" + (i+1) + " is open.");
			}
		}
	}
}
