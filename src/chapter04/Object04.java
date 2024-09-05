package chapter04;

// 클래스 생성 (Book, Person, ...)
// : 속성 2개
// : 메서드 1개
class Person {
	String name;
	int age;
	
	void display(){
		System.out.println("name: " + name + ", age: " + age);
	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
}

class Book {
	// 클래스 내부의 데이터(속성)
	String title;	// 책 제목
	String publisher; // 출판사
	int pageNumber;	// 책 페이지 수
	
	// 클래스 내보의 동작(메서드)
	void displayInfo() {
		System.out.println(title + publisher);
	}
	
	// === 생성자 함수 ===
	// : new 연산자 사용 시 호출 될 메서드
	// >> 생략 시 속성에 기본값이 
	// 일반 타입: int(0), boolean(false), char("");
	// 참조 타입: null
	
	// >> 생략 시 클래스명과 동일하면서 매개변수가 없는 메서드
}


public class Object04 {
	public static void main(String[] args) {
		// 위에서 정의한 클래스를 사용하여 객체 인스턴스화
		Person person = new Person("홍동현", 25);
		
		Book myBook = new Book();
		
		
		// 속성 출력
		System.out.println(person.name);
		System.out.println(person.age);
		
		System.out.println(myBook.pageNumber);
		System.out.println(myBook.publisher);
		System.out.println(myBook.title);
		
		// 메서드 호출
		person.display();
	}
}
