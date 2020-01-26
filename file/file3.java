package file;


	import java.io.*;  
public	class file3{  
	  public static void main(String args[]){
		  File f = null;
	      boolean bool = false;
	      
	      try{
	         // create new file
	         f = new File("abc.txt");
	         
	         // tries to create new file in the system
	         bool = f.createNewFile();
	         
	         // prints
	         System.out.println("File created: "+bool);
	         
	         // deletes file from the system
	         
	            
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	   try{  
	     FileOutputStream fout=new FileOutputStream("abc.txt");  
	     String s="hello hw r u";  
	       
	     byte b[]=s.getBytes();  
	     fout.write(b);  
	       
	     fout.close();  
	  
	     System.out.println("success...");  
	    }catch(Exception e){System.out.println(e);}  
	  }
	  
} 
	  
	  
	 /* try{  
		    FileInputStream fin=new FileInputStream("abc.txt");  
		    int i;  
		    while((i=fin.read())!=-1)  
		     System.out.print((char)i);  
		  
		    fin.close();  
		  }catch(Exception e){System.out.println(e);}  
		 }  

	}  */

