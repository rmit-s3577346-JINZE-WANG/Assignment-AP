import java.util.ArrayList;
import java.util.Random;

public class Swimming extends Sports {

	public Swimming(String sportsID, Referee referee, ArrayList<Athlete> athletes) {
		super(sportsID, referee, athletes);

	}
/*
 * generate a random time for swimming game from 100 to 200sec.
 */
	@Override
	public int getTime() {		
		Random r = new Random();
		
		return r.nextInt(101)+100;

	}

}
