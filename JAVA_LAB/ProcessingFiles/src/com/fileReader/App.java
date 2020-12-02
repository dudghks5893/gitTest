package com.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
	
		// 트라이 안에 있는건 밖에서 쓸수 없기때문에 파이널에서 파일을 닫기위해 초기 값을 선정
		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			 file = new File("myfile12.txt"); //파일 이름이 틀려서 케치문이 나옴
			 fileReader = new FileReader(file); // 문자를 하나하나 읽음
			// BufferedReader 한꺼번에 많은 문자열을 읽을수 있다
			 bufferedReader = new BufferedReader(fileReader); 
			
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
			finally {
				//에러가 발생 하든 안하든 이 코드블록은 무조건 실행
				 try {
					 if(bufferedReader !=null)
					bufferedReader.close();
					 if(fileReader !=null)
					fileReader.close();
				} 
				 catch (IOException e) {
					System.out.println("파일을 닫지 못했음"+file.getName());
				}
				 catch (NullPointerException e) {
						System.out.println("애초에 파일을 못찾음");
					}
			}
	}
}
