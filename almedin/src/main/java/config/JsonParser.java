package config;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.Entity;

public class JsonParser {
    private String jsonString;

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public <T> T getJsonObject(Class<T> valueType) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(this.jsonString, valueType);
    }
}
