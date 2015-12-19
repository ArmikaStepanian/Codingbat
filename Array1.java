package task;

public class Array1 {
    public boolean firstLast6(int[] nums) {
        return (nums[0]==6 || nums[nums.length-1]==6);
    }
    public boolean sameFirstLast(int[] nums) {
        return (nums.length>0 && nums[0]==nums[nums.length-1]);
    }

    public int[] makePi() {
    int [] pi = {3,1,4};
        return pi;

    }
    public int sum3(int[] nums) {
        return nums[0]+nums[1]+nums[2];   //это сложение элементов массива
    }
    public int[] reverse3(int[] nums) {
      int[] arr = {nums[2], nums[1], nums[0]};  //А это вывод элементов массива в нужной последовательности
    return arr;
    }
    public int[] maxEnd3(int[] nums) {
        if (nums[0]>nums[2]){
            nums[1]=nums[0];
            nums[2]=nums[0];
        } else {
            nums[0]=nums[2];
            nums[1]=nums[2];
        } return nums;
    }
    public int[] makeEnds(int[] nums) {
        int[] arr = {nums[0], nums[nums.length-1]};
        return arr;
    }
    public int[] makeLast(int[] nums) {
        int [] arr = new int [nums.length*2];
        arr [arr.length-1] = nums[nums.length-1];
        return arr;
    }
    public boolean double23(int[] nums) {
        if (nums.length>1){
            if (nums[0]==nums[1] && (nums[0]==3 || nums[0]==2)) return true;}
        return false;
    }
    public int start1(int[] a, int[] b) {
        int count = 0;
            if (a.length>0 && a[0]==1)count++;
                if (b.length>0 && b[0]==1) count++;
        return count;
    }
    public int[] swapEnds(int[] nums) {
        int x = nums[0];
        nums[0]=nums[nums.length-1];  //замена первого элемента последним (через доп. переменную)
        nums[nums.length-1] = x;
        return nums;
    }
    public int maxTriple(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length/2];
        int end = nums[nums.length - 1];
        if (first > middle) middle = first;   //сравнение трех элементов массива
        if (middle > end) end = middle;
        return end;
    }
    public boolean unlucky1(int[] nums) {
        if(nums.length<2) return false;
        for (int i=0; i<2; i++){
            if (nums[i]==1 && nums[i+1]==3) return true;   //интересная логика
        }
        return (nums[nums.length-2]==1 && nums[nums.length-1]==3) ;
    }
    public int[] make2(int[] a, int[] b) {
        int[] arr = new int[2];
            if (a.length == 0) {
                arr = b;
            } else if (a.length == 1) {
                arr[0] = a[0];
                arr[1] = b[0];
            } else {
                arr[0] = a[0];
                arr[1] = a[1];
            }
            return arr;
    }
    public int[] front11(int[] a, int[] b) {
        int[] one = new int[1];
        int[] two = new int[2];
        if (a.length == 0 && b.length == 0 ){
            return a;
        } else if (a.length == 0){
            one [0] = b[0];
            return one;
        } else if (b.length == 0){
            one [0] = a[0];
            return one;
        } else {
            two[0] = a[0];
            two[1] = b[0];
            return two;
        }
    }


//    public static void main(String[] args) {
//        Array1 g = new Array1();
//
//        System.out.println(g.firstLast6(new int[]{1,2,3,6}));
//
//    }




}
