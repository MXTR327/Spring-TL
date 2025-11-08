import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        int N = Integer.parseInt(br.readLine().trim());
        int[][] ratings = new int[N][2];

        for (int i = 0; i < N; i++) {
            String[] parts = br.readLine().trim().split(" ");
            ratings[i][0] = Integer.parseInt(parts[0]);
            ratings[i][1] = Integer.parseInt(parts[1]);
        }

        int out_ = solution(N, ratings);
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int solution(int N, int[][] ratings) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int[] pair : ratings) {
            int id = pair[0];
            countMap.put(id, countMap.getOrDefault(id, 0) + 1);
        }

        int maxCount = 0;
        int answer = -1;

        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int id = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount || (count == maxCount && id < answer)) {
                maxCount = count;
                answer = id;
            }
        }

        return answer;
    }
}
