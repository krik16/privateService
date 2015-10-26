package com.rongyi.easy.shop.mvc.DateJson;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.springframework.util.StringUtils;


public   class  ObjectIdJsonDeserializer  extends  JsonDeserializer<Date> {  
    public   static   final  SimpleDateFormat format =  new  SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );  
    @Override   
    public  Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)  throws  IOException, JsonProcessingException {   
        try {
        	if(StringUtils.isEmpty(jsonParser.getText()))
        		return null;
			return  format.parse(jsonParser.getText());
		} catch (ParseException e) {
			throw   new  RuntimeException(e);  
		}  
     
   }  
}  
