package javaExam;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDTO dto = new ProductDTO();
		
		ArrayList<ProductDTO> dtos = new ArrayList<>();
		dto.setPrdNo(100);
		dto.setPrdName("노트북");
		dto.setPrdPrice(1200000);
		dto.setPrdYear("2021");
		dto.setPrdMaker("삼성");
		dtos.add(dto);
		
		dto = new ProductDTO();
		dto.setPrdNo(200);
		dto.setPrdName("아이패드");
		dto.setPrdPrice(500000);
		dto.setPrdYear("2022");
		dto.setPrdMaker("애플");
		dtos.add(dto);
		
		dto = new ProductDTO();
		dto.setPrdNo(200);
		dto.setPrdName("마우스");
		dto.setPrdPrice(15000);
		dto.setPrdYear("2021");
		dto.setPrdMaker("LG");
		dtos.add(dto);
		
		System.out.println("상품번호 상품명 가격 제조년도 제조사");
		System.out.println("==================================== ");
		for(ProductDTO d : dtos) {
			System.out.println(d);
		}
		System.out.println("==================================== ");
	}

}
