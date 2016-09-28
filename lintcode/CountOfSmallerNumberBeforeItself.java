/*
 * Give you an integer array (index from 0 to n-1, where n is the size of this 
 * array, value from 0 to 10000) . For each element Ai in the array, count the 
 * number of element before this element Ai is smaller than it and return count 
 * number array.

 Notice

We suggest you finish problem Segment Tree Build, Segment Tree Query II and 
Count of Smaller Number before itself I first.

Example
For array [1,2,7,8,5], return [0,1,2,3,2]
 */
public class CountOfSmallerNumberBeforeItself {

    /**
     * @param A: An integer array
     * @return: Count the number of element before this element 'ai' is 
     *          smaller than it and return count number array
     */ 
    public ArrayList<Integer> countOfSmallerNumberII(int[] A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (A == null || A.length == 0) {
            return result;
        }
        return result;
    }

    class SegmentTree {

    }

}
