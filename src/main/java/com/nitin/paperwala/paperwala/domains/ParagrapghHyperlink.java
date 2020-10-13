package com.nitin.paperwala.paperwala.domains;

import com.nitin.paperwala.paperwala.model.content.Paragrapgh;
import lombok.Builder;
import lombok.Getter;

@Getter
public class ParagrapghHyperlink extends Hyperlink {
    private final String location;

    @Builder
    public ParagrapghHyperlink(String id,String href,String rel,String location){
        super(id,href,rel);
        this.location = location;
    }
}
