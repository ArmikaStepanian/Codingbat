
package task;

public class Wormup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;}
        {return false;}
    }

    public int diff21(int n) {
        if (n <= 21) {
            return (21 - n);
        }
        return Math.abs(21 - n) * 2;
    }

    public boolean nearHundred(int n) {
        if (Math.abs(n) <= 110 & Math.abs(n) >= 90) {
            return true;
        } else if (Math.abs(n) <= 210 & Math.abs(n) >= 190) {
            return true;
        } else {
            return false;
        }
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b > 0 || a > 0 && b < 0);
        }
    }

    public String notString(String str) {
        String str1 = "not";
        if (str.startsWith(str1)) {
            return str;
        } else return (str1 + " " + str);
    }

    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile & bSmile || !aSmile & !bSmile);
    }

    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b) * 2;
        } else return (a + b);
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking & (hour < 7 || hour > 20));
    }

    public boolean makes10(int a, int b) {
        return  (a + b == 10 | a == 10 | b == 10);
    }

    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + str.substring(1, (str.length() - 1)) + str.charAt(0);
        }
    }

    public String front3(String str) {
        int x = 3;
        if (str.length() < x) {
            return str+str+str;
        } else {
            return str.substring(0, x) + str.substring(0, x) + str.substring(0, x);}
    }

    public String backAround(String str) {
        String x = str.substring(str.length() - 1, str.length());
        return x + str + x;
    }

    public boolean or35(int n) {
        return  (n%3==0 | n%5 ==0);
    }

    public String front22(String str) {
        if (str.length()<=2){return str+str+str;}
        else {return str.substring(0,2)+str+str.substring(0,2);}
    }
    public boolean startHi(String str) {
        return (str.startsWith("hi"));
    }
    public boolean icyHot(int temp1, int temp2) {
        return  (temp1<0 && temp2>100 || temp1>100 && temp2<0);
    }
    public boolean in1020(int a, int b) {
        return  (a>=10 && a<=20 || b>=10 && b<=20);
    }
    public boolean hasTeen(int a, int b, int c) {
        return (a>12 & a<20 || b>12 & b<20 || c>12 & c<20 );
    }
    public boolean loneTeen(int a, int b) {
        return ((a>12 && a<20) ^ (b>12 && b<20));          // ^ -либо A в диапазоне, либо B в диапазоне, но не оба
    }
    public String delDel(String str) {
        if (str.length()>3) {
            if (str.substring(1,4).equals("del"))
            {return str.charAt(0)+str.substring(4);}
            else {return str;}
        }
        else return str;
    }
    public boolean mixStart(String str) {
        return ((str.length()>2) && (str.substring(1,3).equals("ix")));
    }
    public int intMax(int a, int b, int c) {
        if (a>b & a>c){return a;}
        if (b>a & b>c){return b;}
        else {return c;}
    }
    public int close10(int a, int b) {
        if (Math.abs(10-a) < Math.abs(10-b)){return a;}
        else if (Math.abs(10-a) == Math.abs(10-b)){return 0;}
        return b;

    }
    public boolean in3050(int a, int b) {
        return ((a>29 && a<41) && (b>29 && b<41))||((a>39 && a<51) && (b>39 && b<51));
    }
    public boolean stringE(String str) {
        int count = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'e') count++;}

        return  (count>0 && count<4);
    }
    public boolean lastDigit(int a, int b) {
        return(a%10==b%10);
    }
    public String endUp(String str) {
        if (str.length() > 2){
            String x = str.substring(str.length()-3).toUpperCase();
            return str.substring(0, str.length()-3) + x;
        } return str.toUpperCase();

    }
    public String everyNth(String str, int n) {
        String s = "";
        for (int i=0; i<str.length(); i = i+n){
            s = s + str.charAt(i);
        }       return s;
    }
    public String startOz(String str) {
        String s = "";
        if (str.length()>1){
            if (str.charAt(0)=='o'){
                s = s+str.substring(0,1);
            }if (str.charAt(1)=='z'){
                s = s+str.substring(1,2);
            } return s;
        } if (str.length()==1 && str.charAt(0)=='o'){
            return "o";
        } return s;
    }
    public int max1020(int a, int b) {
        if (a>b) {
            if (a > 9 & a < 21 ) {return a;}
            else if (b>9 & b<21){return b;}
        }

        if (a<b){
            if (b>9 & b<21) {return b;}
            else if (a > 9 & a < 21){return  a;}
        }
        return 0;
    }





}
