package com.example.awtSample;

import java.awt.*;                      // import public interfaces and static objects
import java.awt.event.WindowAdapter;    // java.awt.event is a different package
import java.awt.event.WindowEvent;


public class MyWindow extends Frame {


    public MyWindow(String title) {
        super(title);
        setSize(500,140);



        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }


    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        Font sansSerifLarge = new Font("SansSerif", Font.BOLD, 18);
        Font sansSerifSmall = new Font("SansSerif", Font.BOLD, 12);
        graphics.setFont(sansSerifLarge);
        graphics.drawString("Te iubesc", 60, 60);
        graphics.setFont(sansSerifSmall);
        graphics.drawString("Ruxandra", 60, 100);
    }



    @Override
    public void setBackground(Color color) {
        Color color1 = new Color(0xEE1E27);
        super.setBackground(color1);
    }

}
