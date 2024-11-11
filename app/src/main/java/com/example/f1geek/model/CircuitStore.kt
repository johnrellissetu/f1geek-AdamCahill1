package com.example.f1geek.model

class CircuitStore(val circuits: List<Circuit> = mutableListOf())

fun seedCircuitStore(): CircuitStore{
    val circuitList = mutableListOf(
        Circuit(name = "Bahrain International Circuit", country = "Bahrain", length = 5.412),
        Circuit(name = "Jeddah Corniche Circuit", country = "Saudi Arabia", length = 6.174),
        Circuit(name = "Albert Park Grand Prix Circuit", country = "Australia", length = 5.278),
        Circuit(name = "Suzuka Circuit", country = "Japan", length = 5.807),
        Circuit(name = "Shanghai International Circuit", country = "China", length = 5.451),
        Circuit(name = "Miami International Autodrome", country = "USA", length = 5.412),
        Circuit(name = "Autodromo Internazionale Enzo e Dino Ferrari", country = "Italy", length = 4.909),
        Circuit(name = "Circuit de Monaco", country = "Monaco", length = 3.337),
        Circuit(name = "Circuit Gilles-Villeneuve", country = "Canada", length = 4.361),
        Circuit(name = "Circuit de Barcelona-Catalunya", country = "Spain", length = 4.657),
        Circuit(name = "Red Bull Ring", country = "Austria", length = 4.318),
        Circuit(name = "Silverstone Circuit", country = "England", length = 5.891),
        Circuit(name = "Hungaroring", country = "Hungary", length = 4.381),
        Circuit(name = "Circuit de Spa-Francorchamps", country = "Belgium", length = 7.004),
        Circuit(name = "Circuit Zandvoort", country = "Netherlands", length = 4.259),
        Circuit(name = "Monza", country = "Italy", length = 5.793),
        Circuit(name = "Baku City Circuit", country = "Azerbaijan", length = 6.003),
        Circuit(name = "Marina Bay Street Circuit", country = "Singapore", length = 4.94),
        Circuit(name = "Circuit of The Americas", country = "USA", length = 5.513),
        Circuit(name = "Autódromo Hermanos Rodríguez", country = "Mexico", length = 4.304),
        Circuit(name = "Autódromo José Carlos Pace", country = "Brazil", length = 4.309),
    )

    return CircuitStore(circuitList)
}