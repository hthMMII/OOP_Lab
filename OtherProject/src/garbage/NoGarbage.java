package garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {

	public static void main(String[] args) throws IOException {
		String filename = "D:\\Program Files\\Coding Workspace\\Java\\OOP_Lab\\OtherProject\\src\\garbage\\test.txt";
		byte[] inputbytes = { 0 };
		long startTime, endTime;
		inputbytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		StringBuilder outputStringBulder = new StringBuilder();
		for (byte b : inputbytes) {
			outputStringBulder.append((char) b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}
