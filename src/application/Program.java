package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		String path = "c:\\temp\\out.txt";
		String[] lines = new String[] {"Good morning","good afternoon","good night"};
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
				System.out.println("Gravado");
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}	
	}
}
