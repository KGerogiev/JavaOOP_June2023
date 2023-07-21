package lab;



import lab.Anotation.Author;
import lab.Anotation.Subject;

import java.io.Serializable;
@Subject(categories = {"Test", "Annotation"})
public class Reflection implements Serializable {

    private static final String nickName = "Pinguin";
    public String name;
    protected String webAddress;
    String email;
    private int zip;

    public Reflection() {
        this.setName("Java");
        this.setWebAddress("oracle.com");
        this.setEmail("mail@oracle.com");
        this.setZip(1407);
    }

    private Reflection(String name, String webAddress, String email) {
        this.setName(name);
        this.setWebAddress(webAddress);
        this.setEmail(email);
        this.setZip(2300);
    }

    protected Reflection(String name, String webAddress, String email, int zip) {
        this.setName(name);
        this.setWebAddress(webAddress);
        this.setEmail(email);
        this.setZip(2300);
    }
    @Author(name = "Georgi")
    public final String getName() {
        return name;
    }
    @Author(name = "Peter")
    private void setName(String name) {
        this.name = name;
    }
    @Author(name = "Georgi")
    protected String getWebAddress() {
        return webAddress;
    }
    @Author(name = "Peter")
    private void setWebAddress(String webAddress) {
        this.webAddress = webAddress;
    }
    @Author(name = "Georgi")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    @Author(name = "Georgi")
    protected final int getZip() {
        return zip;
    }
    @Author(name = "Peter")
    private void setZip(int zip) {
        this.zip = zip;
    }

    public String toString() {
        String result = "Name: " + getName() + "\n";
        result += "WebAddress: " + getWebAddress() + "\n";
        result += "email: " + getEmail() + "\n";
        result += "zip: " + getZip() + "\n";
        return result;
    }
}
