package algorithm.easy;


public class MaxSum{

	public void add(int[] arr) throws Exception{

		long sum = 0;//将最大子段和保留在此
		long temp = 0;//相当于游标
		for(int i = 0;i<arr.length;i++) {
			temp+=arr[i];
			if(temp>0){
				if(temp>sum){
					sum = temp;
				}
			}else{
				temp = 0;
			}
		}
		System.out.println(sum);
	}

	public static void main(String argc[]) throws Exception{
		new MaxSum().add(new int[]{-1,-2,-3,96,-5,6});
	}
}