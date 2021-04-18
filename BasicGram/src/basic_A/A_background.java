package basic_A;

/**
 * application的编辑、编译和运行
 * 编辑：文件名与Public class类名一致
 * 编译：
 *      cd C:\JavaProject\demo01
 *          javac HelloWorld.java
 * 运行：
 *          java HelloWorld
 *
 */

/**
 * 基本语法
 * 编写 Java 程序时，应注意以下几点：
 *
 * 大小写敏感：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
 * 类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。
 * 方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
 * 源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）。
 * 主方法入口：所有的 Java 程序由 public static void main(String[] args) 方法开始执行
 */

public class A_background {
    public static void main(String[] args) {
        System.out.println("面向对象的三大特性：封装、继承、多态\n" +
                "Java的API文档：https://docs.oracle.com/javase/8/docs/api/index.html\n" +
                "");
    }

}
