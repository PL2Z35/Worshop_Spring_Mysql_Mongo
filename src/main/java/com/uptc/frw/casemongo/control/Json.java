package com.uptc.frw.casemongo.control;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Json {
    public String toJson(Object obj) {
        try{
            ObjectMapper mapper = new ObjectMapper();
            return  mapper.writeValueAsString(obj);
        }catch (Exception e){
            return null;
        }
    }
}
