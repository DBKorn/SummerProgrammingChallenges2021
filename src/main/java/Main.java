//Dovid Korn

public class Main {
    public static void main(String[] args) {
        int[] test1 = {2,7,11,15}, test2 = {3,2,4}, test3 = {3,3}, test4 = {1,0,2}, targets = {9,6,6,2};
        Solution s = new Solution();
        arrayPrinter(s.twoSum(test1, targets[0]));
        arrayPrinter(s.twoSum(test2, targets[1]));
        arrayPrinter(s.twoSum(test3, targets[2]));
        arrayPrinter(s.twoSum(test4, targets[3]));
    }

    public static void arrayPrinter(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print(", ");
        }
        System.out.println("--------------");
    }
}
