Hasif Ahmed, Ben Platt
APCS2 pd1
Lab 01 -- What Does the Data Say?
2018-03-15
WakaFlocka2020

Background:
We believe that the Big-Oh runtime for QuickSort, in terms of the best case, is O(nlogn). This also applies for the average or most likely case. The best case essentially depends on the state of the array. The worst case is when the pivot is the largest or smallest in the list. In addition, the worst case is also when the array is already sorted.
Generally, the best case comes about when the medians are the pivots. The best case is when the runtime would truly be nlogn because the array is divided into two equal pieces n times. The average case is when the runtime would be between nlogn and n^2. Generally, if the array is already sorted, the pivot would split the array into n - 1 and nothing each time. Therefore, the array would split into n - 1 pieces n times.

Hypothesis:
We believe that the runtime for QuickSort will be nlogn for average and best case while, it will be n^2 for the worst case.

Methodology:
We did 5000 quicksorts of arrays of size 100, 5000, 200000,and 100000. We averaged the runtime for each size to create our data and graph. We thought running these many trials on arrays of drastically different sizes would give us enough valid data to analyze.

Conclusion:
We found our data to be supporting our hypothesis of the average runtime of QuickSort to be nlogn. Initially, we started with miniscule arrays however, this did not give us the data that were looking for. We realized that scaling up the array size helped us attain more accurate data. 

![alt text](https://github.com/ben-platt/WakaFlocka2020/blob/master/chart.png)
