package com.nitin.paperwala.paperwala.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
@AllArgsConstructor
public class Author {
    @Id
    private final String id;
    private final String authorName;
    private final Image image;
}
