package test;

public class TestThread {

    public static void main(String args[]){

        Thread t1 = new Thread();
        System.out.println("The state of thread t1 after spawning it - " + t1.getState());
        t1.start();
        System.out.println("The state of thread t1 after spawning it - " + t1.getState());
        
        String s1 = new String("Mamatha");
        String s2= "Mamatha";
        System.out.println(s1==s2);


    }
}
