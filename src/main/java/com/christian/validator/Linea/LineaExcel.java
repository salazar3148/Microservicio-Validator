package com.christian.validator.Linea;
import com.fasterxml.jackson.databind.JsonNode;

public class LineaExcel implements Linea{
    private double date;
    private String injuryLocation;
    private String gender;
    private String ageGroup;
    private String incidentType;
    private double daysLost;
    private String plant;
    private String reportType;
    private String shift;
    private String department;
    private double incidentCost;
    private String wkDay;
    private double month;
    private double year;

    public LineaExcel(){

    }
    public LineaExcel(JsonNode node) {
        this.date = node.get("date").asDouble();
        this.injuryLocation = node.get("injuryLocation").asText();
        this.gender = node.get("gender").asText();
        this.ageGroup = node.get("ageGroup").asText();
        this.incidentType = node.get("incidentType").asText();
        this.daysLost = node.get("daysLost").asDouble();
        this.plant = node.get("plant").asText();
        this.reportType = node.get("reportType").asText();
        this.shift = node.get("shift").asText();
        this.department = node.get("department").asText();
        this.incidentCost = node.get("incidentCost").asDouble();
        this.wkDay = node.get("wkDay").asText();
        this.month = node.get("month").asDouble();
        this.year = node.get("gender").asDouble();

    }

    public double getDate() {
        return date;
    }

    public String getInjuryLocation() {
        return injuryLocation;
    }

    public String getGender() {
        return gender;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getIncidentType() {
        return incidentType;
    }

    public double getDaysLost() {
        return daysLost;
    }

    public String getPlant() {
        return plant;
    }

    public String getReportType() {
        return reportType;
    }

    public String getShift() {
        return shift;
    }

    public String getDepartment() {
        return department;
    }

    public double getIncidentCost() {
        return incidentCost;
    }

    public String getWkDay() {
        return wkDay;
    }

    public double getMonth() {
        return month;
    }

    public double getYear() {
        return year;
    }

    @Override
    public String getType() {
        return "xlsx";
    }


}
