// Display the bits within a byte.
class ShowBits {
    public static void main(String[] args) {
        byte val;

        val = 123;
        for (var t = 128; t > 0; t /= 2) {
            if ((val & t) != 0)
                System.out.print("1 ");
            else
                System.out.print("0 ");
        }
    }
}
