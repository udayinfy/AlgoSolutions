/*
 * Given n and k, return the k-th permutation sequence.

 Notice

n will be between 1 and 9 inclusive.

Example
For n = 3, all permutations are listed as follows:

"123"
"132"
"213"
"231"
"312"
"321"
If k = 4, the fourth permutation is "231"

Challenge
O(n*k) in time complexity is easy, can you do it in O(n^2) or less?
 */
public class PermutationSequence {

    /**
      * @param n: n
      * @param k: the kth permutation
      * @return: return the k-th permutation
      */
    public String getPermutation(int n, int k) {
        String result = "";
        long factorial = 1;
        for (int i = 1; i < n; ++i) {
            factorial *= i;
        }
        for (int i = 1; i <= n; ++i) {
            result += k / factorial + 1;
            k %= factorial;
            factorial /= n - i;
        } 
        return result;


        List<Integer> list = new ArrayList<Integer>();
        long factorial = 1;
        for (int i = 1; i <= n; ++i) {
            list.add(i);
            factorial *= i;
        }
        factorial /= n;
        String result = "";
        for (int i = 1; i <= n; ++i) {
            result += list.get(i);
            k %= factorial;
            factorial /= n - i;
        }
        return result;
    }

}
