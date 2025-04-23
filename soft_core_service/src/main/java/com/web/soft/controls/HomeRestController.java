package com.web.soft.controls;

import com.web.soft.response.GlobalResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("home")
@CrossOrigin(origins = "*")
public class HomeRestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "list")
    public String list() {
        logger.info("list");
        logger.warn("list");
        logger.error("list");
        logger.debug("list");
        logger.trace("list");

        return "list";
    }

    @Operation(summary = "Get employee by ID", description = "Fetches the employee details based on the employee ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved employee"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @GetMapping("/developers")
    public String getAllAvailableDevelopers(@Parameter(description = "ID of the employee to be fetched") @RequestParam Long id) {
        // Your logic to fetch the employee by ID
        return "";
    }

    @GetMapping("/services")
    public String getAllServices(@Parameter(description = "ID of the employee to be fetched") @RequestParam Long id) {
        // Your logic to fetch the employee by ID
        return "";
    }

    @GetMapping("/projects")
    public String getDevelopedProjects(@Parameter(description = "ID of the employee to be fetched") @RequestParam Long id) {
        // Your logic to fetch the employee by ID
        return "";
    }

    @GetMapping("/trainings")
    public String getAvailableTrainings(@Parameter(description = "ID of the employee to be fetched") @RequestParam Long id) {
        // Your logic to fetch the employee by ID
        return "";
    }

    @GetMapping("/internships")
    public String getAllInternships(@Parameter(description = "ID of the employee to be fetched") @RequestParam Long id) {
        // Your logic to fetch the employee by ID
        return "";
    }

   /* @PostMapping("schedule")
    public GlobalResponse scheduleTrain(@RequestBody ScheduleNewTrainDTO dto) {
        String username = "admin";
        ScheduleTrainDto scheduleTrainDto = scheduleService.scheduleTrain(dto, username);

        return ResponseHandler.generateResponse(
                String.format(CommonConstants.TRAIN_SCHEDULE_SUCCESS,
                        scheduleTrainDto.trainName()), HttpStatus.BAD_REQUEST, scheduleTrainDto);
    }*/
}
