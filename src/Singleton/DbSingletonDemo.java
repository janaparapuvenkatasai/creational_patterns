package Singleton;

public class DbSingletonDemo{
    public static void main ( String[] args ) {
        DbSingleton dbSingleton = DbSingleton.getInstance ();
        // DbSingleton testConstructor = new DbSingleton (); we can't create new constructor
        System.out.println (dbSingleton);

        DbSingleton anotherDbSingleton = DbSingleton.getInstance ();

        System.out.println (anotherDbSingleton);
    }
}
