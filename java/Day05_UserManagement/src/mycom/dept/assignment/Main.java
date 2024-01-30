package mycom.dept.assignment;

public class Main {
	public static void main(String[] args) {
		Member m1 = new Member(1, "홍길동", 20120212, 3);		
		Member m2 = new Member(2, "김길동", 20120812, 2);
		Member m3 = new Member(3, "이길동", 20130112, 10);
		Member m4 = new Member(4, "박길동", 20110912, 11);
		Member m5 = new Member(5, "최길동", 20100712, 6);
		Member m6 = new Member(6, "한길동", 20120112, 8);
		
		Member[] memberList = {m1, m2, m3, m4, m5, m6};

		for(Member member : memberList) {
			if(member.getId() == member.getBestMember()) {
				member.giveBestMemberPoint();
			}
		}
		
		for(Member member : memberList) {
			member.display();
		}
	}
}
