package basic_A;

import java.util.Scanner;

/**
 * scanner.nextDouble();
 *         scanner.hasNext();
 *         scanner.hasNextLine();
 *         scanner.close();
 */

/**
 * 1、print：将信息显示在命令窗口中，输出光标定位在最后一个字符之后。
 * 2、printf：将信息进行格式化显示在命令窗口中，输出光标定位在最后一个字符之后。
 * 3、println：将信息显示在命令窗口中，输出光标换行定位在下一行开头。
 * 特点：
 * 1、print：是需求输出的一系列参数, 其个数务必与式样化字符串所阐明的输出参数个数一样多, 各参数之间用","分开。
 * 2、printf：式样化规定字符, 以"%"开端, 后跟一个或几个规定字符, 用来确定输出内容式样。
 * 3、println：从右到左压栈，然后将先读取放到栈底，最后读取的放在栈顶，处理时候是从栈顶开始的。
 */

//Java注释的三种类型
//
//        1、单选注释：符号是：//
//        2、块注释： 符号是： /* */ 可以跨多行
//        3、javadoc注释： 符号是： /** */ 可以跨多行，
//        生成javadoc时，这样的注释会被生成标准的javaapi注释。
//
//        /** */注释的话，你在调用类和方法的时候会出现提示，内容就是你写的注释。
//        而/* */就没有了。/* */就是//的多行版
// Java 空行
//         空白行或者有注释的行，Java 编译器都会忽略掉


public class B_IO {
//    访问修饰符 关键字 返回类型 方法名 String类 字符串数组
    public static void main(String[] args) {

//输入非整数会报错
        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入一个数：");
//        int a = scanner.nextInt();
//        System.out.printf("%d的平方是%d\n",a,a*a);  //printf

//hasNext()
//        System.out.println("无法输入带有空格的字符串：");
//        if (scanner.hasNext()) {
//            String b = scanner.next();
//            System.out.print(b);    //print
//        }

//hasNextLine()
        System.out.println("可以输入空格：");
        if (scanner.hasNextLine()) {
            String c = scanner.nextLine();
            System.out.println(c); //println  鼠标定位在下一行，输出后多一个空行
        }
            scanner.close();

    }
}
