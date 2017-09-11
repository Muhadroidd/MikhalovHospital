package model;


public class Patient {
    private String name;
    private String timeOfVisit;
    private String description;

    public Patient(String name, String timeOfVisit, String description) {
        this.name = name;
        this.timeOfVisit = timeOfVisit;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getTimeOfVisit() {
        return timeOfVisit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeOfVisit(String timeOfVisit) {
        this.timeOfVisit = timeOfVisit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Patient" +
                "name=" + name + '\'' +
                ", timeOfVisit='" + timeOfVisit + '\'' +
                ", description='" + description + '\'' ;
    }
}
