package com.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
	public static void main(String[] args) {
		
		//try-with-resources
		File file = new File("myfile12.txt");
		// 최근 버전 파일을 만들고 자동으로 파일을 닫기함  파이널문을 안써도됨
		try(FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			String line = bufferedReader.readLine(); // 파일을 읽을때 에러처리
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) { //파일을 못 찾았을때
			System.out.println("파일을 찾지못함");
			// 파일을 못 읽거나 쓰지 못할때 ex) 파일은 있는데 파일이 null값이든 읽을수 없는 내용 일때
		} catch (IOException e) { // e는 에러 객체 이름 마음대로 지정 가능 
			System.out.println("파일을 읽지못함");
		}
	}
}
