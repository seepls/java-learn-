//1.bubble sort
public class Bubble{


static void bubble(int[] arr){
	int n = arr.length;
	int temp=0 ;
	for(int i=0 ;i <n;i++){
	 for( int j = 1 ;j<(n-i);j++){ //-i cause after i rounds i elements from end for sure sorted .
	    if(arr[j-1]> arr[j])
	    { temp = arr[j-1];
	      arr[j-1]=arr[j];
	      arr[j]=temp;
	      }
	      }}}
	      
public static void main(String[] args){
int arr[] = {3,2,7,4,5,8};
 System.out.println("Array Before Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                
bubble(arr);
System.out.println("Array After Bubble Sort");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                
}
}
