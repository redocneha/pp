import java.io.*;
public class IODemo
{
public static void main(String args[])
{
try
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter file name");
String fname=br.readLine();
File f=new File(fname);
if(f.exists()) {}
else
System.out.println("Sorry file doesnt exist");
}
catch(Exception e)
{
System.out.println(e);
}
}
}