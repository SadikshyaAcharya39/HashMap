public class JavaThreads extends Thread{
   public static void main(String[] args) {

       JavaThreads threads = new JavaThreads();
       threads.start();
       System.out.println("This code is outside of the thread");
   }

      public void run(){
        System.out.println(" This code is running in a thread...");
      }
}

