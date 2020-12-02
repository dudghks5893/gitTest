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
		// �ֱ� ���� ������ ����� �ڵ����� ������ �ݱ���  ���̳ι��� �Ƚᵵ��
		try(FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);) {
			
			String line = bufferedReader.readLine(); // ������ ������ ����ó��
			
			while(line != null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
			
		} catch (FileNotFoundException e) { //������ �� ã������
			System.out.println("������ ã������");
			// ������ �� �аų� ���� ���Ҷ� ex) ������ �ִµ� ������ null���̵� ������ ���� ���� �϶�
		} catch (IOException e) { // e�� ���� ��ü �̸� ������� ���� ���� 
			System.out.println("������ ��������");
		}
	}
}
