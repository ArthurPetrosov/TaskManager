package org.example.TaskManager.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {

    @Test
    public void matchesForSimpleTaskTrue() {
        SimpleTask simpleTask = new SimpleTask(2, "Сделать домашку");
        boolean actual = simpleTask.matches("Сделать");

        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesForSimpleTaskFalse() {
        SimpleTask simpleTask = new SimpleTask(2, "Сделать домашку");
        boolean actual = simpleTask.matches("Сдать");

        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesForMeetingTrueForTopic() {
        Meeting meeting = new Meeting(31, "Сделать визу", "Поездка за границу", "Переезд", "20.04.2023 15:00");
        boolean actual = meeting.matches("Поездка");

        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesForMeetingFalseForTopic() {
        Meeting meeting = new Meeting(31, "Сделать визу", "Поездка за границу", "Переезд", "20.04.2023 15:00");
        boolean actual = meeting.matches("Сдать");

        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesForMeetingTrueForProject() {
        Meeting meeting = new Meeting(31, "Сделать визу", "Поездка за границу", "Переезд", "20.04.2023 15:00");
        boolean actual = meeting.matches("Переезд");

        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void matchesForMeetingFalseForProject() {
        Meeting meeting = new Meeting(31, "Сделать визу", "Поездка за границу", "Переезд", "20.04.2023 15:00");
        boolean actual = meeting.matches("Переход");

        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }
}
