package com.test;

class NotANumberException extends RuntimeException{
	
	public NotANumberException(String msg)
	{
		super(msg);
	}
}

public class T2 {
	
	public static void main(String[] args)
	{
	  System.err.println("This is test");
	  System.out.println("This is another test");
//	  System.err.println("This is test2");
	}

}

//
//String s1="test";
//String s2="test";
//String s3=new String("test");		
//System.out.println(s1.equals(s3));
//System.out.println(s1==s3);
//String val="I am the king. I am the silent rainmke. I am is"
//		+ " the creative force of the universe";
//
//String [] spl=val.split(" ");
//int count=0;
//
//for(int i=0; i<spl.length;i++)
//{
//	if(spl[i].equalsIgnoreCase("the"))
//	{
//		count++;
//	}
//}
//System.out.println(count);


//String s="Test";		
//char[] c=s.toCharArray();
//
//if(!Character.isDigit(c[0]))
//{
//	throw new NotANumberException("The first content in given string is not a numeric data");
//}