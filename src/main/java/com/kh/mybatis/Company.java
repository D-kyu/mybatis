package com.kh.mybatis;


import lombok.Data;

@Data   // @Getter, @Setter, @RequiredARgsConstructor, @ToString, @EqualsAndHashCode

public class Company {
    private int id;
    private String name;
    private String address;
}
