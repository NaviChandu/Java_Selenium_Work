package com.annotations;
import org.testng.annotations.Test;
public class test {
	
	@Test(timeOut=10000)
	public void test1(){
		System.out.println("test1");
	}

}
