import java.awt.*;
class Login_Demo
{
public static void main(String arg[])
{
Frame f=new Frame();
f.setTitle("Login page");
f.setSize(500,500);
f.setVisible(true);

Label l1=new Label("User name");
f.add(l1);

TextField t1=new TextField(20);
f.add(t1);

Label l2=new Label("Password");
f.add(l2);

TextField t2=new TextField(20);
f.add(t2);

Button b1=new Button("Log in");
f.add(b1);

Button b2=new Button("log out");
f.add(b2); 
}

}