//Hasif Ahmed
//APCS2 pd1
//HW18 -- QuickSort
//2018-03-13

/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): Recursively sorting an array by putting each value in the array
 * in it's final position until the entire array has been traversed through. 
 *
 * 2a. Worst pivot choice and associated runtime:
 * Worst pivot choice is either first or last. The runtime would be O(n^2)
 * 2b. Best pivot choice and associated runtime:
 * Each time a pivot is chosen, it splits the array in half. The runtime would be O(nlogn).
 * 3. Approach to handling duplicate values in array:
 *  In partition it checks if its less than OR equal to.
 *****************************************************/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o ) {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a ) {
    for ( int o : a )
	    System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d ) {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal ) {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------



  /*****************************************************
  * void qsort(int[])
  * @param d -- array of ints to be sorted in place
  *****************************************************/
  public static void qsort( int[] d )
  {
      int pivot = Partition(d,0,d.length - 1); //first partition, divides the array into two
      qsorthelp(d,0,pivot - 1); //left side of partition is sorted
      qsorthelp(d,pivot + 1,d.length - 1); //right side of partition is sorted



  }

  //you may need a helper method...

  //recursive helper method
  /*
  * @param d -- array of ints to be sorted in place
  * @param left -- beginning in the range for the partition
  * @param right -- end in the range for the partition
  */


  public static void qsorthelp( int[] d, int left, int right){
    if( left < right ){ //base case
      int pivot = Partition(d, left, right); //partitions, divides array in two
      qsorthelp(d,left, pivot - 1); //sorts left side recursively
      qsorthelp(d,pivot + 1,right); // sorts right side recursively
    }
    }

    //partition (places value at its proper position as if it were an ordered array)
    public static int Partition(int[] a, int p, int r)
    {
        int x = a[r];

        int i = p-1;
        int temp=0;

        for(int j=p; j<r; j++)
        {
            if(a[j]<=x)
            {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        temp = a[i+1];
        a[i+1] = a[r];
        a[r] = temp;
        return (i+1);
    }
  //main method for testing
  public static void main( String[] args )
  {


    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);

    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);

    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;

    System.out.println("\narrN init'd to: " );
    printArr(arrN);

    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);

    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);





    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);

    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);


    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );

    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);

    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);

    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);


  }//end main

}//end class QuickSort
