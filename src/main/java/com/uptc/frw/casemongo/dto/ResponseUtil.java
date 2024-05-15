package com.uptc.frw.casemongo.dto;


import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ResponseUtil {
    public static <T> ResponseEntity createResponse(T data)  {
        if(data == null){
            return new ResponseEntity("Data Not Found", HttpStatus.NOT_FOUND);
        }
        if(data instanceof List){
            List<?> list = (List<?>) data;
            return list.isEmpty()? new ResponseEntity("Data Not Found", HttpStatus.NOT_FOUND): new ResponseEntity(list, HttpStatus.OK);
        }
        if(data instanceof Long || data instanceof Integer){
            try{
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("value", data);
                return new ResponseEntity(jsonObject.toString(), HttpStatus.OK);
            }catch (Exception e){
                return new ResponseEntity("Data Not Found", HttpStatus.NOT_FOUND);
            }
        }
        return data.toString().isEmpty()? new ResponseEntity("Data Not Found", HttpStatus.NOT_FOUND): new ResponseEntity(data, HttpStatus.OK);
    }
}
