package minilab;


public class GetFileExtension
{
  public static void main(String args[]) {
  String fileName = args[0];
  String fname="";
  String ext="";
  int mid= fileName.lastIndexOf(".");
  fname=fileName.substring(0,mid);
  ext=fileName.substring(mid+1,fileName.length());  
  System.out.println("File name ="+fname);
  System.out.println("Extension ="+ext);  
  }
}