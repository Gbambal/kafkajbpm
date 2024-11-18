package com.jbpm.kafka.model;

public class VehicleData {
    private String vehcileNumber;
    private String status;
    private String message;
    private String tagId;
    private String stageTime;
    private String stageName;
    private String stageCode;

    // Getters and Setters

    public String getVehcileNumber() {
        return vehcileNumber;
    }

    public void setVehcileNumber(String vehcileNumber) {
        this.vehcileNumber = vehcileNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public String getStageTime() {
        return stageTime;
    }

    public void setStageTime(String stageTime) {
        this.stageTime = stageTime;
    }

    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getStageCode() {
        return stageCode;
    }

    public void setStageCode(String stageCode) {
        this.stageCode = stageCode;
    }

    @Override
    public String toString() {
        return "VehicleData{" +
                "vehcileNumber='" + vehcileNumber + '\'' +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", tagId='" + tagId + '\'' +
                ", stageTime='" + stageTime + '\'' +
                ", stageName='" + stageName + '\'' +
                ", stageCode='" + stageCode + '\'' +
                '}';
    }
}
