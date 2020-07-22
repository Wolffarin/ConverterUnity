package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

public class App {
    private JPanel principal;
    private JComboBox cmb1;
    private JComboBox cmb2;
    private JComboBox cmb3;
    private JButton button;
    private JTextField txt;
    private JTextField txt2;
    private ArrayList<UNIDAD> UNIDADS = new ArrayList<>();


    public App(){
        UNIDADS.add(new UNIDAD("Peso",1));
        UNIDADS.add(new UNIDAD("Distancia",2));
        UNIDADS.add(new UNIDAD("Temperatura",3));

        UNIDADS.get(0).conversiones.add(new Operacion("Onzas",28.35f,0));
        UNIDADS.get(0).conversiones.add(new Operacion("Mililitros",1f,0));
        UNIDADS.get(0).conversiones.add(new Operacion("Miligramos",0.001f,0));
        UNIDADS.get(0).conversiones.add(new Operacion("Gramos",1f,0));
        UNIDADS.get(0).conversiones.add(new Operacion("Kilogramos",1000f,0));

        UNIDADS.get(1).conversiones.add(new Operacion("Metros",1f,0));
        UNIDADS.get(1).conversiones.add(new Operacion("Pulgadas",1/39.37f,0));
        UNIDADS.get(1).conversiones.add(new Operacion("Kilometro",100f,0));

        UNIDADS.get(2).conversiones.add(new Operacion("Celsius",9/5f,1));
        UNIDADS.get(2).conversiones.add(new Operacion("Farenheit",5/9f,2));
        UNIDADS.get(2).conversiones.add(new Operacion("Kelvin",-273.15f,3));

        UNIDADS.get(0).conversiones.get(0).conversiones2.add(new TRANSFORMACION("Mililitros",1f,0));
        UNIDADS.get(0).conversiones.get(0).conversiones2.add(new TRANSFORMACION("Miligramos",1000f,0));
        UNIDADS.get(0).conversiones.get(0).conversiones2.add(new TRANSFORMACION("Gramos",1f,0));
        UNIDADS.get(0).conversiones.get(0).conversiones2.add(new TRANSFORMACION("Kilogramos",0.001f,0));

        UNIDADS.get(0).conversiones.get(1).conversiones2.add(new TRANSFORMACION("Onzas",1/28.3495f,0));
        UNIDADS.get(0).conversiones.get(1).conversiones2.add(new TRANSFORMACION("Miligramos",1000f,0));
        UNIDADS.get(0).conversiones.get(1).conversiones2.add(new TRANSFORMACION("Gramos",1f,0));
        UNIDADS.get(0).conversiones.get(1).conversiones2.add(new TRANSFORMACION("Kilogramos",0.001f,0));

        UNIDADS.get(0).conversiones.get(2).conversiones2.add(new TRANSFORMACION("Mililitros",1f,0));
        UNIDADS.get(0).conversiones.get(2).conversiones2.add(new TRANSFORMACION("Onzas",1/28.3495f,0));
        UNIDADS.get(0).conversiones.get(2).conversiones2.add(new TRANSFORMACION("Gramos",1f,0));
        UNIDADS.get(0).conversiones.get(2).conversiones2.add(new TRANSFORMACION("Kilogramos",0.001f,0));

        UNIDADS.get(0).conversiones.get(3).conversiones2.add(new TRANSFORMACION("Mililitros",1f,0));
        UNIDADS.get(0).conversiones.get(3).conversiones2.add(new TRANSFORMACION("Onzas",1/28.3495f,0));
        UNIDADS.get(0).conversiones.get(3).conversiones2.add(new TRANSFORMACION("Miligramos",1000f,0));
        UNIDADS.get(0).conversiones.get(3).conversiones2.add(new TRANSFORMACION("Kilogramos",0.001f,0));

        UNIDADS.get(0).conversiones.get(4).conversiones2.add(new TRANSFORMACION("Mililitros",1f,0));
        UNIDADS.get(0).conversiones.get(4).conversiones2.add(new TRANSFORMACION("Onzas",1/28.3495f,0));
        UNIDADS.get(0).conversiones.get(4).conversiones2.add(new TRANSFORMACION("Miligramos",1000f,0));
        UNIDADS.get(0).conversiones.get(4).conversiones2.add(new TRANSFORMACION("Gramos",1f,0));


        UNIDADS.get(1).conversiones.get(0).conversiones2.add(new TRANSFORMACION("Pulgadas",39.37f,0));
        UNIDADS.get(1).conversiones.get(0).conversiones2.add(new TRANSFORMACION("Kilometro",0.001f,0));

        UNIDADS.get(1).conversiones.get(1).conversiones2.add(new TRANSFORMACION("Metros",1f,0));
        UNIDADS.get(1).conversiones.get(1).conversiones2.add(new TRANSFORMACION("Kilometro",0.001f,0));

        UNIDADS.get(1).conversiones.get(2).conversiones2.add(new TRANSFORMACION("Metros",1f,0));
        UNIDADS.get(1).conversiones.get(2).conversiones2.add(new TRANSFORMACION("Pulgadas",39.37f,0));

        UNIDADS.get(2).conversiones.get(0).conversiones2.add(new TRANSFORMACION("Farenheit",32f,1));
        UNIDADS.get(2).conversiones.get(0).conversiones2.add(new TRANSFORMACION("Kelvin",273.15f,2));

        UNIDADS.get(2).conversiones.get(1).conversiones2.add(new TRANSFORMACION("Celsius",-32f,1));
        UNIDADS.get(2).conversiones.get(1).conversiones2.add(new TRANSFORMACION("Kelvin",273.15f,2));

        UNIDADS.get(2).conversiones.get(2).conversiones2.add(new TRANSFORMACION("Celsius",-32f,1));
        UNIDADS.get(2).conversiones.get(2).conversiones2.add(new TRANSFORMACION("Farenheit",32f,2));


        DefaultComboBoxModel cmbx1 = new DefaultComboBoxModel();
        cmbx1.addAll(UNIDADS);
        cmb1.setModel(cmbx1);

        cmb1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getStateChange() == itemEvent.SELECTED){
                    UNIDAD seleccion = (UNIDAD) cmb1.getSelectedItem();
                    DefaultComboBoxModel cmbx2 = new DefaultComboBoxModel();
                    cmbx2.addAll(seleccion.conversiones);
                    cmb2.setModel(cmbx2);
                }
            }
        });
        cmb2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent itemEvent) {
                if(itemEvent.getStateChange() == itemEvent.SELECTED){
                    Operacion seleccion2 = (Operacion) cmb2.getSelectedItem();
                    DefaultComboBoxModel cmbx3 = new DefaultComboBoxModel();
                    cmbx3.addAll(seleccion2.conversiones2);
                    cmb3.setModel(cmbx3);
                }
            }
        });
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(cmb3.getSelectedItem() != null){
                    Operacion seleccion2 = (Operacion) cmb2.getSelectedItem();
                    TRANSFORMACION seleccion3 = (TRANSFORMACION) cmb3.getSelectedItem();
                    UNIDAD seleccion = (UNIDAD) cmb1.getSelectedItem();
                    float conv = seleccion2.num;
                    float suma = seleccion3.sum;
                    if (txt.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"Porfavor introduzca un número.");
                        return;
                    }
                    float valorfinal = 0f;
                    try{ float valor = Float.parseFloat(txt.getText());
                        int idx = seleccion2.idx;
                        if(seleccion.idx == 3) {
                            switch(idx){
                                case 1:if(seleccion3.idx == 1) {valorfinal= (valor*conv) + suma;}else{valorfinal= valor+suma;}break;
                                case 2:valorfinal = (valor - 32)*conv; if(seleccion3.idx == 2){valorfinal = valorfinal + suma; }break;
                                case 3:valorfinal=valor - 273.15f;if(seleccion3.idx ==2){valorfinal=(valorfinal-suma)*conv;}
                            }
                        }else {valorfinal = valor * conv * suma;}
                        txt2.setText(Float.toString(valorfinal));
                    }catch (Exception e){
                            JOptionPane.showMessageDialog(null, "Valor inválido.");
                    }
                }
            }
        });
    }
    public static void main(String[] args) {
        JFrame app = new JFrame();
        app.setContentPane(new App().principal);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.pack();
        app.setVisible(true);
    }
}