package org.launchcode.AtOwebpage.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("champions")
public class ChampionController {


    @GetMapping
    public String championHomePage (Model model) {
        model.addAttribute("title","Champions Page");

        return "champions/index";
    }


}
