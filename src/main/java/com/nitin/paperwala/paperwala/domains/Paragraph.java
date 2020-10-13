package com.nitin.paperwala.paperwala.domains;

import lombok.Data;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import java.util.List;

@Getter
public class Paragraph {
    @Id
    private String id;
    private String content;
    private String sequence;
    private ParagrapghImage image;
    private List<ParagrapghHyperlink> links;
}
