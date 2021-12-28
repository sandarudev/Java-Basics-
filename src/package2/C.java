package package2;
import package1.*;

public class C {
    public String publicMessage = "This is a public message!"; // This is accessible anywhere
    protected String protectedMessage = "This is a protected message!"; //If there is extend from subclass this is accessible
            String defaultMessage = "This is a default message!"; // This is accessible within class and package
    private String privateMessage = "This is a private message!"; // This is only accessible within this class
}
