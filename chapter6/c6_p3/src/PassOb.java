import java.io.Console;

// Objects can be passed to methods.
class Block {
    int a;
    int b;
    int c;
    int volume;

    Block(int i, int j, int k) {
        a = i;
        b = j;
        c = k;
        volume = a * b * c;
    }

    // Return true if ob defines same block.
    boolean sameBlock(Block ob) {
        return (ob.a == a) && (ob.b == b) && (ob.c == c);
    }

    // Return true if ob has same volume
    boolean sameVolume(Block ob) {
        return ob.volume == volume;
    }
}


class PassOb {
    public static void main(String[] args) {
        var ob1 = new Block(10, 2, 5);
        var ob2 = new Block(10, 2, 5);
        var ob3 = new Block(4, 5, 5);
        Console console = System.console();

        console.writer().println("ob1 same dimensions as ob2: " + ob1.sameBlock(ob2));
        console.writer().println("ob1 same dimensions as ob3: " + ob1.sameBlock(ob3));
        console.writer().println("ob1 same volume as ob3: " + ob1.sameVolume(ob3));
    }
}
