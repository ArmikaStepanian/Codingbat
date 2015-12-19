package task;

public class Wormup2 {
    public String stringTimes(String str, int n) {
        String s = "";
        for (int i=0; i<n; i++){
            s = s + str;
        } return s;

    }
    public String frontTimes(String str, int n) {
        int x = 3;
        if (str.length() < x){
            x = str.length();
        }
        String s = "";
        for (int i=0; i<n; i++){
            s = s + str.substring(0, x);
        }
        return s;
    }
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("xx")) count++;
        }
        return count;
    }
    boolean doubleX(String str) {
        int a = str.indexOf("x");
        if ((a == -1) || a == str.length()-1) return false;
        return (str.substring(a, a + 2).equals("xx"));
    }
    public String stringSplosion(String str) {
        String s = "";
        for (int i=0; i<str.length(); i++){
            s += str.substring(0,i+1);
        }return  s;
    }
    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if (end > 4) end = 4;

        for (int i=0; i<end; i++){
            if (nums[i]==9){return true;}
        }return false;
    }
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++){
            if (nums[i]==9) count++;}
        return count;
    }
    public boolean array123(int[] nums) {
        for (int i=0; i<nums.length - 2; i++){
            if (nums[i]==1 & nums[i+1]==2 & nums[i+2]==3)return true;
        }return false;
    }

    public int stringMatch(String a, String b) {
        int x = Math.min(a.length(),b.length());
        int count = 0;
        for (int i=0; i<x-1 ;i++){
            String aSub = a.substring(i,i+2);
            String bSub = b.substring(i,i+2);
            if (aSub.equals(bSub)){count++;
            }
        }return count;
    }
    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {

            if (!(str.substring(i,i+1).equals("x") && i > 0 && i < str.length()-1)){
                result = result + str.substring(i,i+1);
            }
        }return result;
    }
    public String altPairs(String str) {
        String result = "";
        for (int i=0; i<str.length(); i += 4) {

            int end = i + 2;
            if (end > str.length()) {
                end = str.length();
            }
            result = result + str.substring(i, end);
        }

        return result;
    }
    public String stringYak(String str) {
        return str.replace("yak","");
    }
    public int array667(int[] nums) {
        int count = 0;
        for (int i=0; i< nums.length-1; i++){
            if (nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7)) count++;
        }return count;
    }
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])return false;
        } return true;
    }
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i+1]-nums[i]==5 && nums[i+2] < nums[i] && nums[i+2] > -nums[i])return true;
        }return false;
    }



}