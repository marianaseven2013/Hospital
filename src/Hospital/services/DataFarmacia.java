package Hospital.services;

import Hospital.model.Medicamento;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DataFarmacia {

    private List<Medicamento> medicamentos;

    public DataFarmacia(){
        medicamentos = new ArrayList<>();
        cargarMedicamentos();
    }

    private void cargarMedicamentos() {
        medicamentos.add(new Medicamento("Budesonida", "Inhalador", "200mcg", "Budesonida", LocalDate.of(2024, 5, 10), "L030", 11.0, "Asma", "Inmunosupresión local"));
        medicamentos.add(new Medicamento("Paracetamol", "Tableta", "500mg", "Paracetamol", LocalDate.of(2025, 5, 12), "L001", 2.5, "Para el dolor leve", "No usar en caso de enfermedad hepática"));
        medicamentos.add(new Medicamento("Ibuprofeno", "Cápsula", "200mg", "Ibuprofeno", LocalDate.of(2026, 3, 15), "L002", 3.0, "Antiinflamatorio", "Evitar en embarazo"));
        medicamentos.add(new Medicamento("Amoxicilina", "Cápsula", "500mg", "Amoxicilina", LocalDate.of(2024, 8, 1), "L003", 5.0, "Infecciones bacterianas", "Alergia a penicilina"));
        medicamentos.add(new Medicamento("Cetirizina", "Jarabe", "5mg/5ml", "Cetirizina", LocalDate.of(2027, 2, 10), "L004", 4.5, "Alergias", "Somnolencia"));
        medicamentos.add(new Medicamento("Metformina", "Tableta", "850mg", "Metformina", LocalDate.of(2025, 6, 22), "L005", 3.5, "Diabetes tipo 2", "Evitar en insuficiencia renal"));
        medicamentos.add(new Medicamento("Losartán", "Tableta", "50mg", "Losartán", LocalDate.of(2028, 7, 13), "L006", 6.0, "Hipertensión", "No usar en embarazo"));
        medicamentos.add(new Medicamento("Omeprazol", "Cápsula", "20mg", "Omeprazol", LocalDate.of(2024, 12, 9), "L007", 4.0, "Reflujo gástrico", "Uso prolongado puede causar deficiencia de vitamina B12"));
        medicamentos.add(new Medicamento("Aspirina", "Tableta", "100mg", "Ácido Acetilsalicílico", LocalDate.of(2027, 5, 5), "L008", 1.5, "Analgésico y antiinflamatorio", "No en menores de 12 años"));
        medicamentos.add(new Medicamento("Simvastatina", "Tableta", "20mg", "Simvastatina", LocalDate.of(2025, 1, 18), "L009", 6.5, "Dislipidemia", "No usar en embarazo"));
        medicamentos.add(new Medicamento("Levotiroxina", "Tableta", "50mcg", "Levotiroxina", LocalDate.of(2026, 11, 2), "L010", 7.0, "Hipotiroidismo", "No usar en hipertiroidismo"));
        medicamentos.add(new Medicamento("Clopidogrel", "Tableta", "75mg", "Clopidogrel", LocalDate.of(2024, 9, 20), "L011", 8.5, "Anticoagulante", "Riesgo de sangrado"));
        medicamentos.add(new Medicamento("Alprazolam", "Tableta", "0.5mg", "Alprazolam", LocalDate.of(2025, 4, 3), "L012", 3.0, "Ansiedad", "Dependencia a largo plazo"));
        medicamentos.add(new Medicamento("Furosemida", "Tableta", "40mg", "Furosemida", LocalDate.of(2027, 1, 15), "L013", 2.5, "Diurético", "Desequilibrio electrolítico"));
        medicamentos.add(new Medicamento("Amlodipino", "Tableta", "5mg", "Amlodipino", LocalDate.of(2026, 6, 8), "L014", 4.5, "Hipertensión", "Edema periférico"));
        medicamentos.add(new Medicamento("Dexametasona", "Inyección", "4mg/ml", "Dexametasona", LocalDate.of(2028, 3, 30), "L015", 9.0, "Inflamación severa", "Inmunosupresión"));
        medicamentos.add(new Medicamento("Diazepam", "Tableta", "5mg", "Diazepam", LocalDate.of(2025, 8, 14), "L016", 3.5, "Ansiedad y convulsiones", "Somnolencia"));
        medicamentos.add(new Medicamento("Ciprofloxacino", "Tableta", "500mg", "Ciprofloxacino", LocalDate.of(2024, 10, 21), "L017", 8.0, "Infecciones bacterianas", "Evitar en embarazo"));
        medicamentos.add(new Medicamento("Enalapril", "Tableta", "10mg", "Enalapril", LocalDate.of(2027, 12, 1), "L018", 4.0, "Hipertensión", "Tos seca persistente"));
        medicamentos.add(new Medicamento("Loratadina", "Tableta", "10mg", "Loratadina", LocalDate.of(2025, 2, 27), "L019", 2.0, "Alergias", "Somnolencia"));
        medicamentos.add(new Medicamento("Diclofenaco", "Gel", "1%", "Diclofenaco", LocalDate.of(2026, 7, 19), "L020", 5.0, "Dolor muscular", "Evitar en úlceras gástricas"));
        medicamentos.add(new Medicamento("Naproxeno", "Tableta", "500mg", "Naproxeno", LocalDate.of(2024, 11, 8), "L021", 6.5, "Antiinflamatorio", "No usar en embarazo"));
        medicamentos.add(new Medicamento("Ranitidina", "Tableta", "150mg", "Ranitidina", LocalDate.of(2027, 4, 25), "L022", 4.0, "Reflujo gástrico", "Retirada en algunos países"));
        medicamentos.add(new Medicamento("Meloxicam", "Tableta", "15mg", "Meloxicam", LocalDate.of(2025, 9, 17), "L023", 7.5, "Dolor e inflamación", "Riesgo gastrointestinal"));
        medicamentos.add(new Medicamento("Azitromicina", "Cápsula", "500mg", "Azitromicina", LocalDate.of(2028, 2, 11), "L024", 10.0, "Infecciones bacterianas", "Evitar en insuficiencia hepática"));
        medicamentos.add(new Medicamento("Glimepirida", "Tableta", "2mg", "Glimepirida", LocalDate.of(2026, 10, 9), "L025", 6.0, "Diabetes tipo 2", "Hipoglucemia"));
        medicamentos.add(new Medicamento("Prednisona", "Tableta", "5mg", "Prednisona", LocalDate.of(2024, 7, 15), "L026", 4.5, "Inflamación severa", "Inmunosupresión"));
        medicamentos.add(new Medicamento("Carvedilol", "Tableta", "12.5mg", "Carvedilol", LocalDate.of(2027, 9, 1), "L027", 9.0, "Insuficiencia cardíaca", "Hipotensión"));
        medicamentos.add(new Medicamento("Insulina Glargina", "Inyección", "100U/ml", "Insulina Glargina", LocalDate.of(2025, 11, 22), "L028", 12.0, "Diabetes tipo 1", "Hipoglucemia"));
        medicamentos.add(new Medicamento("Montelukast", "Tableta", "10mg", "Montelukast", LocalDate.of(2026, 12, 15), "L029", 5.0, "Asma", "Cambios de humor"));
        medicamentos.add(new Medicamento("Budesonida", "Inhalador", "200mcg", "Budesonida", LocalDate.of(2024, 5, 10), "L030", 11.0, "Asma", "Inmunosupresión local"));
        medicamentos.add(new Medicamento("Fluticasona", "Inhalador", "250mcg", "Fluticasona", LocalDate.of(2026, 5, 8), "L031", 10.0, "Asma", "Inmunosupresión local"));
        medicamentos.add(new Medicamento("Salbutamol", "Inhalador", "100mcg", "Salbutamol", LocalDate.of(2024, 6, 1), "L032", 8.0, "Asma", "Taquicardia"));
        medicamentos.add(new Medicamento("Omeprazol", "Cápsula", "20mg", "Omeprazol", LocalDate.of(2024, 12, 9), "L007", 4.0, "Reflujo gástrico", "Uso prolongado puede causar deficiencia de vitamina B12"));
        medicamentos.add(new Medicamento("Aspirina", "Tableta", "100mg", "Ácido Acetilsalicílico", LocalDate.of(2027, 5, 5), "L008", 1.5, "Analgésico y antiinflamatorio", "No en menores de 12 años"));
        medicamentos.add(new Medicamento("Simvastatina", "Tableta", "20mg", "Simvastatina", LocalDate.of(2025, 1, 18), "L009", 6.5, "Dislipidemia", "No usar en embarazo"));
        medicamentos.add(new Medicamento("Levotiroxina", "Tableta", "50mcg", "Levotiroxina", LocalDate.of(2026, 11, 2), "L010", 7.0, "Hipotiroidismo", "No usar en hipertiroidismo"));
        medicamentos.add(new Medicamento("Clopidogrel", "Tableta", "75mg", "Clopidogrel", LocalDate.of(2024, 9, 20), "L011", 8.5, "Anticoagulante", "Riesgo de sangrado"));
        medicamentos.add(new Medicamento("Alprazolam", "Tableta", "0.5mg", "Alprazolam", LocalDate.of(2025, 4, 3), "L012", 3.0, "Ansiedad", "Dependencia a largo plazo"));
        medicamentos.add(new Medicamento("Furosemida", "Tableta", "40mg", "Furosemida", LocalDate.of(2027, 1, 15), "L013", 2.5, "Diurético", "Desequilibrio electrolítico"));

    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

}
