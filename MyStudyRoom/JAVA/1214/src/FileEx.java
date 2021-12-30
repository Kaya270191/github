//p. 473 예제8-8
// File 클래스를 이용하여 파일의 타입을 알아내고 , 디렉터리에 있는 파일들을 나열하며, 
// 디렉터리 이름을 변경하는 프로그램 작성 

import java.io.File;

public class FileEx { 
	
	//디렉토리에 포함된 파일과 서브 디렉토리의 이름, 크기, 수정시간을 출력하는 메소드 
	public static void listDirectory(File dir) { //getPath() 완전 경로명 
		System.out.println("-----" + dir.getPath() + "의 서브 리스트입니다.-----");
		
		File[] subFiles = dir.listFiles(); //디렉토리에 포함된 파일과 디렉토리 이름의 리스트 얻기
		
		for(int i=0; i<subFiles.length; i++) { //subFiles 배열의 각 File에 대해 루프
			File f = subFiles[i];
			long t = f.lastModified(); //마지막으로 수정된 시간
			System.out.println(f.getName()); //파일명 
			System.out.println("\t파일 크기: " + f.length()); 
			System.out.printf("\t 수정한 시간: %tb %td %ta %tT\n" , t,t,t,t);
		}
	}

	public static void main(String[] args) {
		File f1 = new File("c:\\windows\\system.ini");
		//getPath()경로  getParent() 부모 디렉터리  getName()파일명 
		System.out.println(f1.getPath() + "," + f1.getParent() + "," + f1.getName());
		
		
		String res=""; // isFile() isDirectory() 는 경로명이 파일인지 디렉토리인지에 따라true/false리턴
		if(f1.isFile()) res = "파일"; //파일 타입이면
		else if(f1.isDirectory()) res = " 디렉토리"; //티렉토리 타입이면 
		System.out.println(f1.getPath() + "은" + res + "입니다");
		
		File f2 = new File("c:\\Temp\\java_sample"); //새로 만들고자 하는 디렉터리
		if(!f2.exists()) { //f2 디렉터리가 존재하는지 검사 
			f2.mkdir(); //존재 안하면 디렉토리 생성 
		}
		
		listDirectory(new File("c:\\Temp")); // c:\Temp 에 있는 파일 리스트 출력 
		f2.renameTo(new File("c:\\Temp\\javasample")); //java_sample-> javasample로 이름변경 
		
		listDirectory(new File("c:\\Temp")); //리스트 출력 
	}
}
