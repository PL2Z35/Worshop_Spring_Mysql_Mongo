package com.uptc.frw.casemongo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ListResponse {
    private List data;
    private int size;

    public ListResponse(List data) {
        this.data = data;
        size = data.size();
    }


}
