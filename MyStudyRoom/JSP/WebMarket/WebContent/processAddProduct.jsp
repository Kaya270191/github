<%@ page contentType="text/html; charset=utf-8" %>
<%@ page import="com.oreilly.servlet.*" %>
<%@ page import="com.oreilly.servlet.multipart.*" %>
<%@ page import ="java.util.*" %>
<%@ page import ="dto.Product" %>
<%@ page import ="dao.ProductRepository" %>

<%--신규 상품 등록 처리 페이지  --%>
<%
	request.setCharacterEncoding("UTF-8"); //request 내장 객체가 웹 브라우저가 서버로 보낸 요청에 대한 다양한 정보 담음->getParameter() 로 값을 가져옴

	String filename ="";
	String realFolder ="C:\\upload"; //웹 애플리케이션상의 절대 경로
	int maxSize = 5 * 1024 * 1024; //최대 업로드될 파일의 크기 5MB
	String encType = "utf-8"; //인코딩 유형 
	
	//폼 태그로 전달받은 request 내장객체를 MultipartRequest 의 형태의 객체로 만듦. 
	//MultipartRequest: 웹 페이지에서 서버로 업로드되는 파일 자체만 다루는 클래스 (cos.jar 라이브러리 )
	DefaultFileRenamePolicy defaultFile = new DefaultFileRenamePolicy();
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, defaultFile);
	

	String productId = multi.getParameter("productId");
	String name = multi.getParameter("name");
	String unitPrice = multi.getParameter("unitPrice");
	String description = multi.getParameter("description");
	String manufacturer = multi.getParameter("manufacturer");
	String category = multi.getParameter("category");
	String unitsInStock = multi.getParameter("unitInStock");
	String condition = multi.getParameter("condition");
	
	Integer price;
	
	if(unitPrice.isEmpty())
		price=0;
	else
		price=Integer.valueOf(unitPrice);
	
	long stock;
	
	if (unitsInStock.isEmpty())
		stock=0;
	else
		stock=Long.valueOf(unitsInStock);
	
	
	Enumeration files = multi.getFileNames();
	String fname = (String) files.nextElement();
	String fileName = multi.getFilesystemName(fname);
	
	
	ProductRepository dao = ProductRepository.getInstance();
	
	Product newProduct = new Product();
	newProduct.setProductId(productId);
	newProduct.setPname(name);
	newProduct.setUnitPrice(price);
	newProduct.setDescription(description);
	newProduct.setManufacturer(manufacturer);
	newProduct.setCategory(category);
	newProduct.setUnitsInStock(stock);
	newProduct.setCondition(condition);
	newProduct.setFilename(fileName);
	
	dao.addProduct(newProduct);
	
	response.sendRedirect("products.jsp");
%>
