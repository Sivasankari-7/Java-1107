import java.util.Arrays;
class SearchsortMax
{
	public static void main(String[] args) 
	{
		int num[]={4,6,3,2,1,7,9,5};
		int size=num.length;
		int maxIndex=0;
		System.out.println("before shorting:"+Arrays.toString(num));
		for(int i=0;i<size-1;i++){
			maxIndex=i;
			for(int j=i+1;j<size;j++){
				if(num[maxIndex]<num[j])
					maxIndex=j;
			}
			int temp=num[maxIndex];
					num[maxIndex]=num[i];
					num[i]=temp;
		}
		
		System.out.println();
		System.out.println("After shorting:"+Arrays.toString(num));
	}
	
	
}
