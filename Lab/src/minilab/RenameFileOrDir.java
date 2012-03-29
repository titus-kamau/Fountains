package minilab;
import java.io.*;

  public class RenameFileOrDir{
 
 public static void main(String[] args) throws IOException{
  BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  System.out.print("Please enter the file or directory name which has to be Renamed : ");
  
  String old_name = in.readLine();
  File oldfile = new File(old_name);
 
 
  if(!oldfile.exists())
{
 
  System.out.println("File or directory does not exist.");
  
  System.exit(0);

  }
 
  System.out.print("please enter the new file or directory name : ");
 
  String new_name = in.readLine();

  File newfile = new File(new_name);
 
  System.out.println("Old File or directory name : "+ oldfile);
  System.out.println("New File or directory name : "+ newfile);
  boolean Rename = oldfile.renameTo(newfile);
  

    if(!Rename)
{

  System.out.println("File or directory does not rename successfully.");

    System.exit(0);
  
  }
 
 else {

  System.out.println("File or directory rename is successfully.");

  }

  }

} 