package com.kaelvihn.freemarker.controller;

import com.kaelvihn.freemarker.pojos.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;


/**
 * @author : KaelvihN
 * @date : 2023/9/18 10:16
 */

@Controller
public class PersonController {
    @GetMapping("/base")
    public String testStart(Model model) {
//        model.addAttribute("name", "FreeMarker");
        Person person = new Person("KaelvihN", 23);
        model.addAttribute("person", person);
        return "base";
    }

    @GetMapping("/list")
    public String testList(Model model) {
        Person person1 = new Person("KaelvihN", 23, new Date(), 10000);
        Person person2 = new Person("Tom", 20, new Date(), 1000);
        Person person3 = new Person("Zeus", 21, new Date(), 100);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
//        model.addAttribute("personList", personList);
        return "base2";
    }

    @GetMapping("/map")
    public String testMap(Model model) {
        Person person1 = new Person("KaelvihN", 23, new Date(), 10000);
        Person person2 = new Person("Tom", 20, new Date(), 1000);
        Person person3 = new Person("Zeus", 21, new Date(), 100);
        HashMap<String, Person> map = new HashMap<>();
        map.put("person1", person1);
        map.put("person2", person2);
        map.put("person2", person3);
        model.addAttribute("personMap", map);
        return "base3";
    }
}
