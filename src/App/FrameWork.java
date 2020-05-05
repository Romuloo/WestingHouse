package App;

import domain.Algoritmos;
import domain.data.Habilidad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameWork {

    private static JFrame f = new JFrame();
    private static Font font = new Font("Calibri", Font.BOLD, 15);

    private static JLabel l1 = new JLabel("Tareas");
    private static JLabel l2 = new JLabel("Habilidad");
    private static JLabel l3 = new JLabel("Esfuerzo");
    private static JLabel l4 = new JLabel("Condiciones");
    private static JLabel l5 = new JLabel("Consistencia");
    private static JLabel l7 = new JLabel("A");
    private static JLabel l8 = new JLabel("B");
    private static JLabel l9 = new JLabel("C");
    private static JLabel l10 = new JLabel("D");
    private static JLabel l12 = new JLabel("M1");
    private static JLabel l13 = new JLabel("M2");
    private static JLabel l14 = new JLabel("M3");
    private static JLabel l15 = new JLabel("M4");
    private static JLabel l16 = new JLabel("Calificaciones");
    private static JLabel l17 = new JLabel("A");
    private static JLabel l18 = new JLabel("B");
    private static JLabel l19 = new JLabel("C");
    private static JLabel l20 = new JLabel("D");


    private static JTextField a1 = new JTextField();
    private static JTextField a2 = new JTextField();
    private static JTextField a3 = new JTextField();
    private static JTextField a4 = new JTextField();

    private static JTextField b1 = new JTextField();
    private static JTextField b2 = new JTextField();
    private static JTextField b3 = new JTextField();
    private static JTextField b4 = new JTextField();

    private static JTextField c1 = new JTextField();
    private static JTextField c2 = new JTextField();
    private static JTextField c3 = new JTextField();
    private static JTextField c4 = new JTextField();

    private static JTextField d1 = new JTextField();
    private static JTextField d2 = new JTextField();
    private static JTextField d3 = new JTextField();
    private static JTextField d4 = new JTextField();

    private static JTextField m11 = new JTextField();
    private static JTextField m12 = new JTextField();
    private static JTextField m13 = new JTextField();
    private static JTextField m14 = new JTextField();

    private static JTextField m21 = new JTextField();
    private static JTextField m22 = new JTextField();
    private static JTextField m23 = new JTextField();
    private static JTextField m24 = new JTextField();

    private static JTextField m31 = new JTextField();
    private static JTextField m32 = new JTextField();
    private static JTextField m33 = new JTextField();
    private static JTextField m34 = new JTextField();

    private static JTextField m41 = new JTextField();
    private static JTextField m42 = new JTextField();
    private static JTextField m43 = new JTextField();
    private static JTextField m44 = new JTextField();

    private static JTextField sa = new JTextField();
    private static JTextField sb = new JTextField();
    private static JTextField sc = new JTextField();
    private static JTextField sd = new JTextField();



    private static JButton b = new JButton("Resolver");


    private static String A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4, D1, D2, D3, D4;
    private static double M11, M12, M13, M14, M21, M22, M23, M24, M31, M32, M33, M34, M41, M42, M43, M44;

    public static void begin(){


        f.setTitle("Metodo WestingHouse");
        f.setBackground(new Color(39, 156, 207));
        f.setSize(((1500/3)*2)+100,(1061/3)*2+50);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);


      initComponentes();


    }

    private static void initComponentes(){
        f.add(l1);f.add(l2); f.add(l3); f.add(l4);f.add(l5);;f.add(l7);f.add(l8);f.add(l9);f.add(l10);
        f.add(l12);f.add(l13);f.add(l14);f.add(l15);f.add(l16);f.add(l17);f.add(l18);f.add(l19);f.add(l20);

        f.add(a1);f.add(a2);f.add(a3);f.add(a4);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(c1);f.add(c2);f.add(c3);f.add(c4);
        f.add(d1);f.add(d2);f.add(d3);f.add(d4);f.add(m11);f.add(m12);f.add(m13);f.add(m14);f.add(m21);f.add(m22);f.add(m23);f.add(m24);
        f.add(m31);f.add(m32);f.add(m33);f.add(m34);f.add(m41);f.add(m42);f.add(m43);f.add(m44);
        f.add(sa);f.add(sb);f.add(sc);f.add(sd);

        l1.setBounds(30, 30, 100,50);
        l1.setFont(font);

        l2.setBounds(30+100, 30, 100,50);
        l2.setFont(font);

        l3.setBounds(30+200, 30, 100,50);
        l3.setFont(font);

        l4.setBounds(30+290, 30, 100,50);
        l4.setFont(font);

        l5.setBounds(30+405, 30, 100,50);
        l5.setFont(font);


        l7.setBounds(30, 30+50, 100,50);
        l7.setFont(font);

        l8.setBounds(30, 30+100, 100,50);
        l8.setFont(font);

        l9.setBounds(30, 30+150, 100,50);
        l9.setFont(font);

        l10.setBounds(30, 30+200, 100,50);
        l10.setFont(font);

        l12.setBounds(30+405+100+40, 30, 100,50);
        l12.setFont(font);

        l13.setBounds(30+405+200+40, 30, 100,50);
        l13.setFont(font);

        l14.setBounds(30+405+300+40, 30, 100,50);
        l14.setFont(font);

        l15.setBounds(30+405+400+40, 30, 100,50);
        l15.setFont(font);


        a1.setBounds(30+100, 30+50, 40,50);
        a2.setBounds(30+200, 30+50, 40,50);
        a3.setBounds(30+300, 30+50, 40,50);
        a4.setBounds(30+405, 30+50, 40,50);

        b1.setBounds(30+100, 30+50+50, 40,50);
        b2.setBounds(30+200, 30+50+50, 40,50);
        b3.setBounds(30+300, 30+50+50, 40,50);
        b4.setBounds(30+405, 30+50+50, 40,50);

        c1.setBounds(30+100, 30+50+100, 40,50);
        c2.setBounds(30+200, 30+50+100, 40,50);
        c3.setBounds(30+300, 30+50+100, 40,50);
        c4.setBounds(30+405, 30+50+100, 40,50);

        d1.setBounds(30+100, 30+50+150, 40,50);
        d2.setBounds(30+200, 30+50+150, 40,50);
        d3.setBounds(30+300, 30+50+150, 40,50);
        d4.setBounds(30+405, 30+50+150, 40,50);

        m11.setBounds(30+405+100+40, 30+50, 40,50);
        m12.setBounds(30+405+100+40, 30+100, 40,50);
        m13.setBounds(30+405+100+40, 30+150, 40,50);
        m14.setBounds(30+405+100+40, 30+200, 40,50);

        m21.setBounds(30+405+200+40, 30+50, 40,50);
        m22.setBounds(30+405+200+40, 30+100, 40,50);
        m23.setBounds(30+405+200+40, 30+150, 40,50);
        m24.setBounds(30+405+200+40, 30+200, 40,50);

        m31.setBounds(30+405+300+40, 30+50, 40,50);
        m32.setBounds(30+405+300+40, 30+100, 40,50);
        m33.setBounds(30+405+300+40, 30+150, 40,50);
        m34.setBounds(30+405+300+40, 30+200, 40,50);

        m41.setBounds(30+405+400+40, 30+50, 40,50);
        m42.setBounds(30+405+400+40, 30+100, 40,50);
        m43.setBounds(30+405+400+40, 30+150, 40,50);
        m44.setBounds(30+405+400+40, 30+200, 40,50);

        l16.setBounds(470, 300, 140,50);
        l16.setFont(font);

        l17.setBounds(130, 360, 50, 50);
        l17.setFont(font);
        l18.setBounds(320, 360, 50, 50);
        l18.setFont(font);
        l19.setBounds(675, 360, 50, 50);
        l19.setFont(font);
        l20.setBounds(875, 360, 50, 50);
        l20.setFont(font);

        sa.setBounds(160, 360, 80, 50);
        sb.setBounds(350, 360, 80, 50);
        sc.setBounds(705, 360, 80, 50);
        sd.setBounds(905, 360, 80, 50);


        f.add(b);
        b.setBounds(945, 130, 100,100);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A1= a1.getText(); A2= a2.getText(); A3= a3.getText(); A4= a4.getText();  B1= b1.getText();  B2= b2.getText();  B3= b3.getText();
                B4= b4.getText(); C1= c1.getText(); C2= c2.getText(); C3= c3.getText();  C4= c4.getText();  D1= d1.getText();  D2= d2.getText();
                D3= d3.getText(); D4= d4.getText();


                try {
                    M11 = Double.parseDouble(m11.getText());
                    M21 = Double.parseDouble(m21.getText());
                    M31 = Double.parseDouble(m31.getText());
                    M41 = Double.parseDouble(m41.getText());

                    M12 = Double.parseDouble(m12.getText());
                    M22 = Double.parseDouble(m22.getText());
                    M32 = Double.parseDouble(m32.getText());
                    M42 = Double.parseDouble(m42.getText());

                    M13 = Double.parseDouble(m13.getText());
                    M23 = Double.parseDouble(m23.getText());
                    M33 = Double.parseDouble(m33.getText());
                    M43 = Double.parseDouble(m43.getText());

                    M14 = Double.parseDouble(m14.getText());
                    M24 = Double.parseDouble(m24.getText());
                    M34 = Double.parseDouble(m34.getText());
                    M44 = Double.parseDouble(m44.getText());
                    
                }catch (Exception ex){
                    System.out.println("No ha inicializado todos los espacios");
                }

                sa.setText("" + Algoritmos.calificaciones(A1, A2, A3, A4));
                sb.setText("" + Algoritmos.calificaciones(B1, B2, B3, B4));
                sc.setText("" + Algoritmos.calificaciones(C1, C2, C3, C4));
                sd.setText("" + Algoritmos.calificaciones(D1, D2, D3, D4));



            }
        });
    }


}
