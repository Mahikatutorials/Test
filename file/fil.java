package file;


	import java.io.File;

	public class fil {
	   public static void main(String[] args) {
	      
	      File f = null;
	      boolean bool = false;
	      
	      try{
	         // create new file
	         f = new File("ab.txt");
	         
	         // tries to create new file in the system
	         bool = f.createNewFile();
	         
	         // prints
	         System.out.println("File created: "+bool);
	         
	         // deletes file from the system
	         
	            
	      }catch(Exception e){
	         e.printStackTrace();
	      }
	   }
	}
