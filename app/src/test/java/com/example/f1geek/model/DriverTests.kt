package com.example.f1geek.model


import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class DriverTests {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun getFirstName() {
        val driver = Driver("Charles", "LeClerc", "LEC",16, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png")
        assertEquals("Charles", driver.firstName)
    }

    @Test
    fun getSurname() {
        val driver = Driver("Charles", "LeClerc", "LEC",16, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png")
        assertEquals("LeClerc", driver.surname)
    }

    @Test
    fun getAbbreviatedName() {
        val driver = Driver("Charles", "LeClerc", "LEC",16, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png")
        assertEquals("LEC", driver.abbreviatedName)
    }

    @Test
    fun getNumber() {
        val driver = Driver("Charles", "LeClerc", "LEC",16, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png")
        assertEquals(16, driver.number)
    }

    @Test
    fun getValidFirstName() {
        val driver = Driver("Charles", "LeClerc", "LEC",16, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png")
        assertNotNull(driver.firstName,"First name shouldn't be null")
    }

    @Test
    fun getValidNumber() {
        val driver = Driver("Charles", "LeClerc", "LEC",16, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png")
        assertNotNull(driver.number,"Number shouldn't be null")
    }
}