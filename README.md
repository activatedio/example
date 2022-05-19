# Example Project

## Getting Started

This is a simple Micronaut API project which contains:

* JPA model and repository
* A single controller
* A single table
* A single integration test


You can run the application by running the `io.activated.example.Application`
class from your favorite IDE. Once running, you can access the list of books by
running the following curl command:

```
curl http://localhost:8080/books
```

You should see the following output:

```
[{"id":1,"isbn":"978-1-60340-079-4","title":"Aesop's Fables","createdAt":1652925860871,"updatedAt":1652925860871},{"id":2,"isbn":"978-1-60340-085-5","title":"A Little Princess","createdAt":1652925860871,"updatedAt":1652925860871}]
```

## Techologies Used

You can scan the `build.gradle` file to locate the technologies used. They
include:

* Micronaut
* JPA
* Spring Reactor
* AssertJ

## Your Assignment

Please take this project and make it yours by expanding on it. Please be creative
and feel free to demonstrate knowledge of one or more of the following topics.

Here are some ideas

* Use Dependency Injection to create a service class around the repository.
* Create a `User` and `Checkout` table (or use your own names!) to create a
  library application. Create controllers to turn it into an API.
* Add an API integration with Twillio or similar.
* Install swagger into the project.
* Create a quick JavaScript front end in React or similar

As you work:

* Consider the Spring Reactor API and use it where possible.
* Testing is very important. Create unit and integration tests with JUnit.
  Mockito use is a plus.


Feel free to be creative. The objective here is to establish you have a working
knowledge of Java API projects.
