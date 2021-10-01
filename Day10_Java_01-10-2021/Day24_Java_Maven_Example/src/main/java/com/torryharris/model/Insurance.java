package com.torryharris.model;

public class Insurance {
    private String insuranceName;
    private int insuranceId;
    private int sum;
    private String insuranceType;

    public Insurance(String insuranceName, int insuranceId, int sum, String insuranceType) {
        this.insuranceName = insuranceName;
        this.insuranceId = insuranceId;
        this.sum = sum;
        this.insuranceType = insuranceType;
    }

    public String getInsuranceName() {
        return insuranceName;
    }

    public void setInsuranceName(String insuranceName) {
        this.insuranceName = insuranceName;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                ", insuranceId=" + insuranceId +
                ", sum=" + sum +
                ", insuranceType='" + insuranceType + '\'' +
                '}';
    }
}
