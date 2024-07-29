package com.thd.accessrequestfinder.service;

import com.thd.accessrequestfinder.model.AccessRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccessRequestService {

    private static final Logger log = LoggerFactory.getLogger(AccessRequestService.class);

    public List<AccessRequest> findAll(String teamId) {
        log.info("Finding all access requests");
        List<AccessRequest> accessRequests = new ArrayList<>();
        AccessRequest accessRequest = AccessRequest.builder()
            .id("1")
            .name("gg_jira_user")
            .description("Provides access to Jira for the LDAP user")
            .teamId(teamId)
            .build();
        accessRequests.add(accessRequest);

        return accessRequests;
    }
}
