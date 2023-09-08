import java.util.Date;

public class StopWatch {
    public long startTime;
    public long endTime;
    public StopWatch() {
        this.startTime = new Date().getTime();
    }
    public void start() {
        this.startTime = new Date().getTime();
    }
    public void stop() {
        this.endTime = new Date().getTime();
    }
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}
class Main5 {
    static void sort(int arr[], StopWatch stop) {
        int n = arr.length;
        stop.start();
        // Duyệt qua từng phần tử của mảng
        for (int i = 0; i < n - 1; i++) {
            // Tìm phần tử nhỏ nhất trong mảng chưa được sắp xếp
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            // Hoán đổi phần tử nhỏ nhất và phần tử đầu tiên
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
        stop.stop();
    }
    public static void main(String[] args) {
        StopWatch stop1 = new StopWatch();
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 9999 + 1;
            arr[i] = (int) randomDouble;
        }
        sort(arr, stop1);
        System.out.println(" Máy của bạn đã tốn : " + stop1.getElapsedTime() + " ms");
    }
}
