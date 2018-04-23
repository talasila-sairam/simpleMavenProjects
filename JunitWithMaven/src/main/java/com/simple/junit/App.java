package com.simple.junit;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        int max = app.findMax(new int[] {10,20 ,89});
        System.out.println("from main method max value is "+max);
    }
    
    public static int findMax(int[] arr) {
    	int max = 0;
    	for(int i=0;i<arr.length;i++) {
    		if(max < arr[i]) {
    			max = arr[i];
    		}
    	}
    	System.out.println("findMax method returns the value is "+max);
    	return max;
    }
    
    public int multiply(int a ,int b) {
    	System.out.println("inside muliplay method");
    	return a*b;
    }
    
    
}
