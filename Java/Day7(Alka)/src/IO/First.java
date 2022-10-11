package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class First {

	public static void main(String[] args) {
		try (FileReader s = new FileReader("C://Users//sagarpalk//Desktop//demo.txt");
				FileWriter fileWriter = new FileWriter("C://Users//sagarpalk//Desktop//target.txt")) {

			int temp;
			while ((temp = s.read()) != -1) {
				System.out.println((char) temp);
				fileWriter.write(temp);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
