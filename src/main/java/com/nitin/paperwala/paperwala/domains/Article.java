package com.nitin.paperwala.paperwala.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import lombok.Getter;

@Getter
@AllArgsConstructor
public class Article {
    @Id
    private final String id;
    private final String pageURL;
    private final Author author;
    private final String title;
    private final String created;
    private final String updated;
    private final java.util.List<Paragraph> paragraphList;
}
