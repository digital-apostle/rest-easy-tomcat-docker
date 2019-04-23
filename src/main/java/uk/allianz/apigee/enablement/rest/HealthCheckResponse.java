package uk.allianz.apigee.enablement.rest;

public class HealthCheckResponse {

    final static String PASS = "healthy";
    final static String FAIL = "unhealthy";
    final static String WARN = "healthy with some concerns";

    String serviceStatus;
    String version;
    String releaseId;
    String error_desription;
    String description;

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId;
    }

    public String getError_desription() {
        return error_desription;
    }

    public void setError_desription(String error_desription) {
        this.error_desription = error_desription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
