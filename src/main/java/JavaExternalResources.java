import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JavaExternalResources {
    public static void main(String[] args) throws IOException {
        // low-level iterating over the resource to print lines to console
        try (InputStream inputStream = JavaExternalResources.class.getResourceAsStream("resource01.txt")) {
            assert inputStream != null;
            try (InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                 BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    System.out.println(line);
                }
            }
        }
    }
}
