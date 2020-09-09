package org.checker.currency.Past.Converter;

import com.google.gson.*;
import org.checker.currency.Past.Classes.Example;
import org.checker.currency.Past.Classes.Rates;

import java.lang.reflect.Type;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JsonDataConverter implements Converter<Example> {
    private final Gson gson;

    public JsonDataConverter() {

        gson = new GsonBuilder().registerTypeAdapter(LocalDateTime.class, new JsonDeserializer<LocalDateTime>() {
            private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            @Override
            public LocalDateTime deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
                    throws JsonParseException {
                return LocalDateTime.parse(json.getAsString(), formatter);
            }
        }).create();
    }


    @Override
    public Example convert(String data) {
        return gson.fromJson(data, Example.class);
    }
}
