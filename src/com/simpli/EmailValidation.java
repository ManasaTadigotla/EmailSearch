package com.simpli;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) 
	{
		

		ArrayList<String> email=new ArrayList<String>();
		email.add("anitha.singh@hotmail.com");
		email.add("info_mail@gmail.com");
		email.add("Kriti-agarwal@yahoo.com");
		System.out.println(email);
		email.forEach(i->System.out.println(i));
		
		String check = null;
		Scanner inputEmail=new Scanner(System.in);
		//System.out.println("Enter email");
		//check=input.next();
		
		//String validPat = ("^[a-z][._%+-]+@[a-z0-9.-]+\\.[a-z]$");
		
	    //Pattern p = Pattern.compile(validPat, Pattern.CASE_INSENSITIVE);
	    System.out.println("Enter the email you want to search for");
	    
	    check=inputEmail.next();
	    boolean isFound=false;
	    for(int i=0;i<email.size();i++)
	    {
	    	
	    	Pattern p = Pattern.compile(email.get(i),Pattern.CASE_INSENSITIVE);
			Matcher c = p.matcher(check);
			isFound=c.matches();
			if(c.matches())
				System.out.println("This email exists");
			else
				continue;
				//System.out.println("not valid");


	    }
	    if(!isFound)
	    	System.out.println("This email doesnot exists");
	    	
	    		
	}

		


	}


