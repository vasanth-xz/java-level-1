import java.awt.*;

class Radio_Demo
{
    public static void main(String args[])
    {
        Frame f = new Frame();
        f.setTitle("Radio Button");
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(new FlowLayout());

        Label l1 = new Label("Gender");
        f.add(l1);

        CheckboxGroup cg = new CheckboxGroup();

        Checkbox c1 = new Checkbox("Male", cg, true);
        Checkbox c2 = new Checkbox("Female", cg, false);
        Checkbox c3 = new Checkbox("Others", cg, false);

        f.add(c1);
        f.add(c2);
        f.add(c3);

        
    }
}