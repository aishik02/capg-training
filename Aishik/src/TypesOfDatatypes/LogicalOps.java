package TypesOfDatatypes;

public class LogicalOps {
	public static void main(String[] args) {
		int ram=16;
		double price=130000;
		int storage=64;
		System.out.println(((ram==8) || (storage>=128))?"BUY":"You're poor");
	}	
}
