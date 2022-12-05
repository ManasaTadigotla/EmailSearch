package com.simpli;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class EmailValidation {

	public static void main(String[] args) 
	{
		
		String check = null;
		ArrayList<String> email=new ArrayList<String>();
		email.add("anitha.singh@hotmail.com");
		email.add("info_mail@gmail.com");
		email.add("Kriti-agarwal@yahoo.com");
		//System.out.println(email);
		//Available email ids in the array are displaying here for easy validation of output
		email.forEach(i->System.out.println(i));			
		Scanner inputEmail=new Scanner(System.in);	   
	    System.out.println("Enter the email you want to search for");
	    //Takes email id as input from user 
	    check=inputEmail.next();
	    boolean isFound=false;
	    for(int i=0;i<email.size();i++)
	    {
	    	try
	    	{
	    	Pattern p = Pattern.compile(email.get(i),Pattern.CASE_INSENSITIVE);
			Matcher c = p.matcher(check);
			isFound=c.matches();
	    	}
	    	catch (PatternSyntaxException e) 
	    	{
	    		System.out.println("Sorry pattern doesnot match");
	    		
			}
	    	finally 
	    	{
	    		email.clear();
	    		inputEmail.close();
			}
			if(isFound)
				System.out.println("This email exists");
			else
				continue;
				//System.out.println("not valid");
	    }
	    if(!isFound)
	    	System.out.println("This email doesnot exists");
	    	
	    		
	}

		


	}


