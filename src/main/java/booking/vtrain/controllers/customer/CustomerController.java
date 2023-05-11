package booking.vtrain.controllers.customer;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Customer")
@EnableGlobalMethodSecurity(prePostEnabled = true)
@PreAuthorize("hasRole('ROLE_CUSTOMER')")
public class CustomerController {

    @GetMapping("/search")
    // @AnonymousAllowed
    public String search() {
        // Code to search for train schedules or fares
        return "";
    }

    // @Secured("ROLE_CUSTOMER")

    @GetMapping("/schedules")
    @Secured("ROLE_CUSTOMER")
    public String viewSchedules() {
        // Code to display train schedules
        return "";
    }

    @GetMapping("/search-train")
    @Secured("ROLE_CUSTOMER")
    public String searchTrain() {
        // Code to search for a train
        return "";
    }

    @GetMapping("/book")
    @Secured("ROLE_CUSTOMER")
    public String bookTicket() {
        // Code to book a train ticket
        return "";
    }

    @GetMapping("/booked-tickets")
    @Secured("ROLE_CUSTOMER")
    public String viewBookedTickets() {
        // Code to display booked tickets
        return "";
    }

}
