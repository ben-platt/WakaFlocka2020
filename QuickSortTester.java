public class QuickSortTester{
    
    public static void main(String[] args){
	int[] test1;
	QuickSort testrun = new QuickSort(); 
        System.out.println("Testing for array size of 5."); 
	long sum = 0;
	for(int i = 0; i < 1000; i++){
	    test1 = testrun.buildArray(5,10);
	    long start = System.nanoTime();
	    testrun.qsort(test1);
	    long end = System.nanoTime() - start;
	    sum += end;
	}
	long average = sum /(long) 1000;
	System.out.println("It took " + average + " average nanoseconds to sort this array out of 1000 sorts.");

	int[] test2;
	System.out.println("Testing for array size of 10."); 
	long sum2 = 0;
	for(int i = 0; i < 1000; i++){
	    test2 = testrun.buildArray(10,10);
	    long start2 = System.nanoTime();
	    testrun.qsort(test2);
	    long end2 = System.nanoTime() - start2;
	    sum2 += end2;
	}
	long average2 = sum2 /(long) 1000;
	System.out.println("It took " + average2 + " average nanoseconds to sort this array out of 1000 sorts.");
	    
        
    }
}
