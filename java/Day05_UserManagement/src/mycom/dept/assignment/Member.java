package mycom.dept.assignment;

public class Member {
    private int id;
	private String name;
    private int joinDate;
    private int perchaseTime;
    private int point;
    private String grade;
    private static int bestMember = 0;
    private static int bestPoint = 0;

    public Member(int id, String name, int joinDate, int perchaseTime){
    	this.id = id;
    	this.name = name;
    	this.joinDate = joinDate;
    	this.perchaseTime = perchaseTime;
    	pointCalculate();
    	giveGrade();
    	findBestMember();
    }
    
    public int getId() {
		return id;
	}
	public int getBestMember() {
		return bestMember;
	}

    private void pointCalculate(){
    	if(perchaseTime >= 10) {
    		this.point = perchaseTime * 100;
    	}
    	else if(perchaseTime >= 5) {
    		this.point = perchaseTime * 50;
    	}
    	else if(perchaseTime >= 3) {
    		this.point = perchaseTime * 30;
    	}
    	else {
    		this.point = perchaseTime * 20;
    	}
    }

    private void giveGrade(){
    	if(point >= 500) {
    		this.grade = "VVIP";
    	}
    	else if(point >= 300) {
    		this.grade = "VIP";
    	}
    	else if(point >= 100) {
    		this.grade = "Gold";
    	}
    	else {
    		this.grade = "Family";
    	}
    }

    private void findBestMember(){
    	if(this.point > bestPoint) {
    		bestPoint = this.point;
    		bestMember = this.id;
    	}
    }

    public void giveBestMemberPoint(){
    	this.point = point + 10000;
    }
    
    public void display() {
    	System.out.println("----------------");
		System.out.println("아이디 : " + this.id);
		System.out.println("이름 : " + this.name);
		System.out.println("가입일 : " + this.joinDate);
		System.out.println("구매횟수 : " + this.perchaseTime);
		System.out.println("누적포인트 : " + this.point);
		System.out.println("회원등급 : " + this.grade);
		System.out.println("----------------");
	}
}
