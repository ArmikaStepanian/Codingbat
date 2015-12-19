package task;

public class Logic1 {

    /*public boolean cigarParty(int cigars, boolean isWeekend) {
        return  (cigars>=40 && cigars<=60 && !isWeekend)  ||
                (cigars>=40 && isWeekend);
    }*/
    public boolean cigarParty1(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        }                   //Типовое решение - когда два булева условия и два числовых условия
        return (cigars >= 40 && cigars <= 60);
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;   //важен порядок исключения!
        if (you >= 8 || date >= 8) return 2;
        return 1;
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return (temp >= 60 && temp <= 100);
        }     //Типовое решение - когда два булева условия и два числовых условия
        return (temp >= 60 && temp <= 90);
    }
        /*return (temp>=60 && temp<=90 && !isSummer) ||
                (temp>=60 && temp<=100 && isSummer);*/

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday)
            speed = speed - 5;                   //логика в том, что нужно уменьшать сущ. скорость а не повышать лимиты
        if (speed <= 60) return 0;
        if (speed <= 80 && speed > 60) return 1;
        return 2;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {              //!!!!Первое условие самое однозначное. И в дальнейшем не имеет значения.
            if (day >= 1 && day <= 5)
                return "10:00";
            return "off";
        }
        if (day >= 1 && day <= 5)
            return "7:00";
        return "10:00";
    }

    public boolean in1To10(int n, boolean outsideMode) {   //внимательно с И и с ИЛИ
        if (outsideMode) {                   //сначала ставим булево условие//!!!!Первое условие самое однозначное. И в дальнейшем не имеет значения.
            return (n <= 1 || n >= 10);
        }       //затем проверяем числовое условие,
        return (n >= 1 && n <= 10);          // затем проверяем другое булево значение и числовое значение
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMom) {
            return true;
        }             //!!!!Первое условие самое однозначное. И в дальнейшем не имеет значения.
        return (!isMorning);

    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;       //важен порядок исключения!!!!!!!!!!!!!!!!!   меньше пяти - пошли вон
        if (tea >= candy * 2 || candy >= tea * 2)
            return 2;             // двойные значения, а переменные больше 5 по-любому
        return 1;                                       //все остальное. больше пяти и не двойные
    }

    public boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) return false;
        return (n % 3 == 0 || n % 5 == 0);
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b"))       //FizzBuzz problem Нужно исключать значения внимательно
            return "FizzBuzz";
        if (str.startsWith("f")) return "Fizz";
        if (str.endsWith("b")) return "Buzz";
        return str;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";          //FizzBuzz problem
        if (n % 3 == 0) return "Fizz!";
        if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    public boolean twoAsOne(int a, int b, int c) {
        int sum = a + b + c;
        return (sum % 2 == 0 && (sum / 2 == a || sum / 2 == b || sum / 2 == c));
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) return b < c;   //Это условие Уже, поэтому оно первое
        return a < b && b < c;    // Это условие шире, поэтому оно второе
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) return a <= b && b <= c;    //Это условие Уже, поэтому оно первое
        return a < b && b < c;                  // Это условие шире, поэтому оно второе
    }

    public boolean lastDigit(int a, int b, int c) {
        return (a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10);   //правая цифра одинаковая
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 ||                  //разность между тремя значениями
                Math.abs(b - c) >= 10 ||
                Math.abs(c - a) >= 10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        int sum = die1 + die2;
        if (die1 != die2)
            return sum;
        if (noDoubles) {
            if (die1 == 6)
                return 7;
            return sum + 1;
        }
        return sum;
    }

    public int maxMod5(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) {
            if (a > b) return b;
            return a;
        }
        if (a > b) return a;
        return b;
    }

    public int redTicket(int a, int b, int c) {
        if (a == b && b == c) {
            if (a == 2)
                return 10;                //важен порядок исключения вариантов
            return 5;
        }
        if (b != a && c != a)
            return 1;
        return 0;
    }

    public int greenTicket(int a, int b, int c) { // опять важен порядок. И важно напоследок оставить какой-нибудь return
        if (a == b && b == c) return 20;
        if (a == b || b == c || c == a) return 10;
        return 0;
    }

    public int blueTicket(int a, int b, int c) {
        if (a + b == 10) {
            if (b + c < 10 && c + a < 10) return 5;
            if (b + c == 10 || a + c == 10) return 10;
        }
        return 0;
    }

    public boolean shareDigit(int a, int b) {
        return (a / 10 == b / 10 || a / 10 == b % 10 || a % 10 == b % 10 || a % 10 == b / 10);  //с помощью "/" ищем первый знак в числе
    }

    public int sumLimit(int a, int b) {
        String sum = String.valueOf(a + b);
        String strA = String.valueOf(a);
        if (sum.length() > strA.length())
            return a;
        return a + b;
    }


//    public static void main(String[] args) {
//        Logic1 g = new Logic1();
//        System.out.println(g.alarmClock(12, false));
//
//    }
}
