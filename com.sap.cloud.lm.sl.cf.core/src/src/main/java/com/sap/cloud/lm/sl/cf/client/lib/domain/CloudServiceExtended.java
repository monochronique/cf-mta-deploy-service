package com.sap.cloud.lm.sl.cf.client.lib.domain;

import java.util.List;
import java.util.Map;

import org.cloudfoundry.client.lib.domain.CloudService;

public class CloudServiceExtended extends CloudService {

    private String resourceName;
    private Map<String, Object> credentials;
    private List<String> tags;
    private boolean isOptional;

    public CloudServiceExtended() {
        super();
    }

    public CloudServiceExtended(Meta meta, String name) {
        super(meta, name);
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public Map<String, Object> getCredentials() {
        return credentials;
    }

    public void setCredentials(Map<String, Object> credentials) {
        this.credentials = credentials;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public boolean isOptional() {
        return isOptional;
    }

    public void setOptional(boolean isOptional) {
        this.isOptional = isOptional;
    }

}
