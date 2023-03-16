package com.christian.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidatorService {
    private final TipoArchivo tipoArchivo;

    @Autowired
    public ValidatorService(TipoArchivo tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public boolean validarLinea(FileRequest fileRequest) {
        ValidarArchivo archivo = tipoArchivo.obtenerTipo(fileRequest.getFileType());
        return archivo.validarLinea(fileRequest.getLine());
    }
}
