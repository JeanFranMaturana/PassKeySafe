package ca.neogalaxystudio.passkeysafe.Core;

public class PassKeySafeCore {
    private static final PassKeySafeCore ourInstance = new PassKeySafeCore();

    public static PassKeySafeCore getInstance() {
        return ourInstance;
    }

    private PassKeySafeCore() {
    }
}
