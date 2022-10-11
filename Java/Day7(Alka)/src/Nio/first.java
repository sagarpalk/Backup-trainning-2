package Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class first {

	public static void main(String[] args) throws IOException{
		
		Path source=Paths.get("C://Users//sagarpalk//Desktop//demo.txt");
		Path destination=Paths.get("C://Users//sagarpalk//Desktop//target3.txt");
		
		Files.copy(source, destination);
		
	}

}
