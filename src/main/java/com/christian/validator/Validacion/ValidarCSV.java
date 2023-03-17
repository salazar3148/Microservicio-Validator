package com.christian.validator.Validacion;
import com.christian.validator.Linea.Linea;
import com.christian.validator.Linea.LineaCSV;
import com.christian.validator.Linea.LineaExcel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.time.LocalDate;


public class ValidarCSV implements ValidarArchivo {
    @Override
    public boolean validarLinea(Linea linea) {

        LineaCSV line = (LineaCSV) linea;
        LocalDate fechaMinima = LocalDate.of(1980, 1, 1);
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Set<String> set = new HashSet<String>(Arrays.asList(
                "Haematologist", "Phytotherapist", "Building surveyor", "Insurance",
                "account manager", "Educational psychologist"
        ));

        return line.getEmail().matches(emailRegex) && set.contains(line.getJobTitle()) && line.getDateOfBirth().isAfter(fechaMinima);
    }
}
