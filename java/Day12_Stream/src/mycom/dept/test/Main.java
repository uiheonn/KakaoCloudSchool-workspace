package mycom.dept.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		//FileInputStream fis=null; // 처음에 null로 초기화해야함. 메인 스트림
		//InputStreamReader isr=null; // 보조 스트림
		//BufferedReader br=null; // 보조 스트림
		BufferedReader br = null;
		
		try {
			//fis = new FileInputStream("test.txt");
			//isr = new InputStreamReader(fis); // 데코레이션 발생. byte 기반 -> 문자 기반
			br = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt"))); // 데코레이션 발생. 문자 기반 -> 버퍼링
			
			String string="";
			while((string=br.readLine())!=null) {
				System.out.println(string);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다");
		} catch (IOException e) {
			System.out.println("파일의 끝입니다.");
		} finally {
			if(br!=null) {
				br.close();
			}
			
		}
		
	}

}
