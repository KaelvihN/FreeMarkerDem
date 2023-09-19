package com.kaelvihn.freemarker.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : KaelvihN
 * @date : 2023/9/18 10:18
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    private String name;
    private int age;
    private Date birthday;
    private double money;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
