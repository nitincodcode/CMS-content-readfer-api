package com.nitin.paperwala.paperwala.domains;

import lombok.Data;
import com.nitin.paperwala.paperwala.domains.Size;
import org.springframework.data.annotation.Id;

import lombok.Getter;

@Getter
public class Inventory {
    @Id
    private String id;
    private String item;
    private String qty;
    private Size size;
    private String status;
}
