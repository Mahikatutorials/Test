package file;
import java.io.*;
public class fl_wtr {
  
	 public static void main(String args[]){  
	  try{  
	   FileWriter fw=new FileWriter("abccc.txt",true);  
	   fw.write("my name is sachin");  
	   //fw.flush();  
	   fw.write("my name is mahi");
	   fw.close();  
	  }catch(Exception e){System.out.println(e);}  
	  System.out.println("success");  
	 }  
	}  

