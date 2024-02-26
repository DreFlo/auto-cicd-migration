package cli.utils;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

public class JavaUtils {
    public static InputStream getResourceAsStream(String path) {
        return JavaUtils.class.getClassLoader().getResourceAsStream(path);
    }

    public static String getRandomName() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        return random.ints(leftLimit, rightLimit + 1)
                .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static void cleanUp() {
        System.out.println("Cleaning up...");
        // Delete .xmi and .xmi.out files
        try {
            Files.walk(Path.of("."))
                    .filter(Files::isRegularFile)
                    .filter(p -> p.toString().endsWith(".xmi") || p.toString().endsWith(".xmi.out"))
                    .forEach(p -> {
                        try {
                            Files.delete(p);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
