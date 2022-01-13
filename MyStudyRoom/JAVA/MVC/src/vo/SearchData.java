package vo;

public class SearchData { //사용자가 검색을 하면 검색하는 조건과 그 값
	
	private String searchCondition; //검색 조건을 받을 변수(id? name?)
	private String searchValue; //검색 값을 받을 변수 
	
	public String getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(String searchCondition) {
		this.searchCondition =searchCondition;
	}

	public String getSearchValue() {
		return searchValue;
	}
	public void setSearchValue(String searchValue) {
		this.searchValue = searchValue;
	}
}
