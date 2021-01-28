package PeerPackage;

public class Factorials {
	public static void main(String[] args) {
		double factNumber = 120;
		int divStart = 1;
		
		while(factNumber>1) {
			if ((int) factNumber == factNumber) {
				factNumber /= divStart;
				if (factNumber > 1) {
					divStart ++;
				}
			} else {
				System.out.println("None");
				return;
			}
		}
		System.out.println(divStart);
	}
}
