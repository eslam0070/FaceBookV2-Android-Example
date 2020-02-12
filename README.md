# FaceBookV2-Android-Exmple
## Why do we need these patterns?
Adding everything in a Single Activity or Fragment would lead to problems in testing and refactoring the code. Hence, the use of separation of code and clean architecture is recommended.

## Android MVVM

MVVM stands for Model, View, ViewModel.

* Model
      This holds the data of the application. It cannot directly talk to the View. Generally, it’s recommended to expose the data to the ViewModel through Observables.

* View
      It represents the UI of the application devoid of any Application Logic. It observes the ViewModel.

* ViewModel
      It acts as a link between the Model and the View. It’s responsible for transforming the data from the Model. It provides data streams to the View. It also uses hooks or callbacks to update the View. It’ll ask for the data from the Model.
      
The following flow illustrates the core MVVM Pattern.

![Image description](https://cdn.journaldev.com/wp-content/uploads/2018/04/android-mvvm-pattern.png)

# How does this differ from MVP?

* ViewModel replaces the Presenter in the Middle Layer.

* The Presenter holds references to the View. The ViewModel doesn’t.

* The Presenter updates the View using the classical way (triggering methods).

* The ViewModel sends data streams.

* The Presenter and View are in a 1 to 1 relationship.

* The View and the ViewModel are in a 1 to many relationship.

* The ViewModel does not know that the View is listening to it.

There are two ways to implement MVVM in Android:

* Data Binding

* RXJava

