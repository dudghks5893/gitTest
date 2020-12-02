package com.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
	
		// Ʈ���� �ȿ� �ִ°� �ۿ��� ���� ���⶧���� ���̳ο��� ������ �ݱ����� �ʱ� ���� ����
		File file = null;
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		try {
			 file = new File("myfile12.txt"); //���� �̸��� Ʋ���� ��ġ���� ����
			 fileReader = new FileReader(file); // ���ڸ� �ϳ��ϳ� ����
			// BufferedReader �Ѳ����� ���� ���ڿ��� ������ �ִ�
			 bufferedReader = new BufferedReader(fileReader); 
			
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
			finally {
				//������ �߻� �ϵ� ���ϵ� �� �ڵ����� ������ ����
				 try {
					 if(bufferedReader !=null)
					bufferedReader.close();
					 if(fileReader !=null)
					fileReader.close();
				} 
				 catch (IOException e) {
					System.out.println("������ ���� ������"+file.getName());
				}
				 catch (NullPointerException e) {
						System.out.println("���ʿ� ������ ��ã��");
					}
			}
	}
}
