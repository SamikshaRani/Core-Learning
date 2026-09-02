import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {  
        fun(1, 2, 3, 4, 5);
        multiple(10, 20, "Hello", "World");
        demo(1, 2, 3);
        demo("Alice", "Bob", "Charlie");
    }

    static void demo(int ...var) {
        System.out.println(Arrays.toString(var));
    }

    static void demo(String ...var) {
        System.out.println(Arrays.toString(var));
    }

    static void multiple(int a, int b, String ...var) {
        System.out.println("a: " + a + ", b: " + b);
        System.out.println("var: " + Arrays.toString(var));
    }

    static void fun(int ...var) {
        System.out.println(Arrays.toString(var));
    }
}