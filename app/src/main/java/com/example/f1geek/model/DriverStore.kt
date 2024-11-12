package com.example.f1geek.model

// All images for drivers were taken from the F1 official website https://www.formula1.com/en/drivers

class DriverStore(val drivers: List<Driver> = mutableListOf())

fun seedDriverStore(): DriverStore{
    val driverList = mutableListOf(
        Driver(firstName = "Max", surname = "Verstappen", abbreviatedName = "VER", number = 1, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/M/MAXVER01_Max_Verstappen/maxver01.png"),
        Driver(firstName = "Sergio", surname = "Perez", abbreviatedName = "PER", number = 11, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/S/SERPER01_Sergio_Perez/serper01.png"),
        Driver(firstName = "Charles", surname = "Leclerc", abbreviatedName = "LEC", number = 16, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CHALEC01_Charles_Leclerc/chalec01.png"),
        Driver(firstName = "Carlos", surname = "Sainz", abbreviatedName = "SAI", number = 55, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/C/CARSAI01_Carlos_Sainz/carsai01.png"),
        Driver(firstName = "Lewis", surname = "Hamilton", abbreviatedName = "HAM", number = 44, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LEWHAM01_Lewis_Hamilton/lewham01.png"),
        Driver(firstName = "George", surname = "Russell", abbreviatedName = "RUS", number = 63, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GEORUS01_George_Russell/georus01.png"),
        Driver(firstName = "Lando", surname = "Norris", abbreviatedName = "NOR", number = 4, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LANNOR01_Lando_Norris/lannor01.png"),
        Driver(firstName = "Oscar", surname = "Piastri", abbreviatedName = "PIA", number = 81, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/O/OSCPIA01_Oscar_Piastri/oscpia01.png"),
        Driver(firstName = "Fernando", surname = "Alonso", abbreviatedName = "ALO", number = 14, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/F/FERALO01_Fernando_Alonso/feralo01.png"),
        Driver(firstName = "Lance", surname = "Stroll", abbreviatedName = "STR", number = 18, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LANSTR01_Lance_Stroll/lanstr01.png"),
        Driver(firstName = "Esteban", surname = "Ocon", abbreviatedName = "OCO", number = 31, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/E/ESTOCO01_Esteban_Ocon/estoco01.png"),
        Driver(firstName = "Pierre", surname = "Gasly", abbreviatedName = "GAS", number = 10, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/P/PIEGAS01_Pierre_Gasly/piegas01.png"),
        Driver(firstName = "Valtteri", surname = "Bottas", abbreviatedName = "BOT", number = 77, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/V/VALBOT01_Valtteri_Bottas/valbot01.png"),
        Driver(firstName = "Zhou", surname = "Guanyu", abbreviatedName = "ZHO", number = 24, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/G/GUAZHO01_Guanyu_Zhou/guazho01.png"),
        Driver(firstName = "Kevin", surname = "Magnussen", abbreviatedName = "MAG", number = 20, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/K/KEVMAG01_Kevin_Magnussen/kevmag01.png"),
        Driver(firstName = "Nico", surname = "Hulkenberg", abbreviatedName = "HUL", number = 27, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/N/NICHUL01_Nico_Hulkenberg/nichul01.png"),
        Driver(firstName = "Yuki", surname = "Tsunoda", abbreviatedName = "TSU", number = 22, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/Y/YUKTSU01_Yuki_Tsunoda/yuktsu01.png"),
        Driver(firstName = "Daniel", surname = "Ricciardo", abbreviatedName = "RIC", number = 3, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/D/DANRIC01_Daniel_Ricciardo/danric01.png"),
        Driver(firstName = "Logan", surname = "Sargeant", abbreviatedName = "SAR", number = 2, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/L/LOGSAR01_Logan_Sargeant/logsar01.png"),
        Driver(firstName = "Alexander", surname = "Albon", abbreviatedName = "ALB", number = 23, image = "https://media.formula1.com/d_driver_fallback_image.png/content/dam/fom-website/drivers/A/ALEALB01_Alexander_Albon/alealb01.png")
    )

    return DriverStore(driverList)
}