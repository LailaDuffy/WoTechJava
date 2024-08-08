package com.datorium.Datorium.API.DTOs;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ResultItem {
    private String result;

    public void setResult(String result) {
        this.result = result;
    }

    public static String findStarSign(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");
        LocalDate date;

        try {
            date = LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            return "Invalid date format. Please use DD/MM.";
        }

        int dayOfYear = date.getDayOfYear();

        if ((dayOfYear >= LocalDate.of(date.getYear(), 3, 21).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 4, 19).getDayOfYear())) {
            return "Aries";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 4, 20).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 5, 20).getDayOfYear())) {
            return "Taurus";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 5, 21).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 6, 20).getDayOfYear())) {
            return "Gemini";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 6, 21).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 7, 22).getDayOfYear())) {
            return "Cancer";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 7, 23).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 8, 22).getDayOfYear())) {
            return "Leo";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 8, 23).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 9, 22).getDayOfYear())) {
            return "Virgo";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 9, 23).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 10, 22).getDayOfYear())) {
            return "Libra";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 10, 23).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 11, 21).getDayOfYear())) {
            return "Scorpio";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 11, 22).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 12, 21).getDayOfYear())) {
            return "Sagittarius";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 12, 22).getDayOfYear() ||
                dayOfYear <= LocalDate.of(date.getYear(), 1, 19).getDayOfYear())) {
            return "Capricorn";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 1, 20).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 2, 18).getDayOfYear())) {
            return "Aquarius";
        } else if ((dayOfYear >= LocalDate.of(date.getYear(), 2, 19).getDayOfYear() &&
                dayOfYear <= LocalDate.of(date.getYear(), 3, 20).getDayOfYear())) {
            return "Pisces";
        } else {
            return "Invalid date range.";
        }
    }

}
