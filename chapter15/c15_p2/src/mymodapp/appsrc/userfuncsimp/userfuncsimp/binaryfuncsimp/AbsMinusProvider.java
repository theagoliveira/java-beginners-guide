// AbsPlus provides a concrete implementation of
// BinaryFunc. It returns the result of abs(a) + abs(b).
package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.*;

public class AbsMinusProvider implements BinFuncProvider {
    // Provide an AbsMinus object.
    public BinaryFunc get() {
        return new AbsMinus();
    }
}
