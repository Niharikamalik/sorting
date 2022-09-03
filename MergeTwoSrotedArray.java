public class Main
{
	public static void main(String[] args) {
	    int a[]={1,2,3,5};
	    int b[]={4,5,6,7};
	    int n = a.length,m=b.length;
	    sortMerge(a,b,n,m);
	}
	static void sortMerge(int a[],int b[],int n,int m){
	    int i=0,j=0;
	    while(i<n && j<m){
	        if(a[i]<=b[j]){
	            System.out.print(a[i++]+ " ");
	        }
	        else {
	            System.out.print(b[j++]+ " ");
	        }
	    }
	    while(i<n) {
	            System.out.print(a[i++]+ " ");
	        }
	    while(j<m){
	            System.out.print(b[j++]+ " ");
	    }
	}
}
