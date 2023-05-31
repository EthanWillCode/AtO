package org.launchcode.AtOwebpage.Controllers;

import org.launchcode.AtOwebpage.Controllers.data.ForumRepository;
import org.launchcode.AtOwebpage.models.ForumPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("forums")
public class ForumsController {

    @Autowired
    private ForumRepository forumRepository;

    @GetMapping
    public String forumHomePage(Model model) {
        model.addAttribute("title", "Forums");
        model.addAttribute("forumPost", forumRepository.findAll());

        return "forums/index";
    }

    @GetMapping ("create")
    public String createForumPost(Model model) {
        model.addAttribute("title", "Create Post");
        model.addAttribute("forumPost", new ForumPost());

        return "forums/create";
    }

    @PostMapping("create")
    public String processCreateEventCategoryForm (@Valid @ModelAttribute ForumPost forumPost, Errors errors, Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Create Post");
            return "forums/create";
        }

        forumRepository.save(forumPost);
        return "redirect:";

    }
}
