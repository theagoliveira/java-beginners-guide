/*
// Module definition for the functions module
module appfuncs {
    // Exports the package appfuncs.simplefuncs.
    exports appfuncs.simplefuncs;
}
 */

// Module definition that uses a to clause.
module appfuncs {
    // Exports the package appfuncs.simplefuncs to appstart.
    exports appfuncs.simplefuncs to appstart;
}
