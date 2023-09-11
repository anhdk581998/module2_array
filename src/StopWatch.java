public class StopWatch {
    private long startTime;
    private long stopTime;
    private boolean running;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - this.startTime);
        } else {
            elapsed = (this.stopTime - this.startTime);
        }
        return elapsed;
    }
}
