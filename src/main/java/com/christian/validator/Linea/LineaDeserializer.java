package com.christian.validator.Linea;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import java.io.IOException;

public class LineaDeserializer extends JsonDeserializer<Linea>  {
    @Override
    public Linea deserialize(JsonParser jsonParser, DeserializationContext ctxt) throws IOException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);
        String className = node.get("type").asText();
        switch (className){
            case "csv":
                return new LineaCSV(node);
            case "xlsx":
                return new LineaExcel(node);
            default:
                return null;
        }
}
}
