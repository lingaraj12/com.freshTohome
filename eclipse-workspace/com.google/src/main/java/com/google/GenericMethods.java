package com.google;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GenericMethods {
   public String PropertyReader(String rt) throws IOException
   
   {
	   Properties pr=new Properties();
	   BufferedReader br=new BufferedReader(new FileReader("environment.properties"));
	   pr.load(br);
	   String st=pr.getProperty("URL");
	 //  System.out.println(st);
	   return rt;
   }
	
	
	
}
