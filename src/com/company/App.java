package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class App extends JFrame {
    private JPanel Paneltotal;
    private JComboBox<Category> comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JTextField textField1;
    private JButton convertirButton;
    private JTextField textField2;
    private JButton button1;

    ArrayList<Category> categorises = new ArrayList<>();




    public App() {


        categorises.add(new Category(0,"Temperatura"));
        categorises.add(new Category(1,"Peso"));
        categorises.add(new Category(2,"Distancia"));

        categorises.get(0).Unidades.add(new Unidadesdemedida(0,"Celcius",));
        categorises.get(0).Unidades.add(new Unidadesdemedida(1,"Farenheit"));
        categorises.get(0).Unidades.add(new Unidadesdemedida(2,"Kelvin"));

        categorises.get(1).Unidades.add(new Unidadesdemedida(0,"Litros"));
        categorises.get(1).Unidades.add(new Unidadesdemedida(1,"Onzas"));
        categorises.get(1).Unidades.add(new Unidadesdemedida(2,"Mililitros"));

        categorises.get(2).Unidades.add(new Unidadesdemedida(0,"Metros"));
        categorises.get(2).Unidades.add(new Unidadesdemedida(1,"Pulgadas"));
        categorises.get(2).Unidades.add(new Unidadesdemedida(2,"Centimetros"));

        DefaultComboBoxModel<Category> Primerselect = new DefaultComboBoxModel<>();
        Primerselect.addAll(categorises);

        comboBox1.setModel(Primerselect);


        comboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange()== ItemEvent.SELECTED){
                    Category Select = (Category) comboBox1.getSelectedItem();
                    DefaultComboBoxModel Segundoselect = new DefaultComboBoxModel();
                    Segundoselect.addAll (Select.Unidades);
                    comboBox2.setModel(Segundoselect);
                    DefaultComboBoxModel Tercerselect = new DefaultComboBoxModel();
                    Tercerselect.addAll(Select.Unidades);
                    comboBox3.setModel(Tercerselect);

                }
            }
        });
        convertirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ( comboBox1.getSelectedItem() == ;)
            }
        });
    }
    public static void main(String[] args) {
        JFrame Apli = new JFrame("App");

        Apli.setContentPane(new App().Paneltotal);
        Apli.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Apli.pack();
        Apli.setVisible(true);
    }
    private void createUIComponents() {
        //
    }

}
