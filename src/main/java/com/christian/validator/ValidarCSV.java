package com.christian.validator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.time.LocalDate;


public class ValidarCSV implements ValidarArchivo{
    @Override
    public boolean validarLinea(String[] linea) {
        String[] fecha = linea[7].split("-");
        LocalDate fechaNacimiento = LocalDate.of(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]));
        LocalDate fechaMinima = LocalDate.of(1980, 1, 1);

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Set<String> set = new HashSet<String>(Arrays.asList(
                "Haematologist", "Phytotherapist", "Building surveyor", "Insurance",
                "account manager", "Educational psychologist"
        ));
        return linea[5].matches(emailRegex) && set.contains(linea[8]) && fechaNacimiento.isAfter(fechaMinima);
    }
}
