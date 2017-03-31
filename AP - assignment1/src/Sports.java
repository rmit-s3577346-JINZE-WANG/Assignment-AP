import java.util.ArrayList;

public abstract class Sports {
	private String sportsID;
	private Referee referee;
	private ArrayList<CompeteResult> competeResults;
	
	public Sports(String sportsID, Referee referee, ArrayList<Athlete> athletes){
		this.setSportsID(sportsID);
		this.setReferee(referee);
		this.setCompeteResults(
	}
	
	/*
	 * get unique ID for each game.
	 * @return
	 */
	public String getSportsID() {
		return sportsID;
	}
	
	/*
	 * set unique ID for each game
	 */
	public void setSportsID(String sportsID) {
		this.sportsID = sportsID;
	}
	
	/*
	 * get referee for each game
	 * @return
	 */
	public Referee getReferee() {
		return referee;
	}
	
	/*
	 * set referee for each game
	 */
	public void setReferee(Referee referee) {
		this.referee = referee;
	}
	
	
	public abstract int getTime();

	public ArrayList<CompeteResult> getCompeteResults() {
		return competeResults;
	}

	public void setCompeteResults(ArrayList<CompeteResult> competeResults) {
		this.competeResults = competeResults;
	}
	
	
}
