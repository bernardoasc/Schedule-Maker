package com.example.schedulemaker;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InventoryController {

    //a mapping when someone enters file
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showHomepage(ModelMap model, @RequestParam(defaultValue = "") String id) throws ClassNotFoundException, SQLException {


        return "home";


    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHomepage2(ModelMap model, @RequestParam(defaultValue = "") String id) throws ClassNotFoundException, SQLException {


        return "home";


    }
}
