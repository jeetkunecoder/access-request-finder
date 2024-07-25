package com.thd.accessrequestfinder.controller;

import com.thd.accessrequestfinder.model.AccessRequest;
import com.thd.accessrequestfinder.service.AccessRequestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("v1/access-request")
public class AccessRequestController {

    private final AccessRequestService service;

    public AccessRequestController(AccessRequestService service) {
        this.service = service;
    }

    @GetMapping("/find")
    public List<AccessRequest> findAccessRequests(String team) {
        return service.findAll();
    }
}
