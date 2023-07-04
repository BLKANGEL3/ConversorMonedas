package Logica;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import InterfazGrafica.temperaturaConversionVentana;

public class conversionTemperatura {
    public double temperaturaValor;
    public double resultadoConversion;

    public void calculoTemperaturaWindow(Object conversionSeleccionada) {
        // Componente JFrame
        JFrame titulo = new JFrame("Conversor");
        titulo.setSize(500, 300);

        // Componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        if (conversionSeleccionada.equals("Celsius a Fahrenheit")) {
            double resultado = (temperaturaValor * 1.8) + 32;
            String mensaje = temperaturaValor + " \u00B0C son equivalentes a " + resultado + " \u00B0F.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Celsius a Kelvin")) {
            double resultado = temperaturaValor + 273.15;
            String mensaje = temperaturaValor + " \u00B0C son equivalentes a " + resultado + " K.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Fahrenheit a Celsius")) {
            double resultado = (temperaturaValor - 32) * (5 / 9);
            String mensaje = temperaturaValor + " \u00B0F son equivalentes a " + resultado + " \u00B0C.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Fahrenheit a Kelvin")) {
            double resultado = (temperaturaValor - 32) * (5 / 9) + 273.15;
            String mensaje = temperaturaValor + " \u00B0F son equivalentes a " + resultado + " K.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Kelvin a Celsius")) {
            double resultado = temperaturaValor - 273.15;
            String mensaje = temperaturaValor + " K son equivalentes a " + resultado + " \u00B0C";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Kelvin a Fahrenheit")) {
            double resultado = (temperaturaValor - 273.15) * (9 / 5) + 32;
            String mensaje = temperaturaValor + " K son equivalentes a " + resultado + " \u00B0F.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        }

        // Abrir el cuadro de diálogo para confirmar la continuación
        int opcion = JOptionPane.showConfirmDialog(titulo, "¿Desea continuar?",
                "Seleccione una opción", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        // Realizar acciones según la opción seleccionada
        if (opcion == JOptionPane.YES_OPTION) {
            temperaturaConversionVentana nuevaVentana = new temperaturaConversionVentana();
            nuevaVentana.crearVentanaTemperatura();
        } else if (opcion == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa terminado", "Fin del programa",
                    JOptionPane.INFORMATION_MESSAGE);
        } else if (opcion == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Programa terminado", "Fin del programa",
                    JOptionPane.INFORMATION_MESSAGE);
        }

        // conectar Jpanel a JFrame`
        titulo.add(miJPanel);

    }
}
