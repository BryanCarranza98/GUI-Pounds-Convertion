package gui;

import domain.WeightConverter;
import domain.WeightException;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel
        extends JPanel
        implements ActionListener
{

    private JLabel lblInputweight;
    private JTextField txtInputweight;
    private JLabel lblOutput;
    private JButton btnSubmit;


    public MyPanel()
    {

        lblInputweight = new JLabel("Enter Weight in pounds: ");
        txtInputweight = new JTextField(20);

        lblOutput = new JLabel("(output appears here..)");
        btnSubmit = new JButton("Convert");

        btnSubmit.addActionListener(this);
        btnSubmit.setActionCommand("convert");


        //default layout manager for PANEL is the FLOW LAYOUT

        this.add(lblInputweight);
        add(txtInputweight);
        this.add(btnSubmit);
        add(lblOutput);


    }


    @Override
    public void actionPerformed(ActionEvent e) // configuartion will come here
    {


        try
        {
            double inputWeight = Double.parseDouble(txtInputweight.getText()); // passing the string to get a double
            WeightConverter olathe = new WeightConverter(inputWeight);
            lblOutput.setText(olathe.toString());

        }
        catch(WeightException | NumberFormatException tex)
        {
            lblOutput.setText(String.valueOf(tex));

        } catch(Exception ex)
        {

            lblOutput.setText(ex.getMessage());


        }


    }



}
