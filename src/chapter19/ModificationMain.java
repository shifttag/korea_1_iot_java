package chapter19;

public class ModificationMain {
	public static void main(String[] args) {
		// 익명 클래스를 사용하여 Modification 인터페이스 구현
		Modification<String> m1 = new Modification<String>() {
			
			@Override
			public String modify(String oldData, String newData) {
				System.out.println("기존 데이터: " + oldData);
				System.out.println("새로운 데이터: " + newData);
				return newData + "1";
			}
		};
		
		Modification<String> m2 = new Modification<String>() {
			
			@Override
			public String modify(String oldData, String newData) {
				
				return newData + "2";
			}
		};
		
		// 람다 표현식으로 Modifiaction 인터페이스 구현
		// - 람다 표현식은 익명 클래스를 간결하게 표현
		// - 매개변수의 타입 생략이 가능
		Modification<String> m3 = (oldData, newData) -> newData + "3";
		
		// == modify 메서드 실행 ==
		String name = "홍동현";
		
		String newName = m1.modify(name, "홍길동");	// 홍길동1
		System.out.println(newName);
		
		String newName2 = m2.modify(name, "박소영");	// 박소영2
		System.out.println(newName2);
		
		String newName3 = m3.modify(name, "하지원");	// 하지원3
		System.out.println(newName3);
	}
}
