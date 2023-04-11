package trainingTasks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AReadFileTraditional {
	public static void main(String[] args) {
		int i;
		FileInputStream fin;
		
		if(args.length != 1) {
			System.out.println("Usage of: ShowFile Test.txt");
			return;
		}
		
		try {
			fin = new FileInputStream(args[0]);
		} catch(FileNotFoundException e) {
			System.out.println("Can't open file");
			return;
		}
		
		try {
			do {
				i = fin.read();
				if(i != -1) {
					System.out.print((char) i);
				} 
			} while(i != -1);
		} catch(IOException e) {
			System.out.println("Read error!");
		} finally {
			try {
				fin.close();
			} catch (IOException e) {
				System.out.println("Error during closing!");
			}
		}
		
		try {
			fin.close();
		} catch (IOException e) {
			System.out.println("Error while closing");
		}
	}
}
