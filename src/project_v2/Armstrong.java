package project_v2;

public class Armstrong {
	public static void main(String[] args) {
		int n=153,a,i=0,j=0;
		a=n;
		while(a>0) {
		 i=a%10;
		 j=j+(i*i*i);
		 a=a/10;
		}
		System.out.println((j==n)+": for 153 Armstrong number" );
	}
}
