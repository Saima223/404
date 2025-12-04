package week1;

public class DataTypes {
    public static void main(String[] args) {
        byte b = 100;
        short s = 10000;
        int i = 500000;
        long l = 10000000000L;

        float f = 5.75f;
        double d = 19.99;

        char c = 'A';
        boolean bool = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
        
        //NonPrimitive : reference type 
        String str = "Hello Java";
        int[] arr = {1, 2, 3, 4};

        System.out.println("String: " + str);
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
