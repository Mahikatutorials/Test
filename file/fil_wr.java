package file;

import java.io.FileOutputStream;

public class fil_wr {
	
	 public static void main(String args[]){  
		   try{  
		     FileOutputStream fout=new FileOutputStream("abcc.txt");  
		     String s="Sachin\n";  
		     String s1="kapilis my favourite singer";  
		     byte b[]=s.getBytes();  
		     fout.write(b); 
		     //fout.write("\n");
		      b=s1.getBytes();  
		     fout.write(b);  
		     fout.close();  
		  
		     System.out.println("success...");  
		    }catch(Exception e){System.out.println(e);}  
		  }  
}
