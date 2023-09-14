package HW_4_ex7;
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class SeekPosition2 {

	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);
		RandomAccessFile raf =null;
		String fileName;
		int position;
		int numChar;
		
		File file1 = new File("C:\\Users\\blake\\Desktop\\1302 files\\HW4\\input1.txt");
		File file2 = new File("C:\\Users\\blake\\Desktop\\1302 files\\HW4\\input2.txt");
		
		System.out.println("Please enter file name: ");
		fileName = keyboard.nextLine();
		
		System.out.println("Please enter the position of the file you want to access: ");
		position = Integer.parseInt(keyboard.nextLine());
		
		System.out.println("How many characters would you like to read?: ");
		numChar = keyboard.nextInt();
		
		try {
			raf = new RandomAccessFile(new File(fileName),"r");
			raf.seek(position);
			System.out.println("Your text file: ");
			for(int i = 0; i<numChar; i++) {
				byte b = raf.readByte();
				System.out.print((char)b);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

}
