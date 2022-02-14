package dto;

import java.io.Serializable;


public class Product implements Serializable {
	
	private static final long serialVersionUID = -427470057203867700L;
	
	private String productId; //상품 아이디
	private String pname; //상품 이름
	private Integer unitPrice; //상품 가격
	private String description; //상품 설명
	private String manufacturer; //제조사
	private String category; //분류
	private long unitsInStock; //재고 수
	private String condition; // 신상품, 중고품, 재생품 
	private String filename; //이미지 파일명 
	

	public Product() { //기본생성자 
		super();
	}
	
	public Product(String productId, String pname, Integer unitPrice) { //생성자 
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice; 
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public String getFilename() {
		return filename;
	}
	
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
}
