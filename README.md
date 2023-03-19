# Spring Boot template by features structure


## About
My recommendation for using the structure-by-feature in microservices, is based on my experinces with working on countless of software projects, where the structures has been a mess and hard to understand and navigate around. These projects often had no concrete structure or was structured by-functionality (also known as by-layer), leading to many navigational jumps and many expanded packages (folders) in the project-viewer when working on a particular featuere. These bad experiences has convinced me that structure-by-feature, the times I have used it, was simply the best one by default.

![image](https://user-images.githubusercontent.com/14817640/226204940-eb1faf79-86c0-4081-9ac6-3eecad030a11.png)


## Why I recommend this structure

Due to how well it scales up and still makes your project readable and understandable of what it does and contains.
I recommend the structure-by-feature approach by default for microservices over the structure-by-functionality, unless a project doesn't fit this structure of course. 

Some of reasons for the recommendation:

- All files related to a feature are located within the same package, no need for jumping between serverel packages when working on a feature.
- Deleting a feature is easy, you just delete the feature package and all files related to that feature is gone at once.
- Makes your project easy to navigate and understand what it actually does, even when a project becomes huge.
- Follows naturally the princip of 'Separation of concerns', since all related files are seperated by feature packages.
