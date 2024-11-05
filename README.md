# F1Geek

## Introduction

Source for the F1Geek android app.

## Student Information

Hello

| Field          | Value       |
|----------------|-------------|
| Name           | Adam Cahill |
| Student Number | 20097733    |

## Initial Data Model

```mermaid
classDiagram
    Team "1" --> "1" Driver: primaryDriver
    Team "1" --> "1" Driver: secondaryDriver
    Team "1" --> "1..*" Driver: reserveDrivers
    class Driver{
      +String surname
      +String firstName
      +String abbreviatedName
      +Integer number
    }
    class Team{
      +String name
    }
```