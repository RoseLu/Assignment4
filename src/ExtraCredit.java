
public class ExtraCredit {
	

	public static int missingNumber(int[] nums){
		int n=nums.length+1;
		int missingNumber=nums[0];
		for(int i=1; i<=n;i++){
			if (i<nums.length){
				missingNumber^=nums[i];
			}
			missingNumber^=i;
		}
		return missingNumber;
	}
	
	public static void moveZeroes(int[] nums){
		int n=-1;
		
		for(int i=0; i<nums.length;i++){
			if(nums[i]==0){
				if(n==-1||nums[n]!=0){
					n=i;
				}
			}else{
				if(n!=-1){
					int temp=nums[i];
					nums[i]=nums[n];
					nums[n]=temp;
					n++;
				}
			}
		}
	} 
	public int thirdMax(int[] nums){
		long max=Long.MIN_VALUE, mid=max, min=max;
		for(int num: nums){
			if(num>max){
				min=mid;
				mid=max;
				max=num;
			}else if(max>num && num>mid){
				min=mid;
				mid=num;
			}else if(mid>num && num>min){
				min=num;
			}
		}
		return (int)(min==Long.MIN_VALUE? max:min); 
	}
	

}
