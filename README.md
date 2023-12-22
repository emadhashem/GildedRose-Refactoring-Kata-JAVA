
#### This project contains my solution to the Gilded Rose refactoring kata. The goal of the kata is to take an existing codebase that models an inventory system for a shop and refactor it to improve various aspects like readability, maintainability and extensibility.

#### The original codebase models a basic shop inventory with a few types of items that change in price and quality each day. However, the code has some duplication and lacks organization, making it difficult to understand and maintain.

#### In my solution, I aimed to refactor the code in a way that:

#### Extracts duplicated logic into well-named methods and classes to reduce redundancy Organizes code into logical modules based on responsibilities (e.g. items, updates) Implements object-oriented principles like abstraction and encapsulation Adds relevant tests to validate functionality and prevent regressions during refactoring Improves readability through consistent formatting, naming and commenting By refactoring incrementally and writing tests along the way, I was able to safely improve the design and structure of the codebase while preserving existing functionality. This makes the system easier to understand and maintain as new requirements are added in the future.

#### Please let me know if you need any clarification or have additional questions! I'd be happy to provide more details on my refactoring approach and solution design.


# Gilded Rose starting position in Java

## Run the TextTest Fixture from Command-Line

```
./gradlew -q text
```

### Specify Number of Days

For e.g. 10 days:

```
./gradlew -q text --args 10
```

You should make sure the gradle commands shown above work when you execute them in a terminal before trying to use TextTest (see below).


## Run the TextTest approval test that comes with this project

There are instructions in the [TextTest Readme](../texttests/README.md) for setting up TextTest. What's unusual for the Java version is there are two executables listed in [config.gr](../texttests/config.gr) for Java. The first uses Gradle wrapped in a python script. Uncomment these lines to use it:

    executable:${TEXTTEST_HOME}/Java/texttest_rig.py
    interpreter:python

The other relies on your CLASSPATH being set correctly in [environment.gr](../texttests/environment.gr). Uncomment these lines to use it instead:

    executable:com.gildedrose.TexttestFixture
    interpreter:java
