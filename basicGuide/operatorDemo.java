public class operatorDemo {

    // 赋值
    public void voluation() {
        int a = 10;
        System.out.println("10 赋值 给 a ");
    }
    // 基础算术运算符
    public void besis() {
        int b = 20;
        int c = 30;
        System.out.println("a+b = "(a+b));

        System.out.println("a-b = "(a-b));

        System.out.println("a*b = "(a*b));

        System.out.println("a/b = "(a/b));
        
        System.out.println("a%b = "(a%b));
    }
    //  一元
    public void unitary() {
        // 一元符号
        int a = +10;
        System.out.println(+a);
        a = -10;
        System.out.println(-a);

        a = 10;
        // 自增 ++
        a = a++;
            System.out.println("a++: "a);
        a = 10;
        // 自减
        a = a--;
            System.out.println("a--: "a);

        // ！ 反布尔
        a = 20;
        b = 20;
        // 如果表达式 正确返回 ture,否则为false
        System.out.println("a != b :  "(a!=b));
        System.out.println("a == b :  "(a==b));
    }
    // 比较
    public void compare() {
        int a = 10;
        int b = 20;
        // 表达式结果为真或假
        System.println("a == b:" a==b);
        System.println("a != b:" a!=b);
        System.println("a > b:" a>b);
        System.println("a < b:" a<b);

        a = 10;
        b = 10;
        System.out.println("a >= b:"a>=b);
        b = 20;
        System.out.prinln("a <= b: "a<=b);
    }
    // 与、或
    public void with_or() {
        int a = 10;
        int b = 10;
        if (a==10) && (b==10) 
            System.out.println("a 和 b 的值都达到条件，结果为：ture");

        b = 20;
        if (a==10) || (b==10) 
            System.out.println("a 和 b其中一个达到条件，结果为：ture");
    }
    // 类型比较
    public void class_compare() {
        int a = 10;
        float b = 10.0;
        System.out.println( a instanceof b);
    }

    //  main 
    public static void mian(String [] args) {
        
    }

 }