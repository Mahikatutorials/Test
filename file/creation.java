package file;
import java.io.*;

import java.lang.*;
class creation

{

public static void main() throws IOException
{

BufferedReader ob= new BufferedReader(new InputStreamReader(System.in));

File f=new File("emp1.txt");

int i, bs;

if (f.exists())
   {
    System.out.println("file already exists");

    System.exit(0);
}

else
{
FileWriter fstream = new FileWriter(f);

BufferedWriter out= new BufferedWriter(fstream);
for(i=0;i<3;i++)

{

System.out.println("plz enter the name");

String s=ob.readLine();

out.write(s);

out.flush();

System.out.println("plz enter the basic salary");

s=ob.readLine();

out.write(s);

out.flush();

}

out.close();

}

}

}
