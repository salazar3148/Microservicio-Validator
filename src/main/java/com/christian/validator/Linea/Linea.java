package com.christian.validator.Linea;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@JsonDeserialize(using = LineaDeserializer.class)
public interface Linea {
    public String getType();
}
