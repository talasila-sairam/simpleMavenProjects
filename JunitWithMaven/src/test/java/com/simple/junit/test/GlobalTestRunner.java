package com.simple.junit.test;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class GlobalTestRunner {

	public static void main(String[] args) {
		
		// Here you can the all the test cases like our normal core java program. 
		// in absence of IDE also you can run your test cases
		
		Result result = JUnitCore.runClasses(AppTest.class ,AppMutiplayTest.class);
		int count = result.getFailureCount();
		System.out.println("no of tests failure are "+count);
		List<Failure> listOfFailures =  result.getFailures();
		for(Failure failure : listOfFailures) {
			System.out.println(failure.toString());
			
		}
		
        }
}
