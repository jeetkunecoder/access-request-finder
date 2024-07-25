package com.thd.accessrequestfinder.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccessRequest {

    String id;
    String name;
    String description;

}
