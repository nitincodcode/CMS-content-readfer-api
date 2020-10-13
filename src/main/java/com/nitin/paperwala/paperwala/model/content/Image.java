package com.nitin.paperwala.paperwala.model.content;

import lombok.Data;

@Data
public class Image implements Content {
    private String imgURl;
    private Integer id;
    private String altText;
}
