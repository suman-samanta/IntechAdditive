
public class D_TrappingRainWater {
	
	public static void main(String[] args) {
		int a[]=new int[] {2, 1, 3, 0, 1, 2, 3};
		int n=a.length;
		
		System.out.println("The Total no of Trapped water will be: "+findWaterBlock(a,n));
	}
	
	static int findWaterBlock(int a[],int n) {
		
		int left[]=new int[n];
		int right[]=new int[n];
		
		left[0]=a[0];
		for (int i=1;i<n;i++) {
			left[i]=Math.max(a[i], left[i-1]);
		}
		right[n-1]=a[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], a[i]);
		}
		
		int ans=0;
		
		for(int i=0;i<n;i++) {
			ans+=(Math.min(left[i],right[i])-a[i]);
		}
		
		return ans;
	}
}
