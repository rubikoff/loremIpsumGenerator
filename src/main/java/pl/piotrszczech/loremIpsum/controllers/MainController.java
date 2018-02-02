package pl.piotrszczech.loremIpsum.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.piotrszczech.loremIpsum.Logika;


@Controller
public class MainController {

    @GetMapping("/")
    public String index(){return "index";}

    @PostMapping("/")
    public String index2(@RequestParam("lorem") String lorem,
                         @RequestParam("radio") String radio,
                         @RequestParam("number") int number,
                         Model model){

        String result = Logika.kalkuluj(lorem, radio, number);
        model.addAttribute("message", result);
            return "index";
        }

}

