package com.christian.validator.Linea;
import com.fasterxml.jackson.databind.JsonNode;
import java.time.LocalDate;

public class LineaCSV implements Linea{
    private int index;
    private String userID;
    private String firstName;
    private String lastName;
    private String sex;
    private String email;
    private String phone;
    private LocalDate dateOfBirth;
    private  String jobTitle;
    private String type;

    public LineaCSV() {
    }

    public LineaCSV(JsonNode node) {
        this.index = node.get("index").asInt();
        this.userID = node.get("userID").asText();
        this.firstName = node.get("firstName").asText();
        this.lastName = node.get("lastName").asText();
        this.sex = node.get("sex").asText();
        this.email = node.get("email").asText();
        this.phone = node.get("phone").asText();
        this.dateOfBirth = LocalDate.of(node.get("dateOfBirth").get(0).asInt(), node.get("dateOfBirth").get(1).asInt(), node.get("dateOfBirth").get(2).asInt());
        this.jobTitle = node.get("jobTitle").asText();
        this.type="csv";
    }
    public int getIndex() {
        return index;
    }
    public String getUserID() {
        return userID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getSex() {
        return sex;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    @Override
    public String getType() {
        return this.type;
    }
}
