package com.nitin.paperwala.paperwala.model.content;

import lombok.Data;

@Data
public class Hyperlink implements Content {
    private String herf;
    private String linkText;

//    @Override
//    public String returnString() {
//        return null;
//    }
}
