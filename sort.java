public class Main{
  public static void main(String [] args){
   int[] arr={2,4,7,9,5};
   for(int i=0;i<arr.length;i++){
   int minIndex=i;
   for(int j=i+1;j<arr.length;j++){
   if(arr[j]<arr[minIndex]){
    minIndex=j;
   }
  }
  int temp=arr[i];
  arr[i]=arr[minIndex];
  arr[minIndex]=temp;
   }
   System.out.println("Unsorted Array:");
   for(int i=0;i<arr.length;i++){
   System.out.print(arr[i]+" ");
   }
    }
}
