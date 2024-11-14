package com.example.f1geek.model

class CircuitStore(val circuits: List<Circuit> = mutableListOf())

fun seedCircuitStore(): CircuitStore {
    val circuitList = mutableListOf(
        Circuit(
            name = "Bahrain International Circuit",
            country = "Bahrain",
            length = 5.412,
            results = listOf(
                Results(year = 2023, first = "Max Verstappen", second = "Sergio Perez", third = "Fernando Alonso"),
                Results(year = 2022, first = "Charles Leclerc", second = "Carlos Sainz", third = "Lewis Hamilton")
            )
        ),
        Circuit(
            name = "Jeddah Corniche Circuit",
            country = "Saudi Arabia",
            length = 6.174,
            results = listOf(
                Results(year = 2023, first = "Sergio Perez", second = "Fernando Alonso", third = "George Russell"),
                Results(year = 2022, first = "Max Verstappen", second = "Charles Leclerc", third = "Lando Norris")
            )
        ),
        Circuit(
            name = "Albert Park Grand Prix Circuit",
            country = "Australia",
            length = 5.278,
            results = listOf(
                Results(year = 2023, first = "Lewis Hamilton", second = "Max Verstappen", third = "Oscar Piastri"),
                Results(year = 2022, first = "George Russell", second = "Carlos Sainz", third = "Fernando Alonso")
            )
        ),
        Circuit(
            name = "Suzuka Circuit",
            country = "Japan",
            length = 5.807,
            results = listOf(
                Results(year = 2023, first = "Fernando Alonso", second = "Charles Leclerc", third = "Lando Norris"),
                Results(year = 2022, first = "Max Verstappen", second = "Sergio Perez", third = "Lewis Hamilton")
            )
        ),
        Circuit(
            name = "Shanghai International Circuit",
            country = "China",
            length = 5.451,
            results = listOf(
                Results(year = 2023, first = "Oscar Piastri", second = "Fernando Alonso", third = "Pierre Gasly"),
                Results(year = 2022, first = "Lewis Hamilton", second = "George Russell", third = "Max Verstappen")
            )
        ),
        Circuit(
            name = "Miami International Autodrome",
            country = "USA",
            length = 5.412,
            results = listOf(
                Results(year = 2023, first = "Lando Norris", second = "Lewis Hamilton", third = "Charles Leclerc"),
                Results(year = 2022, first = "Max Verstappen", second = "Oscar Piastri", third = "Carlos Sainz")
            )
        ),
        Circuit(
            name = "Autodromo Internazionale Enzo e Dino Ferrari",
            country = "Italy",
            length = 4.909,
            results = listOf(
                Results(year = 2023, first = "Charles Leclerc", second = "Lando Norris", third = "George Russell"),
                Results(year = 2022, first = "Lewis Hamilton", second = "Sergio Perez", third = "Fernando Alonso")
            )
        ),
        Circuit(
            name = "Circuit de Monaco",
            country = "Monaco",
            length = 3.337,
            results = listOf(
                Results(year = 2023, first = "Max Verstappen", second = "Lewis Hamilton", third = "Carlos Sainz"),
                Results(year = 2022, first = "Charles Leclerc", second = "George Russell", third = "Oscar Piastri")
            )
        ),
        Circuit(
            name = "Circuit Gilles-Villeneuve",
            country = "Canada",
            length = 4.361,
            results = listOf(
                Results(year = 2023, first = "George Russell", second = "Fernando Alonso", third = "Lewis Hamilton"),
                Results(year = 2022, first = "Max Verstappen", second = "Carlos Sainz", third = "Charles Leclerc")
            )
        ),
        Circuit(
            name = "Circuit de Barcelona-Catalunya",
            country = "Spain",
            length = 4.657,
            results = listOf(
                Results(year = 2023, first = "Carlos Sainz", second = "Charles Leclerc", third = "Fernando Alonso"),
                Results(year = 2022, first = "Lewis Hamilton", second = "Max Verstappen", third = "Sergio Perez")
            )
        ),
        Circuit(
            name = "Red Bull Ring",
            country = "Austria",
            length = 4.318,
            results = listOf(
                Results(year = 2023, first = "Max Verstappen", second = "George Russell", third = "Sergio Perez"),
                Results(year = 2022, first = "Lando Norris", second = "Carlos Sainz", third = "Lewis Hamilton")
            )
        ),
        Circuit(
            name = "Silverstone Circuit",
            country = "England",
            length = 5.891,
            results = listOf(
                Results(year = 2023, first = "George Russell", second = "Charles Leclerc", third = "Oscar Piastri"),
                Results(year = 2022, first = "Max Verstappen", second = "Fernando Alonso", third = "Carlos Sainz")
            )
        ),
        Circuit(
            name = "Hungaroring",
            country = "Hungary",
            length = 4.381,
            results = listOf(
                Results(year = 2023, first = "Charles Leclerc", second = "Lewis Hamilton", third = "George Russell"),
                Results(year = 2022, first = "Fernando Alonso", second = "Carlos Sainz", third = "Max Verstappen")
            )
        ),
        Circuit(
            name = "Circuit de Spa-Francorchamps",
            country = "Belgium",
            length = 7.004,
            results = listOf(
                Results(year = 2023, first = "Oscar Piastri", second = "Sergio Perez", third = "Charles Leclerc"),
                Results(year = 2022, first = "Max Verstappen", second = "George Russell", third = "Lewis Hamilton")
            )
        ),
        Circuit(
            name = "Circuit Zandvoort",
            country = "Netherlands",
            length = 4.259,
            results = listOf(
                Results(year = 2023, first = "Max Verstappen", second = "Charles Leclerc", third = "Oscar Piastri"),
                Results(year = 2022, first = "Fernando Alonso", second = "Lewis Hamilton", third = "Lando Norris")
            )
        ),
        Circuit(
            name = "Monza",
            country = "Italy",
            length = 5.793,
            results = listOf(
                Results(year = 2023, first = "Carlos Sainz", second = "Lando Norris", third = "Sergio Perez"),
                Results(year = 2022, first = "Max Verstappen", second = "George Russell", third = "Lewis Hamilton")
            )
        ),
        Circuit(
            name = "Baku City Circuit",
            country = "Azerbaijan",
            length = 6.003,
            results = listOf(
                Results(year = 2023, first = "Lewis Hamilton", second = "Carlos Sainz", third = "Oscar Piastri"),
                Results(year = 2022, first = "Max Verstappen", second = "Fernando Alonso", third = "Charles Leclerc")
            )
        ),
        Circuit(
            name = "Marina Bay Street Circuit",
            country = "Singapore",
            length = 4.94,
            results = listOf(
                Results(year = 2023, first = "Fernando Alonso", second = "Max Verstappen", third = "Lando Norris"),
                Results(year = 2022, first = "Lewis Hamilton", second = "Sergio Perez", third = "George Russell")
            )
        ),
        Circuit(
            name = "Circuit of The Americas",
            country = "USA",
            length = 5.513,
            results = listOf(
                Results(year = 2023, first = "Max Verstappen", second = "Lando Norris", third = "Oscar Piastri"),
                Results(year = 2022, first = "Carlos Sainz", second = "George Russell", third = "Lewis Hamilton")
            )
        ),
        Circuit(
            name = "Autódromo Hermanos Rodríguez",
            country = "Mexico",
            length = 4.304,
            results = listOf(
                Results(year = 2023, first = "George Russell", second = "Carlos Sainz", third = "Lando Norris"),
                Results(year = 2022, first = "Max Verstappen", second = "Lewis Hamilton", third = "Fernando Alonso")
            )
        ),
        Circuit(
            name = "Autódromo José Carlos Pace",
            country = "Brazil",
            length = 4.309,
            results = listOf(
                Results(year = 2023, first = "Charles Leclerc", second = "Fernando Alonso", third = "George Russell"),
                Results(year = 2022, first = "Max Verstappen", second = "Carlos Sainz", third = "Lando Norris")
            )
        )
    )

    return CircuitStore(circuitList)
}
