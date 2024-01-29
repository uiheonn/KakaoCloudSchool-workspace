package mycom.dept.test;

public class Main {
	public static void main(String[] args) {
		int[] nums = {10, 8, 27, 34, 56, 34, 55, 31, 23, 44, 57, 88};
		// 데이터 출력
		System.out.print("데이터는 ");
		for(int ele : nums) {
			System.out.print(ele + " ");
		}
		System.out.println("입니다");
		// 짝수 데이터만 출력하시오.
		System.out.print("짝수는 ");
		for(int ele : nums) {
			if(ele % 2 == 0) {
				System.out.print(ele + " ");
			}
		}
		System.out.println("입니다");
		// 3의 배수인 데이터만 출력하시오.
		System.out.print("3의 배수는 ");
		for(int ele : nums) {
			if(ele % 3 == 0) {
				System.out.print(ele + " ");
			}
		}
		System.out.println("입니다");
		// 평균 값을 출력하시오.
		int sum = 0;
		for(int ele : nums) {
			sum+=ele;
		}
		double avg = (double)sum/12;
		System.out.println("평균은 " + avg + "입니다");
		// 순서대로 나열한 후(정렬), 1/4, 2/4, 3/4 지점 값 찍기
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.print("정렬 후 데이터는 ");
		for(int ele : nums) {
			System.out.print(ele + " ");
		}
		System.out.println("입니다");
		int locate = 12 * 1/4; // 찍어야할 지점(3) 설정
		for(int i=0; i < 11; i++) {
			if((i+1) % locate == 0) {
				System.out.println(((i+1)/locate) + "/4 지점의 값은 " + nums[i] + " ");
			}
		}
	}
}
