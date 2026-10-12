package mobility ;
public class HelloMobility {
    private String serviceName ;
    private String city ;
    // Constructeur
    public HelloMobility ( String serviceName , String city ) {
        this . serviceName = serviceName ;
        this . city = city ;
        } 

    // Methode d ’ instance
    public void greetUser ( String userName ) {
        System . out . println (
        " Bienvenue sur " + serviceName + " ( " + city + " ) , "+ userName + " ! ") ;
        }
    // Methode statique d ’ information
    public static void info () {
        System . out . println (" UPPA Mobility - Systeme de demonstration Java . ") ;
        }
}