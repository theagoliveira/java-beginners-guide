// This interface defines a function that takes two int
// arguments and return an int result. Thus, it can
// describe any binary operation on two ints that
// returns an int.

package userfuncs.binaryfuncs;

public interface BinaryFunc {
    // Obtain the name of the function.
    public String getName();

    // This is de function to perform. It will be
    // provided by specific implementations.
    public int func(int a, int b);
}
