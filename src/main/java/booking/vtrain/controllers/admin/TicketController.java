package booking.vtrain.controllers.admin;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/ticket")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class TicketController {

    @GetMapping("/sales")
    public String viewSales() {
        // Code to display ticket sales
        return "";
    }

    @GetMapping("/management")
    public String manageTickets() {
        // Code to manage tickets
        return "";
    }
}
