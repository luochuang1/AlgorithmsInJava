import java.util.ArrayList;
import java.util.List;
/**
 *       1 
        1 1 
       1 2 1 
      1 3 3 1 
     1 4 6 4 1 
    1 5 10 10 5 1 
   1 6 15 20 15 6 1
   规律：从第二行以后，每行的首尾都是１，中间元素值是上一行相邻两个元素之和．
 */
public class Solution {
	public static List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < numRows; i++) {
			List<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i)
					list.add(1);
				else {
					int sum = result.get(i - 1).get(j - 1)
							+ result.get(i - 1).get(j);
					list.add(sum);
				}
			}
			result.add(list);
		}
		return result;
	}

	public static void main(String[] args) {
		List<List<Integer>> lists = generate(5);
		for (int i = 0; i < lists.size(); i++) {
			System.out.println();
			for (int j = 0; j < lists.get(i).size(); j++) {
				System.out.print(lists.get(i).get(j) + " ");
			}
		}
	}
}
