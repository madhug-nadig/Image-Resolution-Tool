import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Desktop;
import java.util.*;

public class ListFiles {

Scanner in = new Scanner(System.in);

 String stripExtension (String str) {
        if (str == null) return null;

        int pos = str.lastIndexOf(".");

        if (pos == -1) return str;
			return str.substring(0, pos);
    }
 
 
void displayList(String[] fileList){
		for(int i=0; i< fileList.length; i++){
		System.out.println("\t"+ (i+1) + ". " + fileList[i]);
		}
 }
 
 public String[] createArray()
{
   String path = "."; 
 
  String files;
  String[] fileList;
  File folder = new File("photos");
  File[] listOfFiles = folder.listFiles(); 
  System.out.println("\n");
  int c = 1;
  fileList = new String[listOfFiles.length];
  for (int i = 0; i < listOfFiles.length; i++) 
  {
   if (listOfFiles[i].isFile()) 
   {
   files = listOfFiles[i].getName();
       if (files.endsWith(".jpg") || files.endsWith(".JPG")|| files.endsWith(".JPEG")|| files.endsWith(".jpeg")|| files.endsWith(".PNG")|| files.endsWith(".png"))
       {
		  String name = files;
		  fileList[c-1]= name;
		  c++;
        }
     }
  }
  return fileList;
}
}