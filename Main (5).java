/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();
            int n = s.length();

            int[] count = new int[26];

            // Left half
            for (int i = 0; i < n / 2; i++) {
                count[s.charAt(i) - 'a']++;
            }

            // Right half
            for (int i = (n + 1) / 2; i < n; i++) {
                count[s.charAt(i) - 'a']--;
            }

            boolean ok = true;

            for (int x : count) {
                if (x != 0) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
