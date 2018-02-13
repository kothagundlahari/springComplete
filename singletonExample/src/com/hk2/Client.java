package com.hk2;

import com.hk.Test;

public class Client {
	public static void main(String[] args) {
		Test t1 = Test.getInstance();
		Test t2 = Test.getInstance();
		
		if(t1==t2) {
			System.out.println("t1 and t2 are of the same instance ");
		}
		
		
	}

}
