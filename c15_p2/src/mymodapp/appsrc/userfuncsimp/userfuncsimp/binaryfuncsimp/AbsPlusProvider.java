// AbsPlus provides a concrete implementation of
// BinaryFunc. It returns the result of abs(a) + abs(b).
package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.*;

public class AbsPlusProvider implements BinFuncProvider {
    // Provide an AbsPlus object.
    public BinaryFunc get() {
        return new AbsPlus();
    }
}
