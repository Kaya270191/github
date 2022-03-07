package model2.mvcboard;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mvcboard/view.do")
public class ViewController extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//게시물 불러오기
		MVCBoardDAO dao = new MVCBoardDAO();
		String idx = req.getParameter("idx");
		dao.updateVisitCount(idx);
		MVCBoardDTO dto = dao.selectView(idx);
		dao.close();
		
		// 게시물(dto) 저장 후 뷰로 포워드 
		req.setAttribute("dto", dto);
		req.getRequestDispatcher("/MVCBoard/View.jsp").forward(req, resp);
		
		
	}

}
