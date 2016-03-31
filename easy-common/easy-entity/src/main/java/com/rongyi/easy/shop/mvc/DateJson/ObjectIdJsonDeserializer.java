package com.rongyi.easy.shop.mvc.DateJson;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;


public   class  ObjectIdJsonDeserializer  extends  JsonDeserializer<ObjectId> {  
    public   static   final  SimpleDateFormat format =  new  SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );  
    @Override   
    public  ObjectId deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)  throws  IOException, JsonProcessingException {   
       try {
    	   if(jsonParser==null||StringUtils.isBlank(jsonParser.getText())
        		   ||!jsonParser.getText().matches("[\\da-zA-Z]{24}"))
        		return null;
           System.out.println(jsonParser.getText());
        	return new ObjectId(jsonParser.getText().trim());
	} catch (Exception e) {
		e.printStackTrace();
		throw e;
	}
    	
    	
   }  
}  
