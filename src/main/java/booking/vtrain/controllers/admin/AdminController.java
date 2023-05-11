package booking.vtrain.controllers.admin;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableGlobalMethodSecurity(prePostEnabled = true)
@PreAuthorize("hasRole('ADMIN')")

public class AdminController {

    @GetMapping("/manage-stations")
    public String manageStations() {
        // Code to manage train stations
        return "Stations managed";
    }

    @GetMapping("/manage-schedules")
    public String manageSchedules() {
        // Code to manage train schedules
        return "Schedules managed";
    }
}
