package com.quest.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.quest.service.TodoItemService;

@Controller
public class TodoItemController {
   // @Autowired
    //private TodoItemService service;

    @GetMapping("/daily-log")
    public String getDailyLog(Model model) {
		System.out.println("Hello");
	/*	  List<TodoItem> items = service.getItemsForDate(date);
		  model.addAttribute("items", items); model.addAttribute("newItem", new
		  TodoItem());*/
		 
        return "daily-log";
    }

    /*   @PostMapping("/add-item")
    public String addItem(@ModelAttribute TodoItem item) {
		 service.saveItem(item); 
        return "redirect:/daily-log?date=" + item.getDate();
    }*/
}