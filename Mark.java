import java.awt.*;

class Mark
{
  public static void main(String args[])
  {
    Frame f = new Frame();
    f.setTitle("myapps");
    f.setSize(500,600);
    f.setLayout(null);
    f.setVisible(true);

    Label l1 = new Label("Student mark list");
    f.add(l1);
    l1.setBounds(100,50,200,30);

    Label l2 = new Label("Enter Enroll No");
    f.add(l2);
    l2.setBounds(50,100,100,30);
    TextField t1 = new TextField(30);
    f.add(t1);
    t1.setBounds(200,100,100,30);

    Label l3 = new Label("Name");
    f.add(l3);
    l3.setBounds(50,150,100,30);
    TextField t2 = new TextField(30);
    f.add(t2);
    t2.setBounds(200,150,100,30);

    Label l4 = new Label("Java Mark");
    f.add(l4);
    l4.setBounds(50,200,150,30);
    TextField t3 = new TextField(30);
    f.add(t3);
    t3.setBounds(200,200,100,30);

    Label l5 = new Label("OS Mark");
    f.add(l5);
    l5.setBounds(50,250,200,30);
    TextField t4 = new TextField(30);
    f.add(t4);
    t4.setBounds(200,250,100,30);

    Label l6 = new Label("CWD Mark");
    f.add(l6);
    l6.setBounds(50,300,200,30);
    TextField t5 = new TextField(30);
    f.add(t5);
    t5.setBounds(200,300,100,30);

    Label l7 = new Label("Total");
    f.add(l7);
    l7.setBounds(50,350,250,30);
    TextField t6 = new TextField(30);
    f.add(t6);
    t6.setBounds(200,350,100,30);

    Label l8 = new Label("Average");
    f.add(l8);
    l8.setBounds(50,400,100,30);
    TextField t7 = new TextField(30);
    f.add(t7);
    t7.setBounds(200,400,100,30);

    Button b1 = new Button("Save");
    f.add(b1);
    b1.setBounds(200,450,100,30);
  }
}