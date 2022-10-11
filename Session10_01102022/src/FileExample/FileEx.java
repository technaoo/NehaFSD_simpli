package FileExample;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileEx {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the file name");
		String filename = sc.next();
		FileOutputStream fo = new FileOutputStream(filename, true); //append information , bool true
		//FileWriter fo= new FileWriter(filename); //The file is already in stream of characters, so no need to create b again
		//if file is available, it opens in write mode else creates a new file
		if(fo!=null) {
			System.out.println("file has been available");
			}
		System.out.println("enter data into file");
		String inputOfFile = sc.next() + sc.nextLine();
		System.out.println(inputOfFile);
		byte b[]=inputOfFile.getBytes();  //Comment this line for FileWriter mode
		fo.write(b);
		System.out.println("Write operation completed");
		fo.close();
		
		
	}
}
