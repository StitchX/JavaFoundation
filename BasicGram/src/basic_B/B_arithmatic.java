package basic_B;

import java.util.Scanner;

/*
          运算符
        • 算术运算符: +，―，*，/，%，++，--
        • 关系运算符: >，<，>=，<=，==，!=
        • 逻辑运算符: !，& , | , ^ , &&，||
        • 位运算符: &，|，^，~ ， >>，<<，>>>
        • 赋值运算符: = 扩展赋值运算符:+=，―=，*=，/=
        • 字符串连接运算符: +
 */
public class B_arithmatic {
    public static void main(String[] args) {

////        短路(short-circuit)逻辑运算符
//        Scanner scan = new Scanner(System.in);
//        int d = scan.nextInt();
//        if((d != 88) && (d.day>31)){
//            System.out.println("第一个操作数为假则不判断第二个操作数\n");
//        }else if((d != 88) || (d.day>31)){
//            System.out.println("第一个操作数为真则不判断第二个操作数");
//        }


        //    ~ 取反 & 按位与 | 按位或 ^ 按位异或
        System.out.println(2^3);


//        移位运算符
//      适用数据类型:byte、short、char、int、long
//        对低于int型的操作数将先自动转换为int型再移位（整型提升，对所有的运算都是这样）
//        对于int型整数移位a>>b，系统先将b对32取模，得到的结果才是真正移位的位数
//        对于long型整数移位时a>>b ，则是先将移位位数b对64取模
        System.out.println(2<<2); //"将二进制形式的a逐位左移b位，最低位空出的b位补0
        System.out.println(-9>>2); //带符号右移"将二进制形式的a逐位右移b位，最高位空出的b位补原来的符号位
//        00000000 00000000 00000000 00001001
//        反码：11111111 11111111 11111111 11110110
//        补码：11111111 11111111 11111111 11110111       补码加1
        System.out.println(-9>>>2); //无符号右移,将二进制形式的a逐位右移b位，最高位空出的b位补0


//        赋值运算符
        long c = 10;
        int c2 = (int)c;
//        byte b = 4096;     非法超长
        c+=c2;    //20
        c>>=2;    //10100   00101
        c|=2;     //00101   00010      000111
        System.out.println(c);


//        字符串连接运算符 +；该运算符大大简化了字符串的处理
        String s = "hello, " + "world!";
        System.out.println(s);

/*
    表达式
    表达式是符合一定语法规则的运算符和操作数的序列
    表达式的类型和值
        对表达式中操作数进行运算得到的结果称为表达式的值
        表达式的值的数据类型即为表达式的类型
    表达式的运算顺序
        首先应按照运算符的优先级从高到低的顺序进行
        优先级相同的运算符按照事先约定的结合方向进行
    表达式中的类型转换
        intlongfloatdouble
        所有的byte, short, char 参与算术运算等转为int
*/
        int a=2;
        int b = a++ + ++a;
        System.out.println(b);

    }
}
