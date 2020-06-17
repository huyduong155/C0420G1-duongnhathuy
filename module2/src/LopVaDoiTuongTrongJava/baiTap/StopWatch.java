package LopVaDoiTuongTrongJava.baiTap;

public class StopWatch {
    long starTime,endTime;
    public StopWatch(){
        this.starTime=System.currentTimeMillis();
    }

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long start(){
        this.starTime=System.currentTimeMillis();
        return starTime;
    }
    public long stop(){
        this.endTime=System.currentTimeMillis();
        return endTime;
    }
    public long  getElapsedTime(){
        return this.endTime-this.starTime;
    }

    public void setStarTime(long starTime) {
        this.starTime = starTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public static void main(String[] args) {
        StopWatch stopWatch= new StopWatch();
        stopWatch.start();
        for (int i=0;i<100000;i++){
            System.out.println("hello");
        }
        stopWatch.stop();
        System.out.println(stopWatch.getElapsedTime());
    }
}
