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

	//[글쓰기] 폼값처리-파일 업로드
	//파일업로드(multipart/form-data 요청)처리
	public static MultipartRequest uploadFile(HttpServletRequest req, String saveDirectory, int maxPostSize) {
		try {
			//파일 업로드
			return new MultipartRequest(req, saveDirectory, maxPostSize, "UTF-8");
			
		}
		catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
