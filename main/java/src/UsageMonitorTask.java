public class UsageMonitorTask implements Runnable{

    // attributes
    private String appName;
    private int delay;

    // constructor
    public UsageMonitorTask (String appName, int delay){
        this.appName = appName;
        this.delay = delay;
    }

    @Override
    public void run(){
        while(!Thread.interrupted()){
            System.out.println("Monitoring internet usage for: " + appName);

            try{
                Thread.sleep(delay); // simulate monitoriing by 'sleep'
            }catch(InterruptedException e){
                System.out.println(appName + " monitoring interrupted.");
                break;
            }

        }

        }





}
