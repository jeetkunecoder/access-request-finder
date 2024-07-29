package com.thd.accessrequestfinder.controller;

import com.thd.accessrequestfinder.model.AccessRequest;
import com.thd.accessrequestfinder.service.AccessRequestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/access-request")
public class AccessRequestController {

    private final AccessRequestService service;

    public AccessRequestController(AccessRequestService service) {
        this.service = service;
    }

    @GetMapping(path = "/find/{team-id}")
    public List<AccessRequest> findAccessRequests(@PathVariable("team-id") String teamId) {
        return service.findAll(teamId);
    }
}
