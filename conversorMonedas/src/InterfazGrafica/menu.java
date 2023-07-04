package InterfazGrafica;

import java.awt.GridBagLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class menu {
    public static void main(String[] args) {
        // Componente JFrame
        JFrame titulo = new JFrame("Conversor");
        titulo.setSize(500, 300);

        // Componente JPanel
        JPanel miJPanel = new JPanel();
        miJPanel.setSize(300, 300);

        // Selección de Conversión
        Object[] opciones = { "Moneda", "Temperatura" };
        Object opcionSeleccionada = JOptionPane.showInputDialog(null, "¿Qué desea convertir?", "Menú",
                JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (opcionSeleccionada.equals("Moneda")) {
            monedaConversionVentana ventanaMoneda = new monedaConversionVentana();
            ventanaMoneda.crearVentanaMoneda();
        } else {
            temperaturaConversionVentana ventanaTemperatura = new temperaturaConversionVentana();
            ventanaTemperatura.crearVentanaTemperatura();
        }

        // usamos este diseño para centrar los componentes de JPanel
        miJPanel.setLayout(new GridBagLayout());

        // conectar Jpanel a JFrame`
        titulo.add(miJPanel);

    }
}
