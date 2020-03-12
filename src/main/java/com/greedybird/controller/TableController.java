package com.greedybird.controller;

import com.greedybird.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TableController {
    @Autowired
    TableService tableService;

    @RequestMapping("/name")
    @ResponseBody
    public String getName(){
        String name = tableService.getName(1);
        return name;
    }
}
