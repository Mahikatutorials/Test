package file;
import java.io.*;  
public class fl_chr {
	
	
		 public static void main(String args[])throws Exception{  
		  
		  FileReader fr=new FileReader("abccc.txt");  
		  int i;  
		  while((i=fr.read())!=-1)  
		  System.out.print(i);  
		  
		  fr.close();  
		 }  
		}  

