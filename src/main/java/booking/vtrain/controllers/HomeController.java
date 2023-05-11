package booking.vtrain.controllers;

import booking.vtrain.models.User;
import booking.vtrain.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private UserService userService; // assuming you have implemented a UserService to manage users

    @GetMapping("/")
    public String home(Model model) {
        return "home";
    }

    @GetMapping("/lookup")
    public String lookup(Model model) {
        // add model attributes if needed
        return "lookup";
    }

    @GetMapping("/booking")
    public String booking(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth.isAuthenticated()) {
            User user = userService.findByUsername(auth.getName());
            model.addAttribute("user", user);
            // add model attributes if needed
            return "booking";
        } else {
            return "redirect:/login";
        }
    }

    @GetMapping("/about")
    public String about(Model model) {
        // add model attributes if needed
        return "about";
    }

    @GetMapping("/login")
    public String login(Model model) {
        // add model attributes if needed
        return "login";
    }
}