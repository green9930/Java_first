package scheduler;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		
		// RoundRobin, LeastJob, Priority
		System.out.println("전화 상담 배분 방식을 선택하세요. R, L, P");
		
		// 출력
		int ch = System.in.read();
		Scheduler scheduler = null;
		
		if (ch == 'R' || ch == 'r' ) {
			scheduler = new RoundRobin();
		}
		else if (ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		}
		else if (ch == 'P' || ch == 'p'	) {
			scheduler = new Priority();
		}
		else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
		
	}
}
