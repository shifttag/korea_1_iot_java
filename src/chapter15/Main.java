package chapter15;

// Main 클래스
// : 프로젝트 실행 클래스

public class Main {
	// main 메서드
	// : 해당 메서드가 존재해야만 자바 프로그램 실행이 가능 (콘솔)
	public static void main(String[] args) {
		// === 프로젝트 개요 ===
		// < 도서 관리 시스템 >
		
		// 1. 클래스 & 객체를 사용한 프로젝트 데이터 설정
		// 1) 클래스: 도서(Book), 회원(Member), 대여(Loan)
		
		// == Book 클래스 ==
		// 책 제목(title), 저자(author), 책 고유번호(isbn), 대여 가능 여부(isAvailable)
		// 책 대여 호출(borrowBook), 책 반납 호출(returnBook)
		// >> void 반환 타입
		
		// == Member 클래스 ==
		// 회원아이디(memberId), 회원이름(name), 책 대여 목록(List<Loan> loans)
		// borrowBook(Book book), returnBook(Book book)
		// >> void 반환 타입
		
		// == Loan 클래스 ==
		// Member 클래스의 인스턴스
		// Book 클래스의 인스턴스
		
		// ============================================================= //
		// 책 추가
		Book book1 = new PaperBook("자바", "홍동현", "1234", 150);
		Book book2 = new PaperBook("파이썬", "홍길동", "2345", 300);
		Book book3 = new PaperBook("C언어", "김수언", "3456", 250);
		
		Book book4 = new EBook("안녕", "장진혁", "111", "www.example.com");
		Book book5 = new EBook("반가워", "권재우", "222", "www.example.com");
		Book book6 = new EBook("Hello", "임진베", "333", "www.example.com");
		Book book7 = new EBook("Hi", "장동욱", "444", "www.example.com");
		
		// 회원 생성
		Member member1 = new Member("001", "이지민");
		Member member2 = new Member("002", "강진영");
		Member member3 = new Member("003", "김나경");
		Member member4 = new Member("004", "임소현");
		
		try {
			member1.borrowBook(book1);
			System.out.println("1");
			member1.borrowBook(book2);
			System.out.println("2");
			member1.borrowBook(book6);
			System.out.println("3");
			
			member2.borrowBook(book7);
			System.out.println("4");
			
			member3.borrowBook(book7);
		} catch (BookAlreadyBorrowedException e) {
			System.out.println(e.getMessage());	// Hi(은)는 이미 대여중입니다.
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
