import java.awt.*;

class Arith {
    public static void main(String args[]) {

        Frame f = new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLayout(null);
        
        

        Label l1 = new Label("Arithmetic Operation");
        l1.setBounds(100, 50, 200, 30);
        f.add(l1);

        Label l2 = new Label("Enter No 1:");
        l2.setBounds(50, 100, 100, 30);
        f.add(l2);

        TextField t1 = new TextField();
        t1.setBounds(160, 100, 150, 30);
        f.add(t1);

        Label l3 = new Label("Enter No 2:");
        l3.setBounds(50, 150, 100, 30);
        f.add(l3);

        TextField t2 = new TextField();
        t2.setBounds(160, 150, 150, 30);
        f.add(t2);

        Label l4 = new Label("Result:");
        l4.setBounds(50, 200, 100, 30);
        f.add(l4);

        TextField t3 = new TextField();
        t3.setBounds(160, 200, 150, 30);
        f.add(t3);

        Button b1 = new Button("Add");
        b1.setBounds(50, 260, 60, 30);
        f.add(b1);

        Button b2 = new Button("Sub");
        b2.setBounds(120, 260, 60, 30);
        f.add(b2);

        Button b3 = new Button("Mul");
        b3.setBounds(190, 260, 60, 30);
        f.add(b3);

        Button b4 = new Button("Div");
        b4.setBounds(260, 260, 60, 30);
        f.add(b4);
    }
}