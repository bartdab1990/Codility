package co.uk.sda.london;


/*

Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of distinct values in array A.

        For example, given array A consisting of six elements such that:
        A[0] = 2    A[1] = 1    A[2] = 1
        A[3] = 2    A[4] = 3    A[5] = 1

        the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

        Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].

*/


import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Distinct {
    public static void main(String[] args) {
        int N=100000;
        int [] A=new int[100000];
        Random random = new Random();
        for(int i=0;i<N;i++)
        {
            A[i]=random.nextInt(2001)-1000;
        }
        //int [] A = {2,1,1,2,3,1};
        System.out.println(solution(A));
    }

    public static int solution(int[] a) {
        long starTime = System.currentTimeMillis();
        HashSet<Integer> hashSet = IntStream.of(a).boxed().collect(Collectors.toCollection(HashSet::new));
        long endTime= System.currentTimeMillis();
        long resualt = endTime-starTime;
        System.out.println("The time is: "+resualt);
        return hashSet.size();
    }
}
