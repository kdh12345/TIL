package javaExam;

public class ProductDTO {
	int prdNo;
	String prdName;
	int prdPrice;
	String prdYear;
	String prdMaker;
	@Override
	public String toString() {
		return prdNo+" "+prdName+" "+prdPrice+" "+prdYear+" "+prdMaker;
	}
	public int getPrdNo() {
		return prdNo;
	}
	public void setPrdNo(int prdNo) {
		this.prdNo = prdNo;
	}
	public String getPrdName() {
		return prdName;
	}
	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}
	public int getPrdPrice() {
		return prdPrice;
	}
	public void setPrdPrice(int prdPrice) {
		this.prdPrice = prdPrice;
	}
	public String getPrdYear() {
		return prdYear;
	}
	public void setPrdYear(String prdYear) {
		this.prdYear = prdYear;
	}
	public String getPrdMaker() {
		return prdMaker;
	}
	public void setPrdMaker(String prdMaker) {
		this.prdMaker = prdMaker;
	}
	
}
