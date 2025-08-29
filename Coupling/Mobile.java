package com.coupling.ex;

public class Mobile {
	
	
	Mobile(Sim s){
		s.display();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AirtelSim a = new AirtelSim();
		Mobile m1 = new Mobile(a);
		IdeaSim i = new IdeaSim();
		Mobile m2 = new Mobile(i);
		JioSim j = new JioSim();
		Mobile m3 = new Mobile(j);
	}

}
