package example;

public class Hello {
 // 구구단 해보기
	public static void main(String args[]) {
		
		for(int i=2; i<10; i++) {
			System.out.println(i+"단\r"+"---------");
			for(int j=1; j<10; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			
		}
	}
	

}
