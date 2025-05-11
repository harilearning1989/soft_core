package com.web.soft.controls;

import com.web.soft.constants.CommonConstants;
import com.web.soft.records.Contact;
import com.web.soft.response.*;
import com.web.soft.services.DeveloperService;
import com.web.soft.services.ProjectService;
import com.web.soft.services.ServicesService;
import com.web.soft.services.TrainingService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("home")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class HomeRestController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final DeveloperService developerService;
    private final ServicesService servicesService;
    private final ProjectService projectsService;
    private final TrainingService trainingsService;

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
    public GlobalResponse getAllAvailableDevelopers() {
        List<DeveloperDTO> developerDTOS = developerService.getAllAvailableDevelopers();

        return ResponseHandler.generateResponse(
                String.format(CommonConstants.SERVICES_SUCCESS), HttpStatus.OK, developerDTOS);
    }

    @Operation(summary = "Get All Services", description = "Fetches all the services")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved services"),
            @ApiResponse(responseCode = "404", description = "services are not found")
    })
    @GetMapping("/services")
    public GlobalResponse getAllServices() {
        List<ServiceDTO> serviceDTOList = servicesService.getAllServiceDTOs();

        return ResponseHandler.generateResponse(
                String.format(CommonConstants.SERVICES_SUCCESS), HttpStatus.OK, serviceDTOList);
    }

    @Operation(summary = "Get All Projects", description = "Fetches all the Projects")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successfully retrieved Projects"),
            @ApiResponse(responseCode = "404", description = "Projects are not found")
    })
    @GetMapping("/projects")
    public GlobalResponse getAllProjects() {
        List<ProjectsDTO> projectsDTOList = projectsService.getAllProjectsDTOs();

        return ResponseHandler.generateResponse(
                String.format(CommonConstants.SERVICES_SUCCESS), HttpStatus.OK, projectsDTOList);
    }

    @GetMapping("/trainings")
    public GlobalResponse getAvailableTrainings() {
        List<Trainings> projectsDTOList = projectsService.getAllProjectsDTOs();

        return ResponseHandler.generateResponse(
                String.format(CommonConstants.SERVICES_SUCCESS), HttpStatus.OK, projectsDTOList);
    }

    @GetMapping("/internships")
    public String getAllInternships(@Parameter(description = "ID of the employee to be fetched") @RequestParam Long id) {
        // Your logic to fetch the employee by ID
        return "";
    }

    @PostMapping("saveContact")
    public ResponseEntity<String> createUser(@Valid @RequestBody Contact contact) {
        return ResponseEntity.ok("User created with name: " + contact.name());
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
