package chapter16;

// 학생 클래스 - 기본 클래스
class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
}

// 인터페이스 정의 - 성적 계산
interface Grading {
	String caculateGrade(Student student);	// 추상 메서드
}

public class B_Anonymous02 {
	public static void main(String[] args) {
		Student st1 = new Student("홍동현", 85);
		Student st2 = new Student("정영훈", 72);
		Student st3 = new Student("류용재", 90);
		Student st4 = new Student("제정빈", 65);
		Student st5 = new Student("이승수", 81);
		
		Grading grading = new Grading() {
			
			@Override
			public String caculateGrade(Student student) {
				int score = student.getScore();
				if (score > 100 || score < 0) {
					System.out.println("잘못된 정보입니다");
					return null;
				} else if (score >= 90) {
					return "A";
				} else if (score >= 80) {
					return "B";
				} else if (score >= 70) {
					return "C";
				} else if (score >= 60) {
					return "D";
				} else {
					return "F";
				}
				
			}
		};
		
		System.out.println(st1.getName() + "의 성적 "  + grading.caculateGrade(st1));
		System.out.println(st2.getName() + "의 성적 "  + grading.caculateGrade(st2));
		System.out.println(st3.getName() + "의 성적 "  + grading.caculateGrade(st3));
		System.out.println(st4.getName() + "의 성적 "  + grading.caculateGrade(st4));
		System.out.println(st5.getName() + "의 성적 "  + grading.caculateGrade(st5));
	}
}
