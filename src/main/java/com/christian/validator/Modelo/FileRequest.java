package com.christian.validator.Modelo;

public class FileRequest {
    private final String[] line;
    private final String fileType;
    public FileRequest(String[] line, String fileType) {
        this.line = line;
        this.fileType = fileType;
    }
    public String[] getLine() {
        return line;
    }
    public String getFileType() {
        return fileType;
    }

}
