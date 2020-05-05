/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizut.tpsi.lab9;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Treetacle
 */
@Controller
public class HomeController {
    
    @Autowired
    BlogRepository blog;

    @RequestMapping("/")
    public String home(Model model) throws SQLException {

        model.addAttribute("Lista", blog.getAllPosts());

        return "home";
    }

    @PostMapping("/newpost")
    public String newPost(BlogPost post) throws SQLException {
        blog.createPost(post);
        return "redirect:/";
    }

    @RequestMapping("/delete_{id}")
    public String delPost(@PathVariable String id) throws SQLException {
        blog.deletePost(id);
        return "redirect:/";
    }
}
