package com.string;

import org.junit.Assert;
import org.junit.Test;

public class String1 {

	@Test	
	public void p0() {

		// TODO Auto-generated method stub
		//}else if (identifier.contains(ModuleIdentifiers.CHIX.getIdentifier())){
		String s1 = "acvjioef veijbv wrb wj ";
		Assert.assertTrue(s1.contains("vei"));

	}

	@Test	
	public void p1() {

		// TODO Auto-generated method stub
		//}else if (identifier.contains(ModuleIdentifiers.CHIX.getIdentifier())){
		String s1 = new String("acvjioef veijbv wrb wj ");
		s1 = s1.concat("pollo");
		s1 = s1.replace("o", "x");
		Assert.assertTrue(s1.contains("vei"));
		System.out.println(s1);

	}

}
