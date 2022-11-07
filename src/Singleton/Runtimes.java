package Singleton;

public class Runtimes{
    public static void main ( String[] args ) {
        Runtime singletonRuntime = Runtime.getRuntime(); // get runtime is single ton here it always gives the same object instance
        singletonRuntime.gc ();
        System.out.println (singletonRuntime);

        Runtime anotherRuntime = Runtime.getRuntime ();
        anotherRuntime.gc ();
        System.out.println (anotherRuntime);

        if(singletonRuntime == anotherRuntime){
            System.out.println ("same");
        }
    }
}
