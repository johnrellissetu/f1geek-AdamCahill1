package com.example.f1geek.model

class TeamStore(val teams: List<Team> = mutableListOf())

fun seedTeamStore(): TeamStore{
    val teamList = mutableListOf(
        Team(
            name = "Red Bull Racing",
            primaryDriver = Driver(firstName = "Max", surname = "Verstappen", abbreviatedName = "VER", number = 1),
            secondaryDriver = Driver(firstName = "Sergio", surname = "Perez", abbreviatedName = "PER", number = 11),
            reserveDrivers = listOf(
                Driver(firstName = "Liam", surname = "Lawson", abbreviatedName = "LAW", number = 40)
            )
        ),
        Team(
            name = "Ferrari",
            primaryDriver = Driver(firstName = "Charles", surname = "Leclerc", abbreviatedName = "LEC", number = 16),
            secondaryDriver = Driver(firstName = "Carlos", surname = "Sainz", abbreviatedName = "SAI", number = 55),
            reserveDrivers = listOf(
                Driver(firstName = "Robert", surname = "Shwartzman", abbreviatedName = "SHW", number = 39),
                Driver(firstName = "Oliver", surname = "Bearman", abbreviatedName = "BEA", number = 50),
                Driver(firstName = "Antonio", surname = "Giovinazzi", abbreviatedName = "GIO", number = 99)
            )
        ),
        Team(
            name = "Mercedes",
            primaryDriver = Driver(firstName = "Lewis", surname = "Hamilton", abbreviatedName = "HAM", number = 44),
            secondaryDriver = Driver(firstName = "George", surname = "Russell", abbreviatedName = "RUS", number = 63),
            reserveDrivers = listOf(
                Driver(firstName = "Mick", surname = "Schumacher", abbreviatedName = "MSC", number = 47),
                Driver(firstName = "Frederik", surname = "Vesti", abbreviatedName = "VES", number = 47)
            )
        ),
        Team(
            name = "McLaren",
            primaryDriver = Driver(firstName = "Lando", surname = "Norris", abbreviatedName = "NOR", number = 4),
            secondaryDriver = Driver(firstName = "Oscar", surname = "Piastri", abbreviatedName = "PIA", number = 81),
            reserveDrivers = listOf(
                Driver(firstName = "Ryo", surname = "Hirakawa", abbreviatedName = "HIR", number = 8),
                Driver(firstName = "Pato", surname = "O’Ward", abbreviatedName = "WAR", number = 5)
            )
        ),
        Team(
            name = "Aston Martin",
            primaryDriver = Driver(firstName = "Fernando", surname = "Alonso", abbreviatedName = "ALO", number = 14),
            secondaryDriver = Driver(firstName = "Lance", surname = "Stroll", abbreviatedName = "STR", number = 18),
            reserveDrivers = listOf(
                Driver(firstName = "Felipe", surname = "Drugovich", abbreviatedName = "DRU", number = 51)
            )
        ),
        Team(
            name = "Alpine",
            primaryDriver = Driver(firstName = "Esteban", surname = "Ocon", abbreviatedName = "OCO", number = 31),
            secondaryDriver = Driver(firstName = "Pierre", surname = "Gasly", abbreviatedName = "GAS", number = 10),
            reserveDrivers = listOf(
                Driver(firstName = "Jack", surname = "Doohan", abbreviatedName = "DOO", number = 88)
            )
        ),
        Team(
            name = "Stake F1",
            primaryDriver = Driver(firstName = "Valtteri", surname = "Bottas", abbreviatedName = "BOT", number = 77),
            secondaryDriver = Driver(firstName = "Zhou", surname = "Guanyu", abbreviatedName = "ZHO", number = 24),
            reserveDrivers = listOf(
                Driver(firstName = "Theo", surname = "Pourchaire", abbreviatedName = "POU", number = 98)
            )
        ),
        Team(
            name = "Haas",
            primaryDriver = Driver(firstName = "Kevin", surname = "Magnussen", abbreviatedName = "MAG", number = 20),
            secondaryDriver = Driver(firstName = "Nico", surname = "Hulkenberg", abbreviatedName = "HUL", number = 27),
            reserveDrivers = listOf(
                Driver(firstName = "Pietro", surname = "Fittipaldi", abbreviatedName = "FIT", number = 51)
            )
        ),
        Team(
            name = "Visa Cash App RB",
            primaryDriver = Driver(firstName = "Yuki", surname = "Tsunoda", abbreviatedName = "TSU", number = 22),
            secondaryDriver = Driver(firstName = "Daniel", surname = "Ricciardo", abbreviatedName = "RIC", number = 3),
            reserveDrivers = listOf(

            )
        ),
        Team(
            name = "Williams",
            primaryDriver = Driver(firstName = "Alexander", surname = "Albon", abbreviatedName = "ALB", number = 23),
            secondaryDriver = Driver(firstName = "Logan", surname = "Sargeant", abbreviatedName = "SAR", number = 2),
            reserveDrivers = listOf(

            )
        )
    )

    return TeamStore(teamList)
}