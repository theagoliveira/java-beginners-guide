interface StringFunc {
    String func(String str);
}


public class LambdaArgumentDemo {
    // This method has a functional interface as the type of its
    // first parameter. Thus, it can be passed a reference to any
    // instance of that interface, including an instance created
    // by a lambda expression. The second parameter specifies the
    // string to operate on.
    static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda Expressions Expand Java";
        String outStr;

        System.out.println("Here is input string: " + inStr);

        // Define a lambda expression that reverses the contents
        // of a string and assign it to a String Func reference variable.
        StringFunc removeSpaces = (str) -> {
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ')
                    result += str.charAt(i);
            }

            return result;
        };

        outStr = changeStr(removeSpaces, inStr);
        System.out.println("The string with spaces removed: " + outStr);
    }
}
