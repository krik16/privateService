package com.rongyi.easy.mvc.DateJson;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class DateJsonSerializer extends JsonSerializer<Date>{
    
    public static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    
    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider provider) throws IOException,
                                                                                      JsonProcessingException {
        String dateStr = format.format(date);
        jsonGenerator.writeString(dateStr);
        
        System.out.println(dateStr);
    }

}
