package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class third {

	public static void main(String[] args) {
		try (FileInputStream s = new FileInputStream("C://Users//sagarpalk//Desktop//demo.txt");
				FileOutputStream fileWriter = new FileOutputStream("C://Users//sagarpalk//Desktop//target1.txt")) {

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
