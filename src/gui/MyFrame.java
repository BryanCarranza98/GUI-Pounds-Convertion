package gui;

import javax.swing.*;

public class MyFrame extends JFrame
{
    private MyPanel pnlTemp;

    public MyFrame()
    {

        pnlTemp = new MyPanel();


        this.add(pnlTemp);
    }

}
