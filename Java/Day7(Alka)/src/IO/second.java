package IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class second {

	public static void main(String[] args) throws IOException{
		File file=new File("C://Users//sagarpalk//Desktop//demo.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br= new BufferedReader(fr);
		String line;
		line = br.readLine();
		while( line != null) {
			if(line.contains("hello")) {
				System.out.println(line);
			}
		}
		br.close();
		fr.close();
		

}}
