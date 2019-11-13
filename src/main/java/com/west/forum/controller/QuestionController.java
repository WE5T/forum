package com.west.forum.controller;

import com.west.forum.dto.CommentCreateDTO;
import com.west.forum.dto.CommentDTO;
import com.west.forum.dto.QuestionDTO;
import com.west.forum.service.CommentService;
import com.west.forum.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private CommentService commentService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable("id") Long id, Model model){
        QuestionDTO questionDTO = questionService.getById(id);
        //累加浏览数
        questionService.incView(id);
        List<CommentDTO> comments = commentService.listByQuestionId(id);
        model.addAttribute("question", questionDTO);
        model.addAttribute("comments", comments);
        return "question";
    }
}
