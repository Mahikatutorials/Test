package file;


	//<b><i>Simple program of reading data from the file</i></b>  
	  
	import java.io.*;  
	public class file2{  
	 public static void main(String args[]){  
	  try{  
	    FileInputStream fin=new FileInputStream("abc.txt");  
	    int i;  
	    while((i=fin.read())!=-1)  
	     System.out.print((char)i);  
	  
	    fin.close();  
	  }catch(Exception e){System.out.println(e);}  
	 }  


	}


