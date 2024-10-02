package Hospital.View;

import Hospital.model.Medicamento;
import Hospital.services.DataFarmacia;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FarmaciasView {

    public static JPanel FarmaciaPP() {
        JPanel fp = new JPanel(new BorderLayout());

        DataFarmacia dataFarmacia = new DataFarmacia();
        List<Medicamento> medicamentoList = dataFarmacia.getMedicamentos();

        Collections.sort(medicamentoList, Comparator.comparing(Medicamento::getNombre));

        String[] columnNames = {"Nombre", "Forma", "Dosis", "Precio"};

        Object[][] data = new Object[medicamentoList.size()][columnNames.length];

        for (int i = 0; i < medicamentoList.size(); i++) {
            Medicamento medicamento = medicamentoList.get(i);
            data[i][0] = medicamento.getNombre();                  // Nombre
            data[i][1] = medicamento.getFormaFarmaceutica();      // Forma
            data[i][2] = medicamento.getDosis();                   // Dosis
            data[i][3] = medicamento.getPrecio() + " USD";        // Precio
        }

        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        fp.add(scrollPane, BorderLayout.CENTER);

        return fp;
    }
}