package task;
public class String1 {

    public String extraEnd(String str) {
        String s = str.substring(str.length()-2,str.length());
        return s+s+s;
    }
    public String firstTwo(String str) {
        if (str.length()>1){
                return str.substring(0,2);}
        else return str;
    }
    public String firstHalf(String str) {
        return str.substring(0, str.length()/2);
    }
    public String withoutEnd(String str) {
        if (str.length()>1){
            return str.substring(1,str.length()-1);
        }return "";
    }
    public String comboString(String a, String b) {
       if (a.length()>b.length()){
           return b+a+b;
       } return a+b+a;
    }
    public String nonStart(String a, String b) {
        if (a.length() != 0 && b.length() != 0) {
            return a.substring(1, a.length()) + b.substring(1, b.length());
        } return "";
    }
    public String left2(String str) {
        return str.substring(2,str.length())+str.substring(0,2);
    }
    public String theEnd(String str, boolean front) {
        if (front){return str.substring(0,1);}
       return str.substring(str.length()-1);
    }
    public String nTwice(String str, int n) {
        return str.substring(0,n)+str.substring(str.length()-n,str.length());
    }
    public String twoChar(String str, int index) {
        if (index <= str.length()-2 && index>0 ){
            return str.substring(index,index+2);}
        return str.substring(0,2);
    }
    public boolean hasBad(String str) {
        return  (str.contains("bad") && str.indexOf("bad")<2);
    }
    public String atFirst(String str) {
        if (str.length()==1){
                return str+"@";
        }   else if(str.length()==0){
                return "@"+"@";
        }   else
                return str.substring(0,2);
    }

    public String lastChars(String a, String b) {
        if (a.length()>0 && b.length()>0){
            return a.substring(0,1)+b.substring(b.length()-1, b.length());
        }
        if (a.length()>0 && b.length()==0){
            return a.substring(0,1)+"@";
        }
        if (a.length()==0 && b.length()>0){
            return "@"+b.substring(b.length()-1, b.length());
        }   return "@"+"@";
        }
    public String conCat(String a, String b) {
        if (a.length()>0 && b.length()>0 && a.charAt(a.length()-1)== b.charAt(0))
            return a+b.substring(1);
        else
            return a+b;
    }
    public String lastTwo(String str) {
        if (str.length()>1)
            return  str.substring(0, str.length()-2) +
                    str.charAt(str.length()-1) +
                    str.charAt(str.length()-2);
        else return str;
    }
    public String seeColor(String str) {
        if (str.startsWith("red"))
            return "red";
        if (str.startsWith("blue"))
            return "blue";
        return "";
    }
    public boolean frontAgain(String str) {
        if (str.length()<2)
            return false;
       return  (str.substring(0, 2).equals(str.substring(str.length() - 2)));
    }
    public String minCat(String a, String b) {
        if (a.length()>b.length()){
            return a.substring(a.length() - b.length()) + b;
        }
        return a + b.substring(b.length()-a.length());

    }
    public String extraFront(String str) {
        String part = "";
        if (str.length()<2) part = str;
        else part = str.substring(0,2);
        return  part + part +part;
    }
    public String without2(String str) {
        if (str.length()>1 && str.substring(0,2).equals(str.substring((str.length()-2)))){
            return str.substring(2);
        }return str;
    }
    public String deFront(String str) {
       if (str.charAt(0)=='a' && str.charAt(1)=='b')
           return str.substring(0);
       if (str.charAt(0) != 'a' && str.charAt(1)=='b')
            return str.substring(1);
       if (str.charAt(0) == 'a' && str.charAt(1) != 'b')
            return str.charAt(0)+str.substring(2);
        else return str.substring(2);
    }
    public String withoutX(String str) {
        if (str.length()==0)
            return "";
        if (str.charAt(0)=='x')
            str = str.substring(1);        //последовательное обрезание строки(ненужные символы - в начале и конце строки)
        if (str.length()>0 && str.charAt(str.length()-1)=='x')
            str = str.substring(0, str.length()-1);
        return str;
    }
    /*public String withoutX2(String str) {
        if (str.length() < 2) return "";
        String result = "";                //не проходит тест если строка из одного символа не равного Х
        if (str.charAt(0) != 'x') result += str.charAt(0);
        if (str.charAt(1) != 'x') result += str.charAt(1);
        result += str.substring(2);
        return result;
    }*/
    public String withoutX2(String str) {
        if (str.length()==0) return "";
        String res = "";                 //последовательное прибавление символов (фильтровали символы с начальных позиций)
        if (str.charAt(0) !='x') res = res + str.charAt(0);
        if (str.length()>1 && str.charAt(1) != 'x') res = res+str.charAt(1);
        if (str.length()>2) res = res + str.substring(2);
        return res;

    }






   /* public static void main(String[] args) {
       String1 g = new String1();
        System.out.println(g.oopPair("ZoooOOPyesOOPno"));

    }*/
}
