package Inheritence;

public class Mobile {
	private Sim s;
	
	//lazy instantiation
	public Sim createSim(long phone_num) {
		Sim s=new Sim(phone_num);
		return s;
	}
}
