import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[k + 1];
            for (int i = 1; i <= k; i++) {
                a[i] = sc.nextInt();
            }

            int[] b = new int[n];
            int[] cnt = new int[k + 2];

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
                cnt[b[i]]++;
            }

            boolean possible = true;

            // Check strict prefix condition
            int sumCnt = 0;
            int sumA = 0;

            for (int i = 1; i <= k; i++) {
                sumCnt += cnt[i];
                sumA += a[i];

                if (sumCnt >= sumA) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                System.out.println(-1);
                continue;
            }

            List<Integer> ops = new ArrayList<>();

            // Repeatedly move courses upward
            boolean changed = true;

            while (changed) {
                changed = false;

                for (int i = 0; i < n; i++) {
                    if (b[i] == k + 1) continue;

                    int cur = b[i];

                    // move if next level capacity remains valid
                    cnt[cur]--;
                    cnt[cur + 1]++;

                    if (cur + 1 <= k && cnt[cur + 1] > a[cur + 1]) {
                        // revert
                        cnt[cur]++;
                        cnt[cur + 1]--;
                    } else {
                        b[i]++;
                        ops.add(i + 1);
                        changed = true;
                    }
                }
            }

            boolean done = true;
            for (int i = 0; i < n; i++) {
                if (b[i] != k + 1) {
                    done = false;
                    break;
                }
            }

            if (!done || ops.size() > 1000) {
                System.out.println(-1);
            } else {
                System.out.println(ops.size());

                for (int i = 0; i < ops.size(); i++) {
                    if (i > 0) System.out.print(" ");
                    System.out.print(ops.get(i));
                }
                System.out.println();
            }
        }
    }
}

