package com.christian.validator;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ValidarExcel implements ValidarArchivo{
    @Override
    public boolean validarLinea(String[] linea) {
        Set<String> set = new HashSet<String>(Arrays.asList(
                "Near Miss", "Lost Time", "First Aid"
        ));
        return set.contains(linea[7]) && !linea[0].equals("N/A");
    }
}
