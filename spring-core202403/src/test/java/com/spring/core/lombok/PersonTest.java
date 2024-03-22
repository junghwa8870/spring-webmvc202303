package com.spring.core.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void lombokTest() {
        Person p = new Person();
        p.setName("김철수");
        p.setAge(30);
        String name = p.getName();

        System.out.println("p = " + p);

        Person p2 = new Person("박영희", 35);


    }
}