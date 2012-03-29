package minilab;

import java.io.*;

public class FileRenamer {

	public static void main(String[] args) throws IOException {

		File oldfile = new File("/home/titus/Desktop/newfile.txt");

		if (!oldfile.exists()) {

			System.out.println("File or directory does not exist.");

			System.exit(0);

		}

		System.out.print("please enter the new file or directory name : ");

		File newfile = new File("/home/titus/Desktop/newfile.mp3");

		System.out.println("Old File or directory name : " + oldfile);
		System.out.println("New File or directory name : " + newfile);
		boolean Rename = oldfile.renameTo(newfile);

		if (!Rename) {

			System.out
					.println("File or directory does not rename successfully.");

			System.exit(0);

		}

		else {

			System.out.println("File or directory rename is successfully.");

		}

	}

}