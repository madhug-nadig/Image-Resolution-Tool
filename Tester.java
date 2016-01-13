import java.util.*;
import java.io.IOException;

public class Tester{

	public static void main(String args[]){
	
	Scanner scanner = new Scanner(System.in);
	
	int choice;
	RealProgram rp = new RealProgram();
	ListFiles lf = new ListFiles();
	String[] fileList = lf.createArray();
	
	System.out.println("Please enter the name: ");
    String name = scanner.next();
	
	do{
	
	System.out.println("\nHello " + name + ", What can I do for you? \n");
	System.out.println("1. Show the list of photos:");
	System.out.println("2. Change the resolution of an  image(Enter the index)");
	System.out.println("3. Change the resolution of all images");
	System.out.println("4. Exit");
	
	choice= scanner.nextInt();
	
	switch(choice){
		case 1: lf.displayList(fileList);
		break;
		case 2:
			System.out.println("Enter the index of the place: ");
			int index = scanner.nextInt();
		try{
			System.out.println("Enter the new height: \n");
			int newHeight= scanner.nextInt();
			System.out.println("Enter the new width: \n");
			int newWidth= scanner.nextInt();			
			rp.resizeImage(fileList, (index-1), newHeight, newWidth);
			System.out.println("Much Success");
		}
		catch (IOException e){
			e.printStackTrace();
			System.out.println("Failed!");
		}
		break;
		case 3:
			//try{
				System.out.println();
				/*rp.displayAll(fileList);
			}
			catch(IOException e){
				System.out.println("IO Problem");
			}
			lf.openBrowser();*/
		break;
		default:
		if(choice!=4)
			System.out.println("Enter proper choice");
		else
			System.out.println("\nBye");
		break;
	}
	}
	while(choice!=4);
}
}