package enumDemo;

enum EarthDirectionO {
	EAST, WEST, NORTH, SOUTH
	//Credit PayPal, Debit, Cash
}

public class EnumDeclear {
	EarthDirectionO dir;

	public EnumDeclear(EarthDirectionO dirr) {
		this.dir = dirr;
	}

	public void getMyDirection() {
		switch (dir) {
		case EAST:
			System.out.println("In East Direction");
			break;

		case WEST:
			System.out.println("In West Direction");
			break;

		case NORTH:
			System.out.println("In North Direction");
			break;

		default:
			System.out.println("In South Direction");
			break;
		}
	}

	public static void main(String[] args) {
		
		EnumDeclear obj1 = new EnumDeclear(EarthDirectionO.EAST);
		obj1.getMyDirection();
		EnumDeclear obj2 = new EnumDeclear(EarthDirectionO.SOUTH);
		obj2.getMyDirection();
	}
}
