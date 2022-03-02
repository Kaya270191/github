package fileupload;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.oreilly.servlet.MultipartRequest;




public class FileUtil {

	//[�۾���] ����ó��-���� ���ε�
	//���Ͼ��ε�(multipart/form-data ��û)ó��
	public static MultipartRequest uploadFile(HttpServletRequest req, String saveDirectory, int maxPostSize) {
		try {
			//���� ���ε�
			return new MultipartRequest(req, saveDirectory, maxPostSize, "UTF-8");
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
