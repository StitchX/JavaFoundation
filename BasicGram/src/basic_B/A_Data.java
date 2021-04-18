package basic_B;


//    数据类型决定数据的存储方式和运算方式
//    Java中的数据类型分为两大类：
//             基本数据类型（primitive types）： 变量在栈    (四类八种)
//                  数值型{整数类型(byte, short, int, long)、浮点类型(float, double)}、字符型(char)、布尔型（boolean）
//             引用类型( reference types )： 变量引用到堆
//                  类(class)、接口(interface)、数组
public class A_Data {
    public static void main(String[] args) {
//  Java字符采用Unicode编码，每个字符占两个字节;
        char a1='a'; //单引号括起来的单个字符
        char a2='\u0061'; //可用十六进制编码形式表示;1到4位十六进制数所表示的字符(xxxx)
        char a3='\n'; //使用转义字符'\'来将其后的字符转变为其它的含义
        /*
         * 转 义 字 符 含 义
         * • \ddd 1到3位八进制数所表示的字符(ddd)
         * • \\uxxxx 1到4位十六进制数所表示的字符(xxxx)
         * • \' 单引号字符
         * • \" 双引号字符
         * • \\ 反斜杠字符
         * • \r 回车
         * • \n 换行
         * • \f 走纸换页
         * • \t 横向跳格
         * • \b 退格
         */
        System.out.print(a1+" "+a2+" "+a3);
        System.out.println(a1+a2+a3);

//  整数型
//  Java各整数类型有固定的表数范围和字段长度，而不受具体操作系统的影响，以保证Java程序的可移植性
        int b1 = 4;  //4字节  -2^31 ~ (2^31)-1
        short b2 = 2;  //   ^15
        long b3 =8L;    //   ^63  声明long型常量可以后加‘ l ’或‘ L ’
        byte b4 = 1; //1字节 -128 ~ 127
        int b21=0x12;  //十六进制数，要求0x或0X开头
        int b22=010;  //八进制整数，要求以0开头
        int b23=0b00010010;   //二进制数，以0b或0B开头
        System.out.println(b22);
//        Java中没有“无符号数”
//        可以用long来处理无符号整数（uint）

//        浮点型
//        Java浮点类型有固定的表数范围和字段长度
//        两种表现形式:十进制和科学计数法
//        十进制必须含有小数点    3.14、314.0、.314
        float f1=.314f;  //如要声明一个常量为float型，则需在数字后面加f或F
        double f2 =3.14e2;  //Java浮点型常量默认为double型

//        标识符
/*
 * Java 标识符
 * Java 所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。
 *
 * 关于 Java 标识符，有以下几点需要注意：
 *
 * 所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
 * 首字符之后可以是字母（A-Z 或者 a-z）,美元符（$）、下划线（_）或数字的任何字符组合
 * 关键字不能用作标识符
 * 标识符是大小写敏感的
 * 合法标识符举例：age、$salary、_value、__1_value
 * 非法标识符举例：123abc、-salary
 *  应注意Java是大小写敏感的语言。
    按Java惯例，类名首字母用大写（Pascal)
    其余的（包名、方法名、变量名）首字母都小写(camel)
    少用下划线
    变量、常量随使用随定义
 */
    }

}