package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();
        person.setName("");
        person.setAge(Integer.MAX_VALUE);

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAndGetGender() {
        Person peter = new Person();
        peter.setGender("male");

        String expectedGender = "male";

        Assert.assertEquals(expectedGender, peter.getGender());
    }

    @Test
    public void testSetAndGetDOB() {
        Person peter = new Person();
        Date date = new Date(04/24/1995);
        peter.setDateOfBirth(date);

        Assert.assertEquals(date, peter.getDateOfBirth());
    }

    @Test
    public void testSetAndGetHairColor() {
        Person peter = new Person();
        peter.setHairColor("red");

        String expectedHairColor = "red";

        Assert.assertEquals(expectedHairColor, peter.getHairColor());
    }

    @Test
    public void testSetAndGetFavoriteFood() {
        Person peter = new Person();
        peter.setFavoriteFood("ravioli");

        String expectedFavoriteFood = "ravioli";

        Assert.assertEquals(expectedFavoriteFood, peter.getFavoriteFood());
    }

    @Test
    public void testSetAndGetShoeSize() {
        Person peter = new Person();
        peter.setShoeSize(11f);

        float expectedShoeSize = 11f;

        Assert.assertEquals(expectedShoeSize, peter.getShoeSize(), .000001);
    }
}
