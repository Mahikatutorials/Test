package file;
import java.io.*;  
public class cnsl2 {
	
	
	public static void main(String args[]){  
	  
	Console c=System.console();  
	  
	System.out.println("Enter password");  
	char[] ch=c.readPassword();  
	  
	System.out.println("Password is");  
	for(char ch2:ch)  
	System.out.print(ch2);  
	  
	}  
	}   
