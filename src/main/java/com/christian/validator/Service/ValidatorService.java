package com.christian.validator.Service;

import com.christian.validator.Modelo.FileRequest;
import com.christian.validator.Validacion.TipoArchivo;
import com.christian.validator.Validacion.ValidarArchivo;
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
        ValidarArchivo archivo = tipoArchivo.obtenerTipo(fileRequest.getLine().getType());
        return archivo.validarLinea(fileRequest.getLine());
    }
}
