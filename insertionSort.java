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
	    insertionSort(arr,n);
	    System.out.println("After sorting");
	    for(int i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	    }
	}
	
	public static void insertionSort(int arr[], int n)
  {
      //code here
      for(int i=1;i<n;i++){
          int key = arr[i];
          int j=i-1;
          while(j>=0 && arr[j] > key){
              arr[j+1] = arr[j];
              j--;
          }
          arr[j+1]=key;
      }
  }
}

