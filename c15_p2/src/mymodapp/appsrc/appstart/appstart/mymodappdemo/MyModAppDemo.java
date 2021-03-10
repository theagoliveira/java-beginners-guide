// Amodule-based application that demonstrates services
// and service providers.

package appstart.mymodappdemo;

import java.util.ServiceLoader;

import appfuncs.simplefuncs.SimpleMathFuncs;
import userfuncs.binaryfuncs.*;

public class MyModAppDemo {
    // First, use built-in functions as before.
    public static void main(String[] args) {
        if (SimpleMathFuncs.isFactor(2, 10))
            System.out.println("2 is a factor of 10");

        System.out.println(
                "Smallest factor common to both 35 and 105 is " + SimpleMathFuncs.lcf(35, 105));

        System.out.println(
                "Largest factor common to both 35 and 105 is " + SimpleMathFuncs.gcf(35, 105));

        // Now, use service-based, user-defined operations.

        // Get a service loaderfor binary functions.
        ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);

        BinaryFunc binOp = null;

        // Find the provider for absPlus and obtain the function.
        for (BinFuncProvider bfp : ldr) {
            if (bfp.get().getName().equals("absPlus")) {
                binOp = bfp.get();
                break;
            }
        }

        if (binOp != null)
            System.out.println("Result of absPlus function: " + binOp.func(12, -4));
        else
            System.out.println("absPlus function not found");

        binOp = null;

        // Find the provider for absPlus and obtain the function.
        for (BinFuncProvider bfp : ldr) {
            if (bfp.get().getName().equals("absMinus")) {
                binOp = bfp.get();
                break;
            }
        }

        if (binOp != null)
            System.out.println("Result of absMinus function: " + binOp.func(12, -4));
        else
            System.out.println("absMinus function not found");

    }
}
