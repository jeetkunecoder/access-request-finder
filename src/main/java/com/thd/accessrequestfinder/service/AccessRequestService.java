package com.thd.accessrequestfinder.service;

import com.thd.accessrequestfinder.model.AccessRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccessRequestService {

    public List<AccessRequest> findAll() {
        List<AccessRequest> accessRequests = new ArrayList<>();
        AccessRequest accessRequest = AccessRequest.builder()
            .id("1")
            .name("gg_jira_user")
            .description("Provides access to Jira for the LDAP user")
            .build();
        accessRequests.add(accessRequest);

        return accessRequests;
    }
}
