package com.nitin.paperwala.paperwala.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Hyperlink {
    @Id
    private final String id;
    private final String href;
    private final String rel;
}
