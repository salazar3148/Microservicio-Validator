package com.christian.validator.Modelo;
import com.christian.validator.Linea.Linea;

public class FileRequest {
    private Linea line;
    public FileRequest(){
    }
    public FileRequest(Linea line) {
        this.line = line;
    }
    public Linea getLine() {
        return line;
    }

}
