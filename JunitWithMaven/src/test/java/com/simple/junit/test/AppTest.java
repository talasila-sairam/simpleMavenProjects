package com.simple.junit.test;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.simple.junit.App;

public class AppTest  {
	
	public AppTest() {
		//System.out.println("inside AppTest class constructor");
	}
  
	@BeforeClass   
    public static void setUpBeforeClass() throws Exception {  
       // This method will be called before constructor itself
		//System.out.println("before class");  
    }  
	
    @Before  
    public void setUp() throws Exception {  
    	//This method will be called before every method call
        //System.out.println("before");  
    }  
  
   
    @After  
    public void tearDown() throws Exception {
    	//This method will be called after every method call
        //System.out.println("after");  
    }  
  
    @AfterClass  
    public static void tearDownAfterClass() throws Exception {
    	//This method wiil be called when the controller about to go out 
        //System.out.println("after class");  
    }  
    
    
	//@Test
	@Test(timeout = 200)  //here you can specify time also
	public void testFindMax() {
		//This method will execute the testing logic on a piece of code
	   App app = new App();
	   int actual = app.findMax(new int[] {10,20,30,40});
	   assertTrue(actual == 40);
	  System.out.println("inside junit class testFindMax method");
	}

}
