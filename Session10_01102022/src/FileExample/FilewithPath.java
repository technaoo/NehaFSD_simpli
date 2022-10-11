package FileExample;
import java.util.Scanner;
import java.io.File;

public class FilewithPath {

	public static void main(String[] args) {
		String path = "F:\\Files\\";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=sc.next();
		//file
		File f = new File(path+filename);
		//delete a file
		boolean b= f.delete();
		if(b==true) {
			System.out.println("file has been deleted");
		}
		else {
			System.out.println("file is not found");
		}
			
		sc.close();
	}

}
