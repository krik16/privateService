package com.rongyi.easy.mcmc.mvc.DateJson;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;


public   class  DateJsonDeserializer  extends  JsonDeserializer<Date> {  
    public   static   final  SimpleDateFormat format =  new  SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );  
    @Override   
    public  Date deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)  throws  IOException, JsonProcessingException {   
        try {
        	if(jsonParser==null||StringUtils.isBlank(jsonParser.getText()))
        		return null;
			return  format.parse(jsonParser.getText());
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}  
     
   }  
}  
