package com.nitin.paperwala.paperwala.domains;

import lombok.Builder;

import lombok.Getter;

@Getter
public class ParagrapghImage extends Image {
    //private String paragrapghId;
    private final String floatDir;

    @Builder
    public ParagrapghImage(String id,String src,String dataBase64,String alt, String floatDir){
        super(id, src, dataBase64, alt);
        //this.paragrapghId = paragrapghId;
        this.floatDir = floatDir;
    }
}
