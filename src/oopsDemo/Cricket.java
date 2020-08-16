package oopsDemo;

public class Cricket implements Sport {

	@Override
	public void admission() {
		System.out.println("Admission fees is $500");
		
	}
	@Override
	public void training() {
		System.out.println("Training is very important for athletes!");

	}
	
	@Override
	public void play() {
		System.out.println("Team is playing now");

	}

	

	

}
