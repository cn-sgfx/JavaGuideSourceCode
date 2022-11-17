// 判断语句 /开关
class judge {
    int a = 10;
    int b = 20;
    public void ifDemo() {
        System.out.prinln("这是if 语句的示例");
        System.out.println("10 < 20 ? yes/no");
        if(10<20)
            System.out.println("yes");
    }
    //Switch 是根据值来选择的开关语句
    public void SwitchDemo() {
        System.out.prinln("这是Switch 语句的示例");
        switch(1) /*括号里是值*/ {
            case 1: System.out.prinln("switch 的值是 1"); break;
            case 2: System.out.prinln("switch 的值是 2"); break;
            case 3: System.out.prinln("switch 的值是 3"); break;
        }
    }
}

// 循环语句 /循环
class recurrence {
    public void forDemo() {
        System.out.prinln("这是for 语句的示例");
        for(int a=0;a < 5;a++)
            System.out.prinln("a < 5 则循环，直到不满足条件!");
    }
    public void whileDemo() {
        System.out.prinln("这是while 语句的示例"); 
        int a = 10;
        while(a < 20) { 
            System.out.prinln("a < 5 则循环，直到不满足条件!");
            a++;
        }
    }
}

public class basicGrammar {

    public static void main(String [] args) {

    }
}