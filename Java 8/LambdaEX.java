package com.java8.example;


interface JNTU{
	
	int GetTuitionFee(int fee);
}

public class LambdaEX {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JNTU PullaReddy = (fee)->{return fee;};
		System.out.println("PullaReddy tuition Fee = "+PullaReddy.GetTuitionFee(60000));
		
		JNTU KVSR = (fee)->{return fee;};
		System.out.println("PullaReddy tuition Fee = "+KVSR.GetTuitionFee(80000));
		
		JNTU GPREC = (fee)->{return fee;};
		System.out.println("PullaReddy tuition Fee = "+GPREC.GetTuitionFee(90000));
		
		JNTU Pullaiah = (fee)->{return fee;};
		System.out.println("PullaReddy tuition Fee = "+Pullaiah.GetTuitionFee(90000));
	}
}
