package chapter05;

class BaseballPlayer {
	// 인스턴스 변수
	// 선수 이름,(name - 문자열)
	// 타율(battingAverage - 실수)
	// 홈런 수(homeRuns - 정수)
	String name;
	double battingAverage;
	int homeRuns;
	
	// 정적(클래스) 변수
	// : 생성된 선수의 총 인원(playerCount - 정수)
	// >> 모든 인스턴스에서 공유
	static int playerCount = 0;
	
	// 생성자 >> 인스턴스 변수 초기화 & 정적 변수 후위 증가 (변수명++)
	BaseballPlayer(String name, double battingAverage, int homeRuns){
		// 인스턴스 변수 = 매개변수값;
		this.name = name;
		this.battingAverage = battingAverage;
		this.homeRuns = homeRuns;
		playerCount++;
	}
	
	// 인스턴스 메서드
	// 선수의 타율과 홈런 수를 업데이트 하는 메서드
	// >> 매개변수로 newBattingAverage, newHomeRuns를 받아 기존의 인스턴스 변수에 재할당
	void updateStatus(double newBattingAverage, int newHomeRuns){
		// 인스턴스 변수 = 매개변수값;
		battingAverage = newBattingAverage;
		homeRuns = newHomeRuns;
	}
}

public class MethodPractice {
	public static void main(String[] args) {
		BaseballPlayer player1 = new BaseballPlayer("홍창기", 0.41, 5);
		BaseballPlayer player2 = new BaseballPlayer("레이예스", 0.43, 15);
		BaseballPlayer player3 = new BaseballPlayer("황성빈", 0.28, 2);
		
		System.out.println("총 생성된 선수의 수: "+BaseballPlayer.playerCount);
	}
}	
