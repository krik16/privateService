package com.rongyi.easy.shop.mvc.DateJson;

import java.io.IOException;

import org.bson.types.ObjectId;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class JsonObjectIdSerializer extends JsonSerializer<ObjectId> {

	@Override
	public void serialize(ObjectId id, JsonGenerator gen,SerializerProvider provider) 
			throws IOException,JsonProcessingException {
		if(id!=null)
			gen.writeString(id.toString());
		else
			gen.writeString("");
	}
}