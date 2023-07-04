package InterfazGrafica;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import Logica.conversionTemperatura;

public class temperaturaConversionVentana extends conversionTemperatura {

    public void crearVentanaTemperatura() {
        JFrame ventana = new JFrame("Conversor de Temperaturas");
        ventana.setSize(500, 300);

        JButton okBtn = new JButton("Ok");
        JButton cancelBtn = new JButton("Cancel");

        GridBagConstraints gbcOk = new GridBagConstraints();
        gbcOk.gridx = 0; // Columna 0
        gbcOk.gridy = 2; // Fila 0
        gbcOk.insets = new Insets(10, 10, 10, 10); // Margen
        gbcOk.gridwidth = 1;
        gbcOk.anchor = GridBagConstraints.CENTER; // Centrado horizontal

        GridBagConstraints gbcCancel = new GridBagConstraints();
        gbcCancel.gridx = 1; // Columna 0
        gbcCancel.gridy = 2; // Fila 0
        gbcCancel.insets = new Insets(10, 10, 10, 10); // Margen
        gbcCancel.gridwidth = 1;
        gbcCancel.anchor = GridBagConstraints.CENTER; // Centrado horizontal

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setSize(300, 300);

        panelPrincipal.setLayout(new GridBagLayout());
        // Crear un GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel textoTemperatura = new JLabel();
        textoTemperatura.setText("Ingrese el valor que quiere convertir: ");
        gbc.gridx = 0; // Columna 0
        gbc.gridy = 0; // Fila 0
        panelPrincipal.add(textoTemperatura, gbc);

        JTextField ingresoTemperatura = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panelPrincipal.add(ingresoTemperatura, gbc);

        Object[] conversionesTemperaturas = { "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius",
                "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit" };

        Object conversionSeleccionada = JOptionPane.showInputDialog(null, "Elige el tipo de conversión", "Conversiones",
                JOptionPane.INFORMATION_MESSAGE, null, conversionesTemperaturas, conversionesTemperaturas[0]);

        conversionTemperatura conversorTemperatura = new conversionTemperatura();

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valorIngresado = ingresoTemperatura.getText();
                try {
                    conversorTemperatura.temperaturaValor = Double.parseDouble(valorIngresado);
                    conversorTemperatura.calculoTemperaturaWindow(conversionSeleccionada);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Ingrese un valor numérico válido", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                ventana.dispose();
            }
        });

        cancelBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Operación cancelada.", "Cancelado",
                        JOptionPane.INFORMATION_MESSAGE);
                ventana.dispose(); // Cierra la ventana
            }
        });

        panelPrincipal.add(okBtn, gbcOk);
        panelPrincipal.add(cancelBtn, gbcCancel);
        ventana.add(panelPrincipal);
        ventana.setVisible(true);
    }

}
