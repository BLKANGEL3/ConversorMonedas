package Logica;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

import InterfazGrafica.monedaConversionVentana;

import javax.swing.JOptionPane;

public class conversionMonedas {

    public double monedaValor;
    public double resultadoConversion;

    public void calculoMonedaWindow(Object conversionSeleccionada) {
        // Componente JFrame
        JFrame titulo = new JFrame("Conversor");
        titulo.setSize(500, 300);

        // Componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        if (conversionSeleccionada.equals("MXN a Dolár")) {
            double resultado = monedaValor * 0.58;
            String mensaje = monedaValor + " MXN son equivalentes a " + resultado + " dólares.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("MXN a Euros")) {
            double resultado = monedaValor * 0.53;
            String mensaje = monedaValor + " MXN son equivalentes a " + resultado + " euros.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("MXN a Libras esterlinas")) {
            double resultado = monedaValor * 0.46;
            String mensaje = monedaValor + " MXN son equivalentes a " + resultado + " libras esterlinas.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("MXN a Yenes japoneses")) {
            double resultado = monedaValor * 8.43;
            String mensaje = monedaValor + " MXN son equivalentes a " + resultado + " yenes japoneses.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("MXN a Won Surcoreano")) {
            double resultado = monedaValor * 76.86;
            String mensaje = monedaValor + " MXN son equivalentes a " + resultado + " wons surcoreanos";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Dolár a MXN")) {
            double resultado = monedaValor * 17.06;
            String mensaje = monedaValor + " dólares son equivalentes a " + resultado + " MXN.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Euro a MXN")) {
            double resultado = monedaValor * 18.61;
            String mensaje = monedaValor + " euros son equivalentes a " + resultado + " MXN.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Libras esterlinas a MXN")) {
            double resultado = monedaValor * 21.65;
            String mensaje = monedaValor + " libras esterlinas son equivalentes a " + resultado + " MXN.";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Yen Japonés a MXN")) {
            double resultado = monedaValor * 0.12;
            String mensaje = monedaValor + " yenes son equivalentes a " + resultado + " MXN";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        } else if (conversionSeleccionada.equals("Won Surcoreano a MXN")) {
            double resultado = monedaValor * 0.013;
            String mensaje = monedaValor + " wons son equivalentes a " + resultado + " MXN";
            JOptionPane.showMessageDialog(null, mensaje, "Resultado de Conversión", JOptionPane.INFORMATION_MESSAGE);
        }

        // Abrir el cuadro de diálogo para confirmar la continuación
        int opcion = JOptionPane.showConfirmDialog(titulo, "¿Desea continuar?",
                "Seleccione una opción", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);

        // Realizar acciones según la opción seleccionada
        if (opcion == JOptionPane.YES_OPTION) {
            monedaConversionVentana nuevaVentana = new monedaConversionVentana();
            nuevaVentana.crearVentanaMoneda();
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
