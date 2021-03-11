/*
 * 6. Write a recursive method that displays the contents of a string backwards.
 */
class Backwards {
    String s;
    int length;

    Backwards(String str) {
        s = str;
        length = str.length();
    }

    void printBackwards(int end) {
        if (end == -1) {
            System.out.println();
            return;
        }
        System.out.print(s.charAt(end));
        printBackwards(end - 1);
    }
}


class RecBackPrint {
    public static void main(String[] args) {
        var str1 = "thiago";
        var str2 = new Backwards("oliveira");

        printBackwards(str1, str1.length() - 1);
        str2.printBackwards(str2.length - 1);
    }

    static void printBackwards(String s, int end) {
        if (end == -1) {
            System.out.println();
            return;
        }
        System.out.print(s.charAt(end));
        printBackwards(s, end - 1);
    }
}
