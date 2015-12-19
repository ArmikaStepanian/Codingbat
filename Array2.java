package task;

public class Array2 {
    public int bigDiff(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i=0; i<nums.length; i++) {  //нахождение минимального и максимального в массиве
            if (min>nums[i]) min = nums[i];
            if (max<nums[i]) max = nums[i];
        }
        return max-min;
    }
    public int sum13(int[] nums) { //можно идти по массиву и что-то исключать по ходу, перепрыгивать итерацию в нужной ситуации
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != 13) sum += nums[i];
            else if (i<nums.length) i++;
        }

        return sum;
    }
    public int sum67(int[] nums) {   //можно идти по массиву и что-то исключать по ходу, перепрыгивать итерацию в нужной ситуации
        int sum = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=6) sum = sum + nums[i];
            else
                while (nums[i] !=7) i++;
        }
        return sum;
    }
    public boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int i=0; i<nums.length; i++)
            if (nums[i]==1) count1++;
            else if (nums[i]==4) count4++;
        if (count1 > count4) return true;
        return false;
    }
    public int[] zeroFront(int[] nums) { //нули в начало массива, остальное в конец массива
        int [] arr = new int[nums.length];
        int zero = 0;
        int notzero = arr.length - 1;
        for (int i=0; i<nums.length; i++)
            if (nums[i]==0)
                arr[zero++]=nums[i];
            else
                arr [notzero--]=nums[i];
        return arr;

    }
    public int[] post4(int[] nums) { //элементы после определенного числа
        int pos4 = 0;
        for (int i=0; i<nums.length; i++)
            if (nums[i]==4) pos4 = i;

        int [] arr = new int[nums.length-pos4-1];
        for (int i=pos4+1, j=0; i<nums.length; i++, j++)
            arr[j]=nums[i];
        return arr;
    }
    public int[] pre4(int[] nums) { //элементы до определенного числа
        int count = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]!=4) count++;
            else break;
        }

        int [] arr = new int[count];
        for (int i=0; i<count; i++)
            arr[i]=nums[i];
        return arr;

    }










}
