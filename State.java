import java.util.ArrayList;

public class State {
	private String state;
	private String abbreviation;
	private int median; 
	private int stdDev;
	ArrayList<Integer> stateAreaCodes;
	
	public State() {
		 state = "";
		 abbreviation = "";
		 median = 0;
		 stdDev = 0;
		 stateAreaCodes = new ArrayList<>();
	}
	
	void setState(String state) {
		this.state = state;
	}
	
	String getState() {
		return state;
	}
	
	void setAbrev(String abrev) {
		abbreviation = abrev;
	}
	
	String getAbrev() {
		return abbreviation;
	}
	
	void setMedian(int median) {
		this.median = median;
	}
	
	int getMedian() {
		return median;
	}
	
	void setStdDev(int stdDev) {
		this.stdDev = stdDev;
	}
	
	int stdDev() {
		return stdDev;
	}
	
	
	
	void setAreaCode(String areaCode) {
		int length = areaCode.length();
		int counter = length / 3;
		int startAreaCodeIndex = 0;
		int endAreaCodeIndex = 3;
		
		while(counter != 0) {
			String parseAreaCode = areaCode.substring(startAreaCodeIndex, endAreaCodeIndex);
			int code = Integer.parseInt(parseAreaCode);
			stateAreaCodes.add(code);
			startAreaCodeIndex += 3;
			endAreaCodeIndex += 3;
			counter--;
			
			
		}
		
		
	}
	
	boolean verifyAreaCode(int areaCode) {
		
		if(stateAreaCodes.contains(areaCode)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
}
