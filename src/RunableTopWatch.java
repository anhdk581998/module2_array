public class RunableTopWatch {
    public static void main(String[] args) {
        System.out.println("thoi gian hien tai la");
        long currentTime = System.currentTimeMillis();
        System.out.println(currentTime);
        StopWatch sw = new StopWatch();
        sw.start();
// Thực hiện một số công việc
//        sw.stop();
        System.out.println("Thời gian đã trôi qua: " + sw.getElapsedTime() + " ms");
    }
}
