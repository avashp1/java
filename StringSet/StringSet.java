import java.util.Arrays;

public class StringSet {
	
	private String[] stringSet;
	private int numObjects;
	
	public StringSet() {
		numObjects = 0;
		stringSet = new String[10];
	}
	
	public boolean add(String newStr) {
		if(numObjects < stringSet.length) {
			stringSet[numObjects] = newStr;
			numObjects++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void pop() {
		stringSet = Arrays.copyOf(stringSet, stringSet.length - 1);
	}
	
	public int size() {
		return numObjects;
	}
	
	public int numChars() {
		int total = 0;
		for(int i=0; i < stringSet.length; i++) {
			if(stringSet[i] != null) {
				total += stringSet[i].length();
			}
		}
		return total;
	}
	
	public int countStrings(String stringToLookFor) {
		int stringCounter = 0;
		for(int i=0; i < stringSet.length; i++) {
			if(stringSet[i] != null) {
				if(stringSet[i].contains(stringToLookFor)) {
					stringCounter++;
				}
			}
		}
		return stringCounter;
	}
}
