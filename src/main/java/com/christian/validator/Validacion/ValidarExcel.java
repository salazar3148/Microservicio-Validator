package com.christian.validator.Validacion;
import com.christian.validator.Linea.Linea;
import com.christian.validator.Linea.LineaExcel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidarExcel implements ValidarArchivo {
    @Override
    public boolean validarLinea(Linea linea) {

        LineaExcel line = (LineaExcel) linea;
        Set<String> set = new HashSet<String>(Arrays.asList(
                "Near Miss", "Lost Time", "First Aid"
        ));
        return set.contains(line.getReportType()) && !line.getInjuryLocation().equals("N/A");
    }
}
