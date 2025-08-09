package com.mkp.tickpilot.platform.model;

import java.time.Instant;
import java.util.UUID;

import com.mkp.tickpilot.platform.util.Constants;

public class ProjectDto {

    private UUID id;

    private String name;

    private String description;

    private Constants.ProjectStatus status;
    
    private EmployeeDto createdBy;

    private Instant startDate;

    private Instant endDate;

    private Instant createdAt;

    private Instant modifiedAt;

    public UUID getId() {
        return this.id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Constants.ProjectStatus getStatus() {
        return this.status;
    }

    public void setStatus(Constants.ProjectStatus status) {
        this.status = status;
    }

    public EmployeeDto getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(EmployeeDto createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Instant startDate) {
        this.startDate = startDate;
    }

    public Instant getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Instant endDate) {
        this.endDate = endDate;
    }

    public Instant getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getModifiedAt() {
        return this.modifiedAt;
    }

    public void setModifiedAt(Instant modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

}
