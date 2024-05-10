package org.example.dto;

public class DeviceDto {
    String name;
    int personId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public DeviceDto(String name, int personId) {
        this.name = name;
        this.personId = personId;
    }
}
