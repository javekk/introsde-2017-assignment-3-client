# introsde-2017-assignment-3-client

## 1. Identification
* Perini Raffaele 196339
* raffaele.perini@studenti.unitn.it
* __My Server URL__: https://introsdeass3.herokuapp.com/ws/people?wsdl
* __My Git Repo__: https://github.com/javekk/introsde-2017-assignment-3-server

## 2. Project
This is the client for the server <Server URL_>. In this client are implemented all the following steps.

#### 2.1. Code
The project is structured as follow:
* __ivy.xml__ : it is used for handling the dependencies
* __build.xml__ : contains the ant script for running the Project
* __src__ : contains the client which performs the tasks described in the next paragrafs. These classes implement the http requests for the server.
#### 2.2. Task
The two clients do the following tasks:
* __Step #1__, __readPersonList()__: Asks server to list all the people in the database
* __Step #2__, __readPerson(660l)__: Asks server to give all the Personal information of Person identified by 660.
* __Step #3__, __updatePerson(person)__: Asks server to update the Personal information of the Person identified by person id.
* __Step #4__, __createPerson(person)__:Asks server to create a new Person and returns the newly created Person with its assigned id.
* __Step #5__, __deletePerson(person.id)__:Asks server to delete the Person identified by person.id;
* __Step #6__, __readPersonPreferences(660l, "Social")__: Asks server to return the list of values of "Social" for the Person identified by 660 id.
* __Step #7__, __readPreferences()__:Asks server to the list of all activities.
* __Step #8__, __readPersonPreferences(651l, 652l)__: Asks server to the value identified by {activity_id} for a Person identified by {id}.
* __Step #9__, __savePersonPreferences(651l, activity)__:Asks server to save a new activity object {activity} of a Person identified by 651 id.
* __Step #10__, **updatePersonPreferences(651l, activity)**: Asks server to the activity identified with {activity.id}, related to the Person identified by id of 651.
* **Step #11**, **evaluatePersonPreferences(651l, activity, 9)**:Asks server to update the activity identified with {activity.id}, related to the Person identified by 651 with the value that define a specific value of preferences (9).
* **Step #12**, **getBestPersonPreference(660l)** :Asks server to return the best preference (or preferences if there are more) of the Person identified by 660 id  from his/her list of preferences.

## 3. Execution
Run the following for the execution

  ```
   ant execute.client
  ```
it will run the program and it will create the __client-server-xml.log__
## 4. Additional Notes
