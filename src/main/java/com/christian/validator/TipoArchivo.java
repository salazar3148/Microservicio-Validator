package com.christian.validator;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TipoArchivo {
    public ValidarArchivo obtenerTipo(String extension) {
        Map<String, ValidarArchivo> archivoMap = new HashMap<>() {{
            put("csv", new ValidarCSV());
            put("xlsx", new ValidarExcel());
            put("xls", new ValidarExcel());
        }};
        return archivoMap.get(extension);
    }
}
