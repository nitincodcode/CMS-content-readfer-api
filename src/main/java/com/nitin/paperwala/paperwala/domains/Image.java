package com.nitin.paperwala.paperwala.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Image {
    @Id
    private final String id;
    private final String src;
    private final String dataBase64;
    private final String alt;
}
