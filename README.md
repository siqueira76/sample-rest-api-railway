## Sample RESTfull Api Railway
# Class Diagram

```mermaid
classDiagram
    class User {
        <<Data>>
        -String name
        -Account account
        -List<Feature> features
        -Card card
        -List<News> news
    }

    class Account {
        <<Data>>
        -String number
        -int agency
        -float balance
        -float limit
    }

    class Feature {
        <<Data>>
        -String icon
        -String description
    }

    class Card {
        <<Data>>
        -String number
        -float limit
    }

    class News {
        <<Data>>
        -String icon
        -String description
    }

    User "1" *-- "1" Account
    User "1" *-- "N" Feature
    User "1" *-- "1" Card
    User "1" *-- "N" News

```
