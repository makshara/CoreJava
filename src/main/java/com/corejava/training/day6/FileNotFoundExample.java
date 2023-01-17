package com.corejava.training.day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File f = new File("file.txt");
			FileReader r = new FileReader(f);
		}catch(FileNotFoundException e) {
			System.out.println("File not found exception - file doesn't exists");
		}
	}

}
