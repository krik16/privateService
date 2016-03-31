package com.rongyi.easy.shop.mvc.DateJson;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.bson.types.ObjectId;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;


public   class  ListObjectIdJsonDeserializer  extends  JsonDeserializer<List<ObjectId>> {  
    public   static   final  SimpleDateFormat format =  new  SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );  
    @Override   
    public  List<ObjectId> deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)  throws  IOException, JsonProcessingException {   
       if(jsonParser==null||StringUtils.isBlank(jsonParser.getText()))
    		return null;
       else{
    	   String[] ids=jsonParser.getText().split(",");
    	   
       }
     /*  ||!jsonParser.getText().matches("[\\da-zA-Z]{24}"))*/
       return null;
    	
   }  
}  
