package file;

import java.io.FileInputStream;
import java.io.FilterInputStream;

public class fl_rd {

	public static void main(String args[]){  
		  try{  
		    FileInputStream fin=new FileInputStream("abcc.txt");  
		    int i;  
		    while((i=fin.read())!=-1)  
		    {
		    	//if(i==10)
		    		//System.out.println("\n");
		    
		     System.out.print((char)i);  
		    }
		    fin.close();  
		  }catch(Exception e){System.out.println(e);}  
		 }  
}
