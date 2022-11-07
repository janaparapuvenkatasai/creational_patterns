package Singleton;

public class DbSingleton{

    // private static DbSingleton instance = new DbSingleton (); // not thread safe. and eagerly loading

    // private static DbSingleton instance = null; // not thread safe. and lazy loading.

    private static volatile DbSingleton instance = null; // thread safe. and lazy loading.

    private DbSingleton() { // doesn't allow new instances to be created.
        if(instance != null) { // protected it from instantiating from reflection
            throw new RuntimeException ("use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance ( ) { // always gives the same object instance.

        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton ();
                }

            }

        }
        return instance;
    }
}
