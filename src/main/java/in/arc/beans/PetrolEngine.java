package in.arc.beans;

public class PetrolEngine implements IEngine {

	public boolean start(int password) {
		System.out.println("PetrolEngine.strat() .. starting");
		if(password==1432) {
			System.out.println("Verified Password .. started PetrolEngine");
			return true;
		}
		return false;
	}
	public PetrolEngine() {

		System.out.println("PetrolEngine.PetrolEngine() 0 param constructor()");
	}

}
