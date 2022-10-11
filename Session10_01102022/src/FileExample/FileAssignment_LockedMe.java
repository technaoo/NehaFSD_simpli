package FileExample;
import java.io.*;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;



public class FileAssignment_LockedMe {

	public static void main(String[] args) throws IOException, InputMismatchException, NullPointerException
	{
		
		System.out.println("Welcome to the project --- LockedMe.com");
		System.out.println("Project developer - Neha Gandhi\n");
		String path = "/Users/vishal/eclipse-workspace/Session10_01102022/";

		
		while(true) 
		{
			System.out.println("Select the Operation: \n1. Display Contents of the folder \n2. File Menu \n3. Exit the program\n");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1: 
				
	
	
					//Display the folder contents
					File display = new File(path);
					File filenames[] = display.listFiles();
					Arrays.sort(filenames);		//Task 1 - Display folder contents in Ascending order
					for(File ff:filenames) {
						System.out.println(ff.getName());
					}
					System.out.println();
					break;
	
	
	
				case 2: 
			
					boolean q= true;
		
					//Switch case 
					//get user input for File operation 
					while(q) 
					{
					System.out.println("Do you want to:\n1. Add a file?\n2. Delete a file\n3. Search for a file\n4. Go back to Main menu \n");
					int ch = sc.nextInt();
					
					switch(ch) {
					case 1:	//Add a file
						System.out.println("Enter the file name");
						String filename=sc.next();
		
						FileOutputStream fo = new FileOutputStream(filename, true); //append information , bool true
						//FileWriter fo= new FileWriter(filename); //The file is already in stream of characters, so no need to create b again
						//if file is available, it opens in write mode else creates a new file
						if(fo!=null) {
							System.out.println("File has been available");
						}
						System.out.println("Enter data into the file");
						String inputOfFile = sc.next() + sc.nextLine();
						System.out.println(inputOfFile);
						byte b[]=inputOfFile.getBytes();  //Comment this line for FileWriter mode
						fo.write(b);
						System.out.println("Write operation completed\n");
						fo.close();
						
						break;
						
					case 2://Delete a file
						//Enter filename to delete
						System.out.println("Enter file name to delete: ");
						
						String findfile=sc.next();
						File fdelete = new File(path);		
						File fileslistd[]= fdelete.listFiles();
						boolean deletef = false;
						for(File fd:fileslistd) {	//Check for name case sensitivity
							if(findfile.compareTo(fd.getName())== 0){
								deletef=true;
								break;
							}
						}
						
						if(deletef==true) { //delete the filename entered
							File dpath = new File(path+ findfile);
							dpath.delete();
							System.out.println("The file has been deleted\n");
						}
						else {
							System.out.println("The file is not found/ cannot be deleted\n");
						}
		
						break;
						
					case 3://Search for a specific file
						System.out.println("Enter the filename to be searched ");
		
						String findfile1=sc.next();
						int flag=0;
						File ffind1 = new File(path);
						File fileslist1[] = ffind1.listFiles();
						for(File ff:fileslist1)
						{
							if(findfile1.compareTo(ff.getName()) == 0) {	//check case sensitivity
								flag=1;
								break;
								
		
							}
							else {
							flag=0;
								
		
							}
						}	
						if(flag==1) {
							System.out.println("The file is found.\n");
						}
						else {
							System.out.println("The file is not found.\n");
						}
						if(ffind1.exists()) {
							ffind1.delete();
						}
						break;
		
					case 4: 
						System.out.println("Exit\n");
						q=false;
						break;
						
					default:
						System.out.println("Enter a proper choice\n");
						break;
					}
					
					
				}
				break;
			
				case 3: 
					
					System.out.println("Exiting the main program\n");
					System.exit(0);
					
					
				default:
					{
						break;
					}
				}
			
			
			}
		
	}
	
}
