package day04;

public class ArrayTest3 {

	public static void main(String[] args) {
		// [문제1] String 유형을 저장하는 이차원 배열을 선언하고 생성, 초기화하세요
		//  반복문 이용해서 출력하되 모두 소문자로 바꿔 출력하세요
		String str[][]=new String[2][3];
		str[0][0]="He";
		str[0][1]="ll";
		str[0][2]="o";
		
		str[1][0]="Ja";
		str[1][1]="v";
		str[1][2]="a";
		
		for(String[] s:str) {
			for(String st:s) {
				System.out.print(st.toLowerCase());
			}
			System.out.println();
		}
				
		System.out.println("--------------------------------");	
		/* 문제 2] 2차원 배열에 다음의 값을 저장하되,
		  for루프를 이용해 저장하자.
		  그런 뒤, 저장된 값들을 출력해봅시다.
		  1 0 0 0 0
		  0 1 0 0 0
		  0 0 1 0 0
		  0 0 0 1 0
		  0 0 0 0 1
		 */
		
		int a[][]=new int[5][5];
		for(int i=0;i<a.length;i++) {
			for(int y=0;y<a[i].length;y++) {
				if(i==y) {
					a[i][y]=1;
				}
				System.out.print(a[i][y]);
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		/*
		 * 5행5열 회전해서 1~25까지
		 * */
		tlftmq();
		
		System.out.println("달팽이풀이-------------");
		int[] arr [] =new int[5][5];
		int cnt=0;
		int x=0, y=0;//배열의 행의 인덱스와 열의 인덱스로 사용할 변수
		for(int j=0;j<2;j++) {
			for(int i=0;i<4-2*j;i++) {
				arr[y+j][x+j]=++cnt;
				x++;
			}
			if(x+y+2*j==4) {
				for(int i=0;i<4-2*j;i++) {
					arr[y+j][x+j]=++cnt;
					y++;
				}
			}
			if(x==y) {
				for(int i=0;i<4-2*j;i++) {
					arr[y+j][x+j]=++cnt;
					x--;
				}
			}
			if(x+y+2*j==4) {
				for(int i=0;i<4-2*j;i++) {
					arr[y+j][x+j]=++cnt;
					y--;
				}				
			}
		}//for j----------------------------
		arr[2][2]=++cnt;
		
		System.out.println("-----------------------");
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr[i].length;k++) {
				System.out.print(arr[i][k]+"\t");
			}
			System.out.println();
		}
		/* 아래 선언된 변수들의 자료형을 맞춰봅시다.
		 * 
		 * (1)   int i, j[]          : i(정수형)   , j(정수형의 1차원배열)
		 * 
		 * (2)   int[] i, j[], k;    : i(1차원)   ,  j2차원    , k1차원
		 * 
		 * (3)   int i []j[], k[];    : i 정수형  ,  j 2차원   , k 1차원
		 * 
		 * (4)   int [][]i, j[];    : i 2차원  ,  j 3차원
		 * 
		 * */

	}
	public static void tlftmq(){
		int max=5;
		int r[][]=new int[max][max];
		int i=0;
		int j=0;
		int count=1;
		int sign=-1;
		int vector=1;
		vector*=sign;
		System.out.print(vector);
		while(max>0) {
			if (vector==1) {
				for(int x=0;x<max;x++) {
					j=x;
					r[i][j]=count;
					count++;
				}
				max--;
				for(int y=0;y<max;y++) {
					i=y+1;
					r[i][j]=count;
					count++;
				}
			}
			else if(vector==-1) {
				for(int x=(max-1);x<0;x--) {
					j=x;
					r[i][j]=count;
					count++;
				}
				max--;
				for(int y=max-1;y<0;y--) {
					i=y;
					r[i][j]=count;
					count++;
				}
			}
			vector*=sign;
		}
		
		for(int arr[]:r) {
			for(int arr2:arr) {
				System.out.print(arr2+"\t");
			}
		System.out.println();
		}
	}
}
