package Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class second {

	public static void main(String[] args) throws IOException{
		/*
		Path source=Paths.get("C://Users//sagarpalk//Desktop//demo.txt");
		Path destination=Paths.get("C://Users//sagarpalk//Desktop//target5.txt");
		
	
		 * Files.copy(source, destination); String
		 * fileName="C://Users//sagarpalk//Desktop//demo.txt"; String
		 * content="as as fsdfer ";
		 * 
		 * Files.write(Path.of(fileName), content.getBytes(StandardCharsets.UTF_8));
		 */
		
		String fileName="C://Users//sagarpalk//Desktop/demo.txt";
		Stream<String>lines=Files.lines(Path.of(fileName));
		lines.forEach(System.out::println);
		
		
	}

}
