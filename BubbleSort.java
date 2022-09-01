public class Main
{
	public static void main(String[] args) {
	    int arr[]={12,34,13,45,65,22};
	    int n = arr.length;
	    System.out.println("Before sorting");
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
	    System.out.println();
	    BubbleaSort(arr,n);
	    System.out.println("After sorting");
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
	
	static void BubbleaSort(int arr[],int n){
	    for (int i=0;i<n;i++){
	       for (int j=0;j<n-i-1;j++){
	           if(arr[j]>arr[j+1]){
	               int temp =arr[j];
	               arr[j]=arr[j+1];
	               arr[j+1]=temp; }
         }
	    }    
	}
}
