package com.rongyi.easy.shop.mvc.DateJson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.bson.types.ObjectId;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class JsonListObjectIdSerializer extends JsonSerializer<List<ObjectId>> {

	@Override
	public void serialize(List<ObjectId> objectIds, JsonGenerator gen,SerializerProvider provider) 
			throws IOException,JsonProcessingException {
		List<String> ids=new ArrayList<String>();
		if(CollectionUtils.isNotEmpty(objectIds)){
			for(ObjectId objectId:objectIds){
				ids.add(objectId.toString());
			}
		}
		gen.writeString(ids.toString());
	}
}