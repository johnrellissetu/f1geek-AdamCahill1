package com.example.f1geek.model


import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class CircuitTests {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }


    @Test
    fun testCircuitImplementation() {
        val results = listOf(
            Results(year = "2023", first = "Max Verstappen", second = "Sergio Perez", third = "Fernando Alonso"),
            Results(year = "2022", first = "Charles Leclerc", second = "Carlos Sainz", third = "Lewis Hamilton")
        )
        val circuit = Circuit(
            name = "Bahrain International Circuit",
            country = "Bahrain",
            length = 5.412,
            results = results
        )

        assertNotNull(circuit)
        assertEquals( "Bahrain International Circuit", circuit.name)
        assertEquals("Bahrain", circuit.country)
        assertEquals(5.412, circuit.length)
        assertEquals(2, circuit.results.size)
    }
    @Test
    fun getValidResults() {
        val results = listOf(
            Results(year = "2023", first = "Max Verstappen", second = "Sergio Perez", third = "Fernando Alonso"),
            Results(year = "2022", first = "Charles Leclerc", second = "Carlos Sainz", third = "Lewis Hamilton")
        )
        val circuit = Circuit(
            name = "Bahrain International Circuit",
            country = "Bahrain",
            length = 5.412,
            results = results
        )

        assertTrue(circuit.results.isNotEmpty(),"Circuit should have results")
        for (result in circuit.results) {
            assertNotNull(result.year,"Year shouldn't be null")
            assertNotNull(result.first,"First place shouldn't be null")
            assertNotNull(result.second,"Second place shouldn't be null")
            assertNotNull(result.third,"Third place shouldn't be null")
        }
    }

    @Test
    fun testCircuitNoResults() {
        val circuit = Circuit(
            name = "Empty Circuit",
            country = "Unknown",
            length = 0.0,
            results = emptyList()
        )

        assertNotNull(circuit)
        assertTrue(circuit.results.isEmpty(),"Circuit results should be empty")
    }
}