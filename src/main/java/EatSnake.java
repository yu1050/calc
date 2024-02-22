import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EatSnake {

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int result = readInt();
        for (; ; ) {
            int current = readInt();
            if (result > current) {
                result += current;
            } else {
                System.out.println(result);
                System.exit(0);
            }
        }
    }

    public static int readInt() throws IOException {
        String input = bufferedReader.readLine();
        return Integer.parseInt(input);
    }
}
