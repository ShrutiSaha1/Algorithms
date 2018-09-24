
public class SqrtInt {
	public int sqrt(int a) {
		if(a==0||a==1)
			return a;
		int start=0;
		int end=a/2;
		long ans=-1;
		while(start<=end)
		{
			long mid=start+(end-start)/2;
			if(a==mid*mid)
			{
				return (int) mid;
			}
			else if (a<mid*mid) {
				end=(int) (mid-1);
			}
			else if(a>mid*mid)
			{
				start=(int) (mid+1);
				ans=(int) mid;
			}
		}
		return (int) ans;
	}
	public static void main(String[] args) {
		SqrtInt obj = new SqrtInt();
		int res=obj.sqrt(9);
		System.out.println(res);
	}
}
