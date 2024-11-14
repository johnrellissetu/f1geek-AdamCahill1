# F1 Geek Design - Version 1

## Student Information

| Field          | Value       |
|----------------|-------------|
| Name           | Adam Cahill |
| Student Number | 20097733    |

## Mindmap - 10%

```mermaid 
mindmap
  root((F1 Geek))
    Drivers
        Number
        History
        Stats
    Teams
        Cars
        History
    Race Tracks
        Track Records
        Track Features
    Seasons
        Races
            Results
            Dates
    Personalisation
        Follow Drivers
    News Feed
        Highlights
        F1 Updates
```

## User Stories - 10%

* As a Formula 1 fan, I want to see a list of drivers so that I can see who is competing in the championship.
* As a Formula 1 fan, I want to see a list of teams so that I can see who is competing in the championship.
* As a Formula 1 fan, I want to drill down into a driver so that I can see more information about them.
* As a Formula 1 fan, I want to drill down into a team so that I can see more information about them, including their drivers.

* As a Formula 1 fan, I want to see a list of circuits so that I can explore the tracks where the races are held.
* As a Formula 1 fan, I want to drill down into a circuit so that I can see more information about it, including its length, location, and previous race results.
* As a Formula 1 fan, I want to view past race results for a selected circuit by year so that I can see the top performers in each season.
* As a Formula 1 fan, I want to search for drivers, teams, or circuits so that I can quickly find the information I'm looking for.
* As a Formula 1 fan, I want a clean and visually appealing header with the F1 logo and app name so that the app feels professional and matches the Formula 1 branding.

## Design - 20%

![img_11.png](img_11.png)

![img_12.png](img_12.png)

## Data Model - 20%

```mermaid
classDiagram
    class Team {
        +String name
    }

    class Driver {
        +String surname
        +String firstName
        +String abbreviatedName
        +Integer number
    }

    class Circuit {
        +String name
        +String country
        +Double length
        +List~Results~ results
    }

    class Results {
        +String year
        +String first
        +String second
        +String third
    }

    Team "1" --> "1" Driver: primaryDriver
    Team "1" --> "1" Driver: secondaryDriver
    Team "1" --> "1..*" Driver: reserveDrivers
    Circuit "1" --> "0..*" Results: results
```

## User Interface - 40%

### Home Page
![img.png](img.png)

### Drivers List
![img_1.png](img_1.png)

### Driver Details
![img_2.png](img_2.png)

### Team List 
![img_3.png](img_3.png)

### Team Details 
![img_4.png](img_4.png)
![img_5.png](img_5.png)
![img_6.png](img_6.png)
![img_7.png](img_7.png)

### Circuit List
![img_8.png](img_8.png)

### Circuit Details
![img_9.png](img_9.png)

### Circuit Results
![img_10.png](img_10.png)