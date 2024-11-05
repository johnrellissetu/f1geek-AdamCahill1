package com.example.f1geek.model

import com.example.f1geek.model.Driver
import com.example.f1geek.model.Team
import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TeamTests {

    @Test
    fun getName() {
        val charles = Driver(firstName = "Charles", surname = "LeClerc", abbreviatedName = "LEC", number = 16)
        val carlos = Driver(firstName = "Carlos", surname = "Sainz", abbreviatedName = "SAI", number = 55)
        val team = Team(name = "Ferrari", charles, carlos, mutableListOf())

        assertEquals("Ferrari", team.name)
    }

    @Test
    fun getPrimaryDriver() {
        val charles = Driver(firstName = "Charles", surname = "LeClerc", abbreviatedName = "LEC", number = 16)
        val carlos = Driver(firstName = "Carlos", surname = "Sainz", abbreviatedName = "SAI", number = 55)
        val team = Team(name = "Ferrari", charles, carlos, mutableListOf())

        assertEquals(charles, team.primaryDriver)
    }

    @Test
    fun getSecondaryDriver() {
        val charles = Driver("Charles", "LeClerc", "LEC", 16)
        val carlos = Driver("Carlos", "Sainz", "SAI", 55)
        val team = Team("Ferrari", charles, carlos, mutableListOf())

        assertEquals(carlos, team.secondaryDriver)
    }

    @Test
    fun getReserveDrivers() {
        val charles = Driver(firstName = "Charles", surname = "LeClerc", abbreviatedName = "LEC", number = 16)
        val carlos = Driver(firstName = "Carlos", surname = "Sainz", abbreviatedName = "SAI", number = 55)
        val team = Team(name = "Ferrari", charles, carlos, mutableListOf())

        assertEquals(team.reserveDrivers, mutableListOf<Driver>())
    }

    @Test
    fun setPrimaryAndSecondaryDriverToSameDriver() {
        val charles = Driver("Charles", "LeClerc", "LEC", 16)
        assertThrows<IllegalStateException> {
            Team("Ferrari", charles, charles, mutableListOf())
        }
    }
}