# Spring Boot template by features structure


## About


## Why I recommend this structure

I strongly recommend the structure-by-feature approach by default for Java/Spring Boot microservice projects over the structure-by-functionality. The biggest reason is due to ease of navigation and readability, an often forgotten art in the fast paced world of software development nowadays. The sacrifice of readibility for "just getting it out" will later cost you a lot of valuable time when you suddenly need to refactor a project to scale it big or when you need to find and fix a critical bug or handover the project over to colleagues who never worked on it. 

The reasons for the recommendation:

- Its super easy to understand a project and what it does with this structure.
- All files related to a particular feature are located within the same package.
- Deleting a feature is easy, you just delete the feature package and all files related to that feature is gone at once.
- Follows naturally the design princip of 'Separation of concerns'.
- Scalable structure, even when a project become huge, the navigation and understanding of it dosn't become harder.
