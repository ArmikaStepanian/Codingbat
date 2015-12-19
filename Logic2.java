package task;
public class Logic2 {

    public boolean makeBricks(int small, int big, int goal) {
        return (small + 5*big == goal ||
                    small + 5*big > goal &&    //задача про кирпичи. MakeBricks
                        goal%5 <= small);
    }
    public int loneSum(int a, int b, int c) {   //я решила, но это решение явно оптимальнее
        int sum = 0;
        if (a!=b && a!=c)
            sum = sum +a;
        if (b!=a && b!=c)
            sum = sum +b;
        if(c!=a && c!=b)
            sum = sum+c;
        return sum;
    }
    public int luckySum(int a, int b, int c) { //Решила влет, это легко
        if (a==13) return 0;
        if (b==13) return a;
        if (c==13) return a+b;
        return a+b+c;

    }
    public int noTeenSum(int a, int b, int c) {          //В задании подсказали про второй метод-помощник. Решила влет
        return fixTeen(a)+fixTeen(b)+fixTeen(c);
    }
    public int fixTeen(int n){
        if (n>12 && n<15 || n>16 && n<20) return 0;
        return n;
    }

    public int roundSum(int a, int b, int c) {             //тоже сама решила,
        return round10(a)+round10(b)+round10(c);

    }
    public int round10(int num){               //но оптимизировала round10 благодаря подсказке
        if (num%10<5)
            return num/10*10;
        return num/10*10+10;
    }

    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(a-b)<2 && Math.abs(a-c)>1 && Math.abs(c-b)>1 ||          //сама решила
                Math.abs(a-c)<2 && Math.abs(a-b)>1 && Math.abs(b-c)>1) ;

    }
    public int blackjack(int a, int b) {
        if (a>21 && b>21) return 0;
        if (a>21 && b<=21) return b;
        if(a<=21 && b>21) return a;
        return Math.max(a,b);           //сама решила, только оптимизировала эту строчку
        //if (a>b) return a; else return b;
    }
    public int blackjack2(int a, int b) { //красивое решение, мне понравилось и я его поняла
        int newA = a;
        if (a>21) newA = 0;
        int newB = b;
        if (b>21) newB = 0;
        return Math.max(newA, newB);
    }
    public boolean evenlySpaced(int a, int b, int c) {        //решила сама . решение не очень, но и в готовых решениях тоже какой-то геморр
        if (a == b && b==c) return true;
        if (a != b && b!=c && c!=a){
            if (Math.abs(b-a)==Math.abs(b-c) ) return true; //int min = Math.min(Math.min(a, b), c);  вот так искать минимум среди трех значений
            if (Math.abs(a-b)==Math.abs(a-c) ) return true;
            if (Math.abs(c-a)==Math.abs(b-c) ) return true;}
        return false;
    }

    public int makeChocolate(int small, int big, int goal) {    //хорошее решение про коробку шоколада
        int max = goal/5;       //до этой переменной сама додумалась
        if (max > big) {
            if (goal - 5*big <= small) return (goal - 5*big); else return -1;} //вот это красивая строчка

        if (max <= big){
            if (goal - 5*max <= small) return (goal - 5*max); else return -1;}
        return -1;
    }











}
