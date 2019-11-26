package com.west.forum.controller;

import com.west.forum.dto.PaginationDTO;
import com.west.forum.mapper.schema.UserMapper;
import com.west.forum.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/")
    public String index(HttpServletRequest request,
                        Model model,
                        @RequestParam(name = "page", defaultValue = "1") int page,
                        @RequestParam(name = "size", defaultValue = "5") int size,
                        @RequestParam(name = "search", required = false) String search) {
        PaginationDTO paginationDTO = questionService.list(search, page, size);
        model.addAttribute("paginationDTO", paginationDTO);
        model.addAttribute("search", search);
        return "index";
    }
}
