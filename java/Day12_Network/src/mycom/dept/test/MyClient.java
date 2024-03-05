package mycom.dept.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;


import java.net.*;
import java.io.*;

public class MyClient {
	String ipAddress="172.16.0.61";
	int portNum=5000;
	Socket connector=null;
	BufferedReader br=null;
	// 직렬화
	OutputStream os;
	ObjectOutputStream oos;
	// 역직렬화
	String receiveData;
	InputStream is;
	ObjectInputStream ois;
	
	public MyClient() throws IOException {
		System.out.println("***클라이언트 실행***");
		try {
			// Connection 요청을 하는 것
			connector = new Socket(ipAddress, portNum);
			
			// 키보드로부터 전송시킬 데이터를 입력받아 놓는 것
			br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("입력-->");
			
			// 데이터 전송
			String sendData=""; // Object
			os = connector.getOutputStream(); // 내 정보를 보내기 위해 빨대를 꽂는다
			oos = new ObjectOutputStream(os); // 보조 스트림
			
			while((sendData=br.readLine())!=null) {
				System.out.println(sendData);
				oos.writeObject(sendData); // 직렬화
				// 출력 버퍼
			    oos.flush();
				if(sendData.equals("quit"))
					break;
			}
			// 에코 서버에서 받은 메시지를 출력
			is = connector.getInputStream();
			ois = new ObjectInputStream(is); // 바이트 --> Object로 만드는 보조스트림
			receiveData = (String)ois.readObject();
			System.out.println(connector.getInetAddress() + "로부터 받은 메시지: " +  receiveData);
			
			// 커넥션 해제
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("문자열로 변환할 수 없습니다");
		} finally {
			if(br!=null) br.close();
			if(oos!=null) br.close();
			if(os!=null) br.close();
			if(ois!=null) br.close();
			if(is!=null) br.close();
		}
		
	}
}
