package cli.utils;

import java.io.InputStream;

public class JavaUtils {
    public static InputStream getResourceAsStream(String path) {
        return JavaUtils.class.getClassLoader().getResourceAsStream(path);
    }
}
