package Nio;

import java.nio.file.FileSystems;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;

public class WatchServiceDemo  {

	public static void main(String[] args) throws IOException,InterruptedException {
		WatchService watchService = FileSystems.getDefault().newWatchService();
	
		Path path = Paths.get("E:/temp");
		
		path.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);
		
		boolean poll = true;
		
		while (poll) {
		
		  WatchKey key = watchService.take();
		
		  for (WatchEvent<?> event : key.pollEvents()) {
		
		    System.out.println("Event kind : " + event.kind() + " - File : " + event.context());
		
		  }
		
		key.reset();
	
		}
	}

}
