package in.arc.beans;

public class DieselEngine implements IEngine {

	public boolean start(int password) {
		System.out.println("DieselEngine.strat() starting..!!!");
		if(password==1432) {
			System.out.println("Verified Password .. started DieselEngine");
			return true;
		}
		return false;
	}
	public DieselEngine() {

		System.out.println("DieselEngine.PetrolEngine() 0 param constructor()");
	}

}
