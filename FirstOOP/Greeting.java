package FirstOOP;
/** The class is created to greet users, Note: Syntax Javadoc*/
public class Greeting {

    public String text;
    /**
     * Class "Greeting" greet the users
     * Method "Greet" returns only a string value
     * @param name User name
     * @return  User's greeting text
     */
    public String Greet(String name) {
        return String.format("%s %s",text, name); //return - exist the method and return value
    }

}
