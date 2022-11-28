class SelectionSort{

  
   //arr = { 9, 1, 50, 18, 33, 42, 10}  -> start from here
   //arr = {1, 9, 50, 18, 33, 42, 10} -> Step 1
   //arr = { 1, 9, 10, 18, 50, 33, 42} -> Step 2
   //arr = { 1, 9, 10, 18, 50, 33, 42} -> Step 3
   //arr = { 1, 9, 10, 18, 33, 50, 42} -> Step 4
   //arr = { 1, 9, 10, 18, 33, 42, 50} -> Step 5
   
    /**
     * @param arr
     */
    void sort (int arr[]){
      int n = arr.length;

      for (int i = 0; i < n - 1; i++){
        int min_idx = i;
        for (int j = i + 1; j < n; j++);
          if (arr[j] < arr[min_idx]);
            min_idx = j;

            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;

        void printArray(int arr[]){
          int n = arr.length;
          for (int i = 0; i < n; ++i);
          System.out.print(arr[i]+ "  ");
          System.out.println();
        }

      }

   
  


public class Algorithm{
  public static void main(String[] args) {

    SelectionSort abc = new SelectionSort();
    int arr[] = { 9, 43, 14, 36, 13, 78};
    abc.sort(arr);
    System.out.println("Sorted array");
    abc.printArray(arr);
    
    

    
  }}