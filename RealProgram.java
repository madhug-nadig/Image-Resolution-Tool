import java.io.File;
import java.io.IOException;
import java.util.*;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class RealProgram {
	
	ListFiles lf = new ListFiles();
	
/*
String readAll(String[] files){
	String textDataAll = "";
	for(int q= 0; q< files.length; q++){
		textDataAll = textDataAll + readFile(files[q]);
	}
	return textDataAll;
}
 
*/

void resizeImage( String[] fileList , int index, int newHeight, int newWidth) throws IOException{
	
	System.out.println("\nThe image:\t" + fileList[index] + "\n");
	BufferedImage resized= readyImage(fileList[index], newHeight, newWidth);
	if(fileList[index].endsWith(".jpg")||fileList[index].endsWith(".JPG")||fileList[index].endsWith(".jpeg")||fileList[index].endsWith(".JPEG")){
			System.out.println(fileList[index]);
			ImageIO.write(resized, "jpg", new File("photos//"+fileList[index])); 
		}
	else if(fileList[index].endsWith(".png")||fileList[index].endsWith(".PNG")){
			System.out.println(fileList[index]);
			ImageIO.write(resized, "png", new File("photos//"+fileList[index])); 
		}
	System.out.println("The new size shall be: "+ newHeight + " * " + newWidth);
	
	}

private BufferedImage readyImage(String fileName, int newHeight, int newWidth) {
    try{	
		BufferedImage originalImage = ImageIO.read(new File("photos//"+fileName));
		int type = originalImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : originalImage.getType();
		
		BufferedImage resizedImage = new BufferedImage(newWidth, newHeight, type);
		Graphics2D g = resizedImage.createGraphics();
		g.drawImage(originalImage, 0, 0, newWidth, newHeight, null);
		g.dispose();
		
		return resizedImage;
	}
	
	catch(IOException e){
		System.out.println("IO problem, man");
	}
	return null;
 }

	
}