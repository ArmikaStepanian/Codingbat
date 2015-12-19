package task;

public class String2 {

    public String doubleChar(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);                   //новое для меня , до этого не использовала символьный тип
            res = res + ch + ch;                      //чтобы вывести символы на печать, в конкатенации д/присутствовать строка
        }
        return res;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) count++;
        }
        return count;
    }

    public boolean catDog(String str) {
        int countcat = 0;
        int countdog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) countcat++;
            if (str.substring(i, i + 3).equals("dog")) countdog++;     //если счетчик считает в цикле - то
        }                                                              //использовать счетчик надо после цикла, чтобы он все посчитал
        return (countcat == countdog);
    }

    public int countCode(String str) {               //поиск не слова, а последовательности букв
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') count++;
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();                             //создание переменной типа boolean
        boolean testa = a.length() >= b.length() && a.substring(a.length() - b.length()).equals(b);
        boolean testb = b.length() >= a.length() && b.substring(b.length() - a.length()).equals(a);
        return testa || testb;        //можно было решить с .endsWith()
    }

    public boolean xyzThere(String str) {
        if (str.startsWith("xyz")) return true;
        for (int i = 0; i < str.length() - 3; i++) {
            if (
                    str.charAt(i) != '.' &&
                            str.charAt(i + 1) == 'x' &&
                            str.charAt(i + 2) == 'y' &&
                            str.charAt(i + 3) == 'z')
                return true;
        }
        return false;
    }

    public boolean bobThere(String str) {  //поиск не слова, а последовательности букв
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        if (!str.contains("x")) return true;
        if (str.endsWith("x")) return false;
        if (str.contains("y")) {
            if (str.endsWith("y")) return true;
            for (int i = 0; i < str.length() - 1; i++) {  //костыль написанный мною, ниже нормальное решение
                if (str.indexOf("y") > str.indexOf("x"))   //я не знала о lastIndexOf()  он возвращает -1 если нет строки
                    return true;
            }
        }
        return false;
    }

    public boolean xyBalance2(String str) {
        int LastY = str.lastIndexOf("y");    //вот хорошее решение
        int LastX = str.lastIndexOf("x");
        if (LastX == -1 && LastY == -1) return true;
        return (LastY > LastX);
    }

    public String mixString(String a, String b) {
        String res = "";
        for (int i = 0; i < Math.min(a.length(), b.length()); i++) {  //красиво
            res = res + a.charAt(i) + b.charAt(i);
        }
        if (a.length() > b.length())
            return res + a.substring(b.length());
        return res + b.substring(a.length());
    }

    public String repeatEnd(String str, int n) {
        String res = "";
        for (int i = 0; i < n; i++)
            res = res + str.substring(str.length() - n);
        return res;
    }

    public String repeatFront(String str, int n) {
        String res = "";
        for (int i = n; i > 0; i--)
            res = res + str.substring(0, i);
        return res;
    }

    public String repeatSeparator(String word, String sep, int count) {
        String res = "";
        for (int i = 0; i < count; i++)
            res = res + word + sep;
        return res.substring(0, res.lastIndexOf(sep));
    }

    public String repeatSeparator2(String word, String sep, int count) {
        String res = "";
        if (count == 0) return "";
        for (int i = 0; i < count - 1; i++)
            res = res + word + sep;
        return res + word;                  //второе решение
    }

    public boolean prefixAgain(String str, int n) {
        if (n == 0) return false;
        String prefix = str.substring(0, n);
        return (str.substring(n).contains(prefix)); //решила используя contains(), че городить эти костыли
    }

    public boolean xyzMiddle(String str) {
        int len = str.length();
        if (len < 3) return false;
        if (len % 2 == 1)
            if (str.substring(len / 2 - 1, len / 2 + 2).equals("xyz")) return true;
        if (len % 2 == 0)
            if (str.substring(len / 2 - 2, len / 2 + 1).equals("xyz")
                    || str.substring(len / 2 - 1, len / 2 + 2).equals("xyz")) return true;
        return false;
    }

    public String getSandwich(String str) {
        int f = str.indexOf("bread");
        int l = str.lastIndexOf("bread");
        if (f != l)
            return str.substring(f + 5, l);
        return "";
    }

    public String oneTwo(String str) {
        if (str.length() < 3) return "";                            //если строка меньше трех - вернуть пустоту
        String res = "";
        for (int i = 0; i < str.length() - 2; i = i + 3)                          //цикл прыгает через три символа
            res = res + str.substring(i + 1, i + 3) + str.charAt(i);    //второй +третий+первый символы + второй +третий+первый
        return res;

    }

    public String zipZap(String str) {
        for (int i = 0; i < str.length() - 2; i++)
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p')
                str = str.substring(0, i + 1) + str.substring(i + 2);   //главное - не усложнять
        return str;
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++)
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) //я бы сроду не решила. Условие ставим !=  для того
                return false;                                              //чтобы цикл не прерывался
        return true;
    }

    public String wordEnds(String str, String word) {
        String res = "";
        int index = str.indexOf(word);                                  //вернуть символы, окружающие данную подстроку
        while (index != -1) {
            if (index == 0 && str.length() > 2)
                res = res + str.charAt(index + word.length());

            if (str.length() == word.length()) break;

            if (index > 0 && index != str.length() - word.length())
                res = res + str.charAt(index - 1) + str.charAt(index + word.length());

            if (index == str.length() - word.length())
                res = res + str.charAt(index - 1);

            index = str.indexOf(word, index + word.length());
        }
        return res;
    }

    public String wordEnds1(String str, String word) {          //вернуть символы, окружающие данную подстроку
        if (str.length() == word.length()) return "";     //еще один вариант, эта строчка добавлена в начало
        String res = "";
        int index = str.indexOf(word);
        while (index != -1) {

            if (index == 0 && str.length() > 2)
                res = res + str.charAt(index + word.length());

            if (index > 0 && index != str.length() - word.length())
                res = res + str.charAt(index - 1) + str.charAt(index + word.length());

            if (index == str.length() - word.length())
                res = res + str.charAt(index - 1);

            index = str.indexOf(word, index + word.length());
        }
        return res;
    }

    public String plusOut(String str, String word) {      //Заменить все символы знаком +, а данную подстроку оставить без изменений
        int start = 0;                                //Научилась идти по строке, заменяя символы другим знаком
        int end = str.indexOf(word);                   //Используется свойство, что str.substring (0,0) возвращает пустой символ
        while (end != -1) {                             // и str.substring (str.length()) возвращает пустой символ
            for (int i = start; i < end; i++)
                str = str.substring(0, i) + "+" + str.substring(i + 1);

            start = end + word.length();
            end = str.indexOf(word, start);
        }
        for (int i = start; i < str.length(); i++)
            str = str.substring(0, i) + "+" + str.substring(i + 1);
        return str;

    }

    public String starOut(String str) {             //удалить звездочки и символы вокруг них
        while (str.indexOf('*') != -1) {                      //пока есть *
            if (str.equals("*")) return "";                   //если строка состоит из одной * то вернуть пусто
            int firstStar = str.indexOf('*');                 //создаем индекс первой звездочки
            int secondStar = str.indexOf('*', firstStar + 1);   //создаем индекс второй звездочки (далее будет известно есть ли она)

            if (secondStar - firstStar == 1) {                //если вторая звездочка стоит рядом с первой
                str = str.substring(0, firstStar) + str.substring(secondStar); //то удаляем первую звездочку
                continue;                                                     //и продолжаем цикл while
            }

            if (firstStar == 0)                              //если первая звездочка на нулевом индексе
                str = str.substring(firstStar + 2);            //возвращаем подстроку без звездочки и последующего символа
            else if (firstStar == str.length() - 1)            //если звездочка на последнем индексе
                str = str.substring(0, str.length() - 2);      //возвращаем подстроку без предпоследнего символа и звездочки
            else
                str = str.substring(0, firstStar - 1) + str.substring(firstStar + 2); //возвращаем сумму подстрок без звездочки и соседних символов
        }
        return str;
    }


}
