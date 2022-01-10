package Encapsulation;

public class LoginCredentials
{
    private String Username;
    private String Password;

    //getter and setter for Username
    public String getUsername()
    {
        return Username;
    }

    public void setUsername(String username)
    {
        Username = username;
    }

    //getter and setter for Password
    public String getPassword()
    {
        return Password;
    }

    public void setPassword(String password)
    {
        Password = password;
    }

    public static void main(String[] args)
    {
        LoginCredentials L = new LoginCredentials();
        L.setUsername("vinaymuralidhar1991@gmail.com");
        L.setPassword("Welcome@123");
        System.out.println("username is:"+L.getUsername());
        System.out.println("password is:"+L.getPassword());
    }
}
