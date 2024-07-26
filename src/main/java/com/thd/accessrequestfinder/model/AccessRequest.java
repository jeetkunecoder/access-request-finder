package com.thd.accessrequestfinder.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccessRequest {

    private final String id;
    private final String name;
    private final String description;

}
