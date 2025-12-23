

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getKCount' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER s as parameter.
     */

    public static long getKCount(long s) {
        long count = 0;

        // iterate over all divisors up to sqrt(s)
        for (long d = 1; d * d <= s; d++) {
            if (s % d == 0) {
                long other = s / d;

                // if d is a divisor and odd, it corresponds to one representation
                if ((d & 1L) == 1L) {
                    count++;
                }

                // check the paired divisor (other) if it's different and odd
                if (other != d && (other & 1L) == 1L) {
                    count++;
                }
            }
        }

        return count;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        long s = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.getKCount(s);
        System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        bufferedReader.close();
        //bufferedWriter.close();
    }
}