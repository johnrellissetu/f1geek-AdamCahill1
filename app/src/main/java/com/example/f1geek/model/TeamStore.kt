package com.example.f1geek.model

// Image url for blank profile is being used from pixabay, Creator of the image is WandererCreative, https://pixabay.com/vectors/blank-profile-picture-mystery-man-973460/

class TeamStore(val teams: List<Team> = mutableListOf())

fun seedTeamStore(): TeamStore{
    val teamList = mutableListOf(
        Team(
            name = "Red Bull Racing",
            primaryDriver = Driver(firstName = "Max", surname = "Verstappen", abbreviatedName = "VER", number = 1, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png"),
            secondaryDriver = Driver(firstName = "Sergio", surname = "Perez", abbreviatedName = "PER", number = 11, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/S/SERPER01_Sergio_Perez/serper01.png"),
            reserveDrivers = listOf(
                Driver(firstName = "Liam", surname = "Lawson", abbreviatedName = "LAW", number = 40, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LIALAW01_Liam_Lawson/lialaw01.png")
            )
        ),
        Team(
            name = "Ferrari",
            primaryDriver = Driver(firstName = "Charles", surname = "Leclerc", abbreviatedName = "LEC", number = 16, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png"),
            secondaryDriver = Driver(firstName = "Carlos", surname = "Sainz", abbreviatedName = "SAI", number = 55, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CARSAI01_Carlos_Sainz/carsai01.png"),
            reserveDrivers = listOf(
                Driver(firstName = "Robert", surname = "Shwartzman", abbreviatedName = "SHW", number = 39, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
                Driver(firstName = "Oliver", surname = "Bearman", abbreviatedName = "BEA", number = 50, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/O/OLIBEA01_Oliver_Bearman/olibea01.png"),
                Driver(firstName = "Antonio", surname = "Giovinazzi", abbreviatedName = "GIO", number = 99, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png")
            )
        ),
        Team(
            name = "Mercedes",
            primaryDriver = Driver(firstName = "Lewis", surname = "Hamilton", abbreviatedName = "HAM", number = 44, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LEWHAM01_Lewis_Hamilton/lewham01.png"),
            secondaryDriver = Driver(firstName = "George", surname = "Russell", abbreviatedName = "RUS", number = 63, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GEORUS01_George_Russell/georus01.png"),
            reserveDrivers = listOf(
                Driver(firstName = "Mick", surname = "Schumacher", abbreviatedName = "MSC", number = 47, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
                Driver(firstName = "Frederik", surname = "Vesti", abbreviatedName = "VES", number = 47, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png")
            )
        ),
        Team(
            name = "McLaren",
            primaryDriver = Driver(firstName = "Lando", surname = "Norris", abbreviatedName = "NOR", number = 4, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LANNOR01_Lando_Norris/lannor01.png"),
            secondaryDriver = Driver(firstName = "Oscar", surname = "Piastri", abbreviatedName = "PIA", number = 81, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/O/OSCPIA01_Oscar_Piastri/oscpia01.png"),
            reserveDrivers = listOf(
                Driver(firstName = "Ryo", surname = "Hirakawa", abbreviatedName = "HIR", number = 8, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png"),
                Driver(firstName = "Pato", surname = "O’Ward", abbreviatedName = "WAR", number = 5, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png")
            )
        ),
        Team(
            name = "Aston Martin",
            primaryDriver = Driver(firstName = "Fernando", surname = "Alonso", abbreviatedName = "ALO", number = 14, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/F/FERALO01_Fernando_Alonso/feralo01.png"),
            secondaryDriver = Driver(firstName = "Lance", surname = "Stroll", abbreviatedName = "STR", number = 18, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LANSTR01_Lance_Stroll/lanstr01.png"),
            reserveDrivers = listOf(
                Driver(firstName = "Felipe", surname = "Drugovich", abbreviatedName = "DRU", number = 51, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png")
            )
        ),
        Team(
            name = "Alpine",
            primaryDriver = Driver(firstName = "Esteban", surname = "Ocon", abbreviatedName = "OCO", number = 31, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/E/ESTOCO01_Esteban_Ocon/estoco01.png"),
            secondaryDriver = Driver(firstName = "Pierre", surname = "Gasly", abbreviatedName = "GAS", number = 10, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/P/PIEGAS01_Pierre_Gasly/piegas01.png"),
            reserveDrivers = listOf(
                Driver(firstName = "Jack", surname = "Doohan", abbreviatedName = "DOO", number = 88, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png")
            )
        ),
        Team(
            name = "Stake F1",
            primaryDriver = Driver(firstName = "Valtteri", surname = "Bottas", abbreviatedName = "BOT", number = 77, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/V/VALBOT01_Valtteri_Bottas/valbot01.png"),
            secondaryDriver = Driver(firstName = "Zhou", surname = "Guanyu", abbreviatedName = "ZHO", number = 24, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GUAZHO01_Guanyu_Zhou/guazho01.png"),
            reserveDrivers = listOf(
                Driver(firstName = "Theo", surname = "Pourchaire", abbreviatedName = "POU", number = 98, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png")
            )
        ),
        Team(
            name = "Haas",
            primaryDriver = Driver(firstName = "Kevin", surname = "Magnussen", abbreviatedName = "MAG", number = 20, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/K/KEVMAG01_Kevin_Magnussen/kevmag01.png"),
            secondaryDriver = Driver(firstName = "Nico", surname = "Hulkenberg", abbreviatedName = "HUL", number = 27, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/N/NICHUL01_Nico_Hulkenberg/nichul01.png"),
            reserveDrivers = listOf(
                Driver(firstName = "Pietro", surname = "Fittipaldi", abbreviatedName = "FIT", number = 51, image = "https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png")
            )
        ),
        Team(
            name = "Visa Cash App RB",
            primaryDriver = Driver(firstName = "Yuki", surname = "Tsunoda", abbreviatedName = "TSU", number = 22, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/Y/YUKTSU01_Yuki_Tsunoda/yuktsu01.png"),
            secondaryDriver = Driver(firstName = "Daniel", surname = "Ricciardo", abbreviatedName = "RIC", number = 3, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/D/DANRIC01_Daniel_Ricciardo/danric01.png"),
            reserveDrivers = listOf(

            )
        ),
        Team(
            name = "Williams",
            primaryDriver = Driver(firstName = "Alexander", surname = "Albon", abbreviatedName = "ALB", number = 23, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/A/ALEALB01_Alexander_Albon/alealb01.png"),
            secondaryDriver = Driver(firstName = "Logan", surname = "Sargeant", abbreviatedName = "SAR", number = 2, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LOGSAR01_Logan_Sargeant/logsar01.png"),
            reserveDrivers = listOf(

            )
        )
    )

    return TeamStore(teamList)
}