package javaExam2;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("도서번호 입력:");
		String bookNo = sc.nextLine();
		System.out.print("도서제목 입력:");
		String bookTitle = sc.nextLine();
		
		System.out.print("저자 입력:");
		String bookAuthor = sc.nextLine();
		System.out.print("발행연도 입력:");
		String bookYear = sc.nextLine();
		System.out.print("가격 입력:");
		int bookPrice = sc.nextInt();
		sc.nextLine();
		System.out.print("출판사 입력:");
		String bookPublisher = sc.nextLine();
		
		BookDTO dto = new BookDTO();
		dto.setBookNo(bookNo);
		dto.setBookTitle(bookTitle);;
		dto.setBookAuthor(bookAuthor);
		dto.setBookYear(bookYear);
		dto.setBookPrice(bookPrice);
		dto.setBookPublisher(bookPublisher);
		BookDAO dao = new BookDAO();
		//dao.insertBook(dto);
		System.out.println("================================================ ");
		dao.selectBook();
		System.out.println("================================================ ");
	}

}
