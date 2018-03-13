public class QuickSortTester{
    
    public static void main(String[] args){
	int[] test1;
	QuickSort testrun = new QuickSort(); 
	///1st test
  System.out.println("Testing for array size of 1000."); 
	long sum = 0;
	for(int i = 0; i < 5000; i++){
	    test1 = testrun.buildArray(1000,2000);
	    long start = System.nanoTime();
	    testrun.qsort(test1);
	    long end = System.nanoTime() - start;
	    sum += end;
	}
	long average = sum /(long) 5000;
	System.out.println("It took " + average + " average nanoseconds to sort this array out of 5000 sorts.");
	//2nd test
	int[] test2;
	System.out.println("Testing for array size of 5000."); 
	long sum2 = 0;
	for(int i = 0; i < 5000; i++){
	    test2 = testrun.buildArray(5000,10000);
	    long start2 = System.nanoTime();
	    testrun.qsort(test2);
	    long end2 = System.nanoTime() - start2;
	    sum2 += end2;
	}
	long average2 = sum2 /(long) 5000;
	System.out.println("It took " + average2 + " average nanoseconds to sort this array out of 5000 sorts.");
	//3rd test
	int[] test3;
	System.out.println("Testing for array size of 20000."); 
	long sum3 = 0;
	for(int i = 0; i < 5000; i++){
	    test3 = testrun.buildArray(20000,40000);
	    long start3 = System.nanoTime();
	    testrun.qsort(test3);
	    long end3 = System.nanoTime() - start3;
	    sum3 += end3;
	}
	long average3 = sum3 /(long) 5000;
	System.out.println("It took " + average3 + " average nanoseconds to sort this array out of 5000 sorts.");
	//4th test
	int[] test4;
	System.out.println("Testing for array size of 100000."); 
	long sum4 = 0;
	for(int i = 0; i < 5000; i++){
	    test4 = testrun.buildArray(100000,200000);
	    long start4 = System.nanoTime();
	    testrun.qsort(test4);
	    long end4 = System.nanoTime() - start4;
	    sum4 += end4;
	}
	long average4 = sum4 /(long) 5000;
	System.out.println("It took " + average4 + " average nanoseconds to sort this array out of 5000 sorts.");
	    
        
    }
}
