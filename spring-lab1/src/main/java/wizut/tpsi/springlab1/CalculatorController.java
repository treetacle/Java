/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.springlab1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Treetacle
 */
@Controller
public class CalculatorController {



@RequestMapping("/cal_zad1")
public String cal_zad1(Model model, Integer x1, Integer y1) {
    int w1 = x1 + y1;
    model.addAttribute("x1", x1);
    model.addAttribute("y1", y1);
    model.addAttribute("w1", w1);

    return "cal_zad1";
}    
@RequestMapping("/cal_zad2")
public String cal_zad2(Model model, Double x2, Double y2, String opt2) {
    double w2 = 0;
    if(opt2.equals("+")) w2 = x2 + y2;
    if(opt2.equals("-")) w2 = x2 - y2;
    if(opt2.equals("*")) w2 = x2 * y2;
    if(opt2.equals("/")) w2 = x2 / y2;
    
    model.addAttribute("opt2", opt2);
    model.addAttribute("x2", x2);
    model.addAttribute("y2", y2);
    model.addAttribute("w2", w2);

    return "cal_zad2";
}   

    @RequestMapping("/cal_zad3")
    public String cal_zad3(Model model, CalculatorForm cal3) {
        
    model.addAttribute("cal3", cal3);
    
    return "cal_zad3";
        
    }
}
