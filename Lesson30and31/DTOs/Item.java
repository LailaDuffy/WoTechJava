package com.datorium.Datorium.API.DTOs;

class Item {
    private String birthDate; // Example fields

    @Override
    public String toString() {
        return this.birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
