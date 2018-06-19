package file_handling;
import java.io.*;
public class filehandling3 {
public static void main(String [] args)
{try {
	FileInputStream in=new FileInputStream("F:/abc.txt");
	FileOutputStream out=new FileOutputStream("F:/xyz.txt");
	
	BufferedInputStream bin=new BufferedInputStream(in);
	PrintStream p=new PrintStream(out);
	int current=bin.read();
	while(current!=-1)
	{
		p.print((char)current);
		current=bin.read();
	}
	
	FileInputStream in1=new FileInputStream("F:/xyz.txt");
	bin=new BufferedInputStream(in1);
	while((current=bin.read())!=-1)
	{
		System.out.print((char)current);
	}
	in.close();
	out.close();
	bin.close();
			
}
catch(Exception e)
{
	System.out.println(e);
}

}
}