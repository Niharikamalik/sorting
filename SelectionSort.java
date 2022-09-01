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
	    selectionSort(arr,n);
	    System.out.println("After sorting");
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
	
	static void selectionSort(int arr[],int n){
	    for (int i=0 ; i<n;i++){
	        int min = i;
	        for (int j=i+1;j<n;j++){
	            if(arr[j]<arr[min]){
	                min = j;
	            }
	        }
	        int temp = arr[i];
	        arr[i] = arr[min];
	        arr[min]=temp;
	    }  
	    
	}
}
