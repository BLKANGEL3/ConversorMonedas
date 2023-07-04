package InterfazGrafica;

import Logica.conversionMonedas;
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

public class monedaConversionVentana extends conversionMonedas {

    public void crearVentanaMoneda() {
        JFrame ventana = new JFrame("Conversor de Monedas");
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

        JLabel textoMoneda = new JLabel();
        textoMoneda.setText("Ingrese el valor que quiere convertir: ");
        gbc.gridx = 0; // Columna 0
        gbc.gridy = 1; // Fila 0
        panelPrincipal.add(textoMoneda, gbc);

        JTextField ingresoMoneda = new JTextField(20);
        gbc.gridx = 1;
        gbc.gridy = 1;
        panelPrincipal.add(ingresoMoneda, gbc);

        Object[] conversionesMonedas = { "MXN a Dolár", "MXN a Euros", "MXN a Libras esterlinas",
                "MXN a Yenes japoneses", "MXN a Won Surcoreano", "Dolár a MXN", "Euro a MXN", "Libras esterlinas a MXN",
                "Yen Japonés a MXN", "Won Surcoreano a MXN" };

        Object conversionSeleccionada = JOptionPane.showInputDialog(null, "Elige el tipo de conversión", "Conversiones",
                JOptionPane.INFORMATION_MESSAGE, null, conversionesMonedas, conversionesMonedas[0]);

        conversionMonedas conversorMonedas = new conversionMonedas();

        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String valorIngresado = ingresoMoneda.getText();
                try {
                    conversorMonedas.monedaValor = Double.parseDouble(valorIngresado);
                    conversorMonedas.calculoMonedaWindow(conversionSeleccionada);
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
