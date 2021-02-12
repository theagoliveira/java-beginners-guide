// Use XOR to encode and decode a message.
class Encode {
    public static void main(String[] args) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int key = 87;

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the mesage
        for (int i = 0; i < msg.length(); i++)
            encmsg += (char) (msg.charAt(i) ^ key);

        System.out.print("Encoded message: ");
        System.out.println(encmsg);

        // decode the mesage
        for (int i = 0; i < msg.length(); i++)
            decmsg += (char) (encmsg.charAt(i) ^ key);

        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }
}
