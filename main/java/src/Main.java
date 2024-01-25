public class Main {
    public static void main(String[] args) throws InterruptedException{
        //create tasks with different delays (30 seconds in general but shorter delay for slack)
        Runnable facebookTask = new UsageMonitorTask("Facebook", 3000);
        Runnable youtubeTask = new UsageMonitorTask("YouTube", 3000);
        Runnable whatsappTask = new UsageMonitorTask("WhatsApp", 3000);
        Runnable slackTask = new UsageMonitorTask("Slack", 1000); // shorter time delay for slack: means more frequently

        //create threads for the tasks
        Thread facebookThread = new Thread(facebookTask);
        Thread youtubeThread = new Thread(youtubeTask);
        Thread whatsappThread = new Thread(whatsappTask);
        Thread slackThread = new Thread(slackTask);

        // start the threads
        facebookThread.start();
        youtubeThread.start();
        whatsappThread.start();
        slackThread.start();

        // let the tasks run for a certain amount of time
        Thread.sleep(30000); //30 seconds



        //interrupt the tasks, simulate a shutdown
        facebookThread.interrupt();
        youtubeThread.interrupt();
        whatsappThread.interrupt();
        slackThread.interrupt();

        //wait for all threads to finish
        facebookThread.join();
        youtubeThread.join();
        whatsappThread.join();
        slackThread.join();

        // all tasks are done
        System.out.println("Internet usage monitoring tasks have been completed.");



    }
}
