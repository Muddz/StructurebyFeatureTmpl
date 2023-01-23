# Spring Boot template by features structure


## About


## Why I recommend this structure

Mainly due to how well it scales up and still makes your project readable and understandable of what it does and contains.
I recommend the structure-by-feature approach by default for Java/Spring Boot microservice projects over the structure-by-functionality, unless a project doesn't fit this structure of course. 

Some of reasons for the recommendation:

- All files related to a feature are located within the same package, no need for jumping between serverel packages for working on a feature.
- Deleting a feature is easy, you just delete the feature package and all files related to that feature is gone at once.
- Makes your project easy to navigate and understand what it actually does, even when a project becomes huge.
- Follows naturally the design princip of 'Separation of concerns'.
