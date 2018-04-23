package com.simple.junit;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileReaderTest {
public static void main(String[] args) throws IOException {
	System.out.println("inside main method");
	
	/* Directly if you pass a file name to File class constructor that file should be there in
	 * classpath of the application otherwise it will throw file not found exception
	 * here you can pass either absolute path or you can pass relative path 
	 * if you pass absolute path there will be a no problem bcz here we are providing complete path
	 * but incase of relative path you should placed those files inside of the classpath or what ever the
	 * path you have specified ,relatively to that path you need to provide the file name
	 *   
	 * incase of maven application we used to store the files in resources directory but 
	 * this directory wont come as default in core java gan co-ordinates we need to create it by own
	 * and we need to tell to the maven that build this directory also while you are building 
	 * so that this directory contains files will be placed under classpath ;ocation of the application
	 * 
	 * i have provided that configuration information to place those files under classpath in pom.xml
	 * incase of web application we will place all the files like properties and error files and 
	 * internationalization files under resource directory of maven project and we will run build
	 * so it will be compiled and runs the test cases and packages and install's in local repository
	 *  
	 *  when we run that project it will placed inside the webapps directory of tomcat and 
	 *  it will extract the war file when you run the server like
	 *  
	 *  Project Name(Directory)
	 *    |
	 *    |--META-INF
	 *         |
	 *         |-- MANIFEST.MF
	 *    |
	 *    |--WEB-INF
	 *         |
	 *         |-- CLASSES
	 *               |
	 *               | -- com.*   (Those class files with packages)
	 *               | -- .properties (All the files which we placed under resource directory)
	 *               
	 *         |-- LIB
	 *              |
	 *              |-- jars
	 *         |-- VIEWS
	 *              |
	 *              | -- .jsp files
	 *         | application-context.xml
	 *         |-dispathcer-servelet.xml   
	 *     |- all the html pages and static pages 
	 *     
	 *  Incase of web application automatically container is extracting that war file and placing all those files under ProjectName directory
	 *  As we are building project using maven it will remove that resource directory and will place all the files under classpath (.properties files)
	 *  But incase of core java project we are not deploying it so nothing is there to extract the data. but if you extract manually you can not find out the
	 *  Resources directory it will be removed as part of the building process.so thats the reason they did not provided any resources directory as part of 
	 *  default gav co-ordinates. you have to create explicitly. and you need to configure in pom.xml also
	 *  you can place those files in resources folder but you need to pass the complete path(src/com/resource) to it then only it will be acessable by classloader
	 *  other wise class loader don't know that.problem once you biuild and extract it it will not be available but your code still contains it. 
	 *  one simple solution for this user classloader contains one method readResourceAsStream() to this method you need to pass file name so this class
	 *  loader will search in every folder and package of the application and it will load 
	 * */
	File infile = null;
	File outfile = null;
	FileInputStream fis = null;
	try{
		 infile = new File("src\\main\\resources\\dbprop.txt");
		 outfile = new File("dumpprop.txt");
		 fis = new FileInputStream(infile);
	     System.out.println("Absolute path  "+infile.getAbsolutePath());
		 System.out.println("Conical path  "+infile.getCanonicalPath());
		 System.out.println("Relative Path "+infile.getPath());
		
		 // InputStream fis = FileReaderTest.class.getClassLoader().getSystemResourceAsStream("dbprop.txt");
		 System.out.println(fis.available()+"hgv");

	     byte[] bt = new byte[fis.available()];
	     OutputStream os = null;
	     os = new FileOutputStream(outfile);
	     fis.read(bt);
	     os.write(bt);
	}catch(Exception e){
		System.out.println("exception details "+e);
	}finally {
		fis.close();
		
	}
}
}
