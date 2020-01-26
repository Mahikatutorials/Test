package file;


	import java.io.*;  
	class rd_wrt{  
		
			public static void main(String args[])throws Exception{  
				File f = null;
			      boolean bool = false;
			      
				 try{
			         // create new file
			         f = new File("abc7.txt");
			         
			         // tries to create new file in the system
			         bool = f.createNewFile();
			         
			         // prints
			         System.out.println("File created: "+bool);
			         
			         // deletes file from the system
			         
			            
			      }catch(Exception e){
			         e.printStackTrace();
			      }
				 try{
			         // create new file
			         f = new File("ab7.txt");
			         
			         // tries to create new file in the system
			         bool = f.createNewFile();
			         
			         // prints
			         System.out.println("File created: "+bool);
			         
			         // deletes file from the system
			         
			            
			      }catch(Exception e){
			         e.printStackTrace();
			      }
				  try{  
					     FileOutputStream fout=new FileOutputStream("abc7.txt");  
					     String s="hello hw r u";  
					       
					     byte b[]=s.getBytes();  
					     fout.write(b);  
					       
					     fout.close();  
					  
					     System.out.println("success...");  
					    }catch(Exception e){System.out.println(e);}  
					  
			FileInputStream fin=new FileInputStream("abc7.txt");  
			FileOutputStream fout=new FileOutputStream("ab7.txt");  
			  
			int i=0;  
			while((i=fin.read())!=-1){  
			fout.write((byte)i);  
			}  
			  System.out.println("task done");
			fin.close();  
			fout.close();
			
			try{  
			    FileInputStream fin2=new FileInputStream("ab7.txt");  
			    int i1;  
			    while((i1=fin2.read())!=-1)  
			     System.out.print((char)i1);  
			  
			    fin2.close();  
			  }catch(Exception e){System.out.println(e);}  
			
			 }  
	
			}  