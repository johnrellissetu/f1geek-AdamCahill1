package com.example.f1geek.model

class DriverStore(val drivers: List<Driver> = mutableListOf())

fun seedDriverStore(): DriverStore{
    val driverList = mutableListOf(
        Driver(firstName = "Max", surname = "Verstappen", abbreviatedName = "VER", number = 1),
        Driver(firstName = "Sergio", surname = "Perez", abbreviatedName = "PER", number = 11),
        Driver(firstName = "Charles", surname = "Leclerc", abbreviatedName = "LEC", number = 16),
        Driver(firstName = "Carlos", surname = "Sainz", abbreviatedName = "SAI", number = 55),
        Driver(firstName = "Lewis", surname = "Hamilton", abbreviatedName = "HAM", number = 44),
        Driver(firstName = "George", surname = "Russell", abbreviatedName = "RUS", number = 63),
        Driver(firstName = "Lando", surname = "Norris", abbreviatedName = "NOR", number = 4),
        Driver(firstName = "Oscar", surname = "Piastri", abbreviatedName = "PIA", number = 81),
        Driver(firstName = "Fernando", surname = "Alonso", abbreviatedName = "ALO", number = 14),
        Driver(firstName = "Esteban", surname = "Ocon", abbreviatedName = "OCO", number = 31),
        Driver(firstName = "Pierre", surname = "Gasly", abbreviatedName = "GAS", number = 10),
        Driver(firstName = "Valtteri", surname = "Bottas", abbreviatedName = "BOT", number = 77),
        Driver(firstName = "Zhou", surname = "Guanyu", abbreviatedName = "ZHO", number = 24),
        Driver(firstName = "Kevin", surname = "Magnussen", abbreviatedName = "MAG", number = 20),
        Driver(firstName = "Nico", surname = "Hulkenberg", abbreviatedName = "HUL", number = 27),
        Driver(firstName = "Yuki", surname = "Tsunoda", abbreviatedName = "TSU", number = 22),
        Driver(firstName = "Daniel", surname = "Ricciardo", abbreviatedName = "RIC", number = 3),
        Driver(firstName = "Logan", surname = "Sargeant", abbreviatedName = "SAR", number = 2),
        Driver(firstName = "Alexander", surname = "Albon", abbreviatedName = "ALB", number = 23)
    )

    return DriverStore(driverList)
}