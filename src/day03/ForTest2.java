package day03;

public class ForTest2 {

	public static void main(String[] args) {
		for(int i=1;i<3;i++) {
			for(int k=1; k<4;k++) {
				System.out.println("i="+i+" k="+k);
			}
		}
		System.out.println("\n-----------------");
		/*[1]
		 *   *****
		 *   *****
		 *   *****
		 *   *****
		 *   
		 *   4행5열
		 * 
		 * */
		//[1]
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n-----------------");
		/* [2]
		 * 
		 *  *
		 *  **
		 *  ***
		 *  ****
		 * 
		 * */
		//[2]
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n-----------------");
		/*[3]
		 * 
		 *    *
		 *   **
		 *  ***
		 * ****     
		 * 
		 * */
		//[3]
		for(int i=4;i>0;i--) {
			for(int j=1;j<5;j++) {
			if(j>=i)
				System.out.print("*");
			else
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("\n-----------------");
		//[4]정삼각형출력
		int num=3;
		for (int i=1; i<=num; i++){
	        for(int k=0; k<i; k++ )
	        	System.out.print(" ");
	        for(int j=0; j<num-(i*2-1);j++ )
	        	System.out.print("*");
	        System.out.println();
		}
		System.out.println("\n-----------------");
		
	}
}
