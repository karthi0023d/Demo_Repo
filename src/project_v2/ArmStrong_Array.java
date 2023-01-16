package project_v2;

public class ArmStrong_Array {
	public static void main(String[] args) {
		for (int i = 1; i < 1000; i++) {
			int n,a,j=0;
			n=i;
			while(n>0) {
				a=n%10;
				j=j+(a*a*a);
				n=n/10;
			}
			if(j==i) {
				System.out.println(i);
			}
			
		}
	}
}
