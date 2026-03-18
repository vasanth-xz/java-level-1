import java.awt.*;

class Placement
{
    public static void main(String args[])
    {
        Frame f = new Frame();

        f.setTitle("Registration Form");
        f.setSize(700,800);
        f.setVisible(true);
        f.setLayout(null);

        Label l1 = new Label("Placement Registration");
        f.add(l1);
        l1.setBounds(250,100,200,30);

        Label l2 = new Label("First Name");
        f.add(l2);
        l2.setBounds(100,200,200,30);

        TextField t1 = new TextField(30);
        f.add(t1);
        t1.setBounds(300,200,200,30);

        Label l3 = new Label("Last Name");
        f.add(l3);
        l3.setBounds(100,250,200,30);

        TextField t2 = new TextField(30);
        f.add(t2);
        t2.setBounds(300,250,200,30);

        Label l4 = new Label("Gender");
        f.add(l4);
        l4.setBounds(100,300,200,30);

        CheckboxGroup cg = new CheckboxGroup();

        Checkbox c1 = new Checkbox("Male", cg, true);
        Checkbox c2 = new Checkbox("Female", cg, false);
        Checkbox c3 = new Checkbox("Other", cg, false);

        f.add(c1);
        f.add(c2);
        f.add(c3);

        c1.setBounds(300,300,60,30);
        c2.setBounds(370,300,80,30);
        c3.setBounds(460,300,80,30);

        Label l5 = new Label("Date of Birth");
        f.add(l5);
        l5.setBounds(100,350,200,30);

        Choice month = new Choice();
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");
        f.add(month);
        month.setBounds(300,350,100,30);

        Choice day = new Choice();
        for(int i=1;i<=31;i++)
        {
            day.add(""+i);
        }
        f.add(day);
        day.setBounds(410,350,60,30);

        Choice year = new Choice();
        for(int i=2000;i<=2010;i++)
        {
            year.add(""+i);
        }
        f.add(year);
        year.setBounds(480,350,80,30);

        Label l6 = new Label("Location");
        f.add(l6);
        l6.setBounds(100,400,200,30);

        TextField t3 = new TextField(30);
        f.add(t3);
        t3.setBounds(300,400,200,30);

        Label l7 = new Label("Select your course:");
        f.add(l7);
        l7.setBounds(100,450,200,30);

        Checkbox cb1 = new Checkbox("BCA");
        Checkbox cb2 = new Checkbox("B.Sc AI & DS");

        f.add(cb1);
        f.add(cb2);

        cb1.setBounds(300,450,100,30);
        cb2.setBounds(420,450,120,30);

        Button b1 = new Button("Save");
        Button b2 = new Button("Cancel");

        f.add(b1);
        f.add(b2);

        b1.setBounds(300,520,80,30);
        b2.setBounds(400,520,80,30);
    }
}