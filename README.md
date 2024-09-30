# AnimalSpaAndRetreat

# CarDealershipApp

### Description 
This is a simple Java console application that simulates the operations of an animal spa and retreat. The retreat manages a group of animals, allowing an attendant to care for them by making rounds and feeding the animals. The project demonstrates basic object-oriented programming principles such as encapsulation, method interaction, and data management across classes.

Key features include:

- Adding animals to the retreat: Users can add animals to the retreat, up to a set maximum capacity.

- Viewing the animal list: Users can view a list of animals currently staying at the retreat.

- Attendant rounds: An attendant can make rounds to check on the animals and feed those that are hungry.

### Technologies Used 
Java: The programming language used to create this application.

Eclipse/IntelliJ IDEA: Recommended IDEs for running and testing the application.

Git/GitHub: For version control and project management.

### Lessons Learned 

This project helped reinforce several key programming concepts:

Array Management: Managing a collection of Animal objects using an array. I learned how to handle adding new animals, checking for capacity limits, and iterating through the array when performing actions like making rounds.

Encapsulation: By keeping animal attributes private and using public methods (getters and setters), I practiced how to maintain proper access to each animal’s data. This helped me better understand how to control how data is accessed and modified between different classes.

Inter-Class Method Interaction: The Attendant class interacts with the AnimalRetreat class to check each animal and perform actions like feeding. This taught me how to structure methods that communicate effectively across different classes, passing objects and data smoothly between them.

Conditional Logic: I implemented logic to handle scenarios such as when an animal is hungry or when the retreat has reached its capacity. This allowed me to work with conditionals that affect program flow and behavior.

### Future Improvements
There are several areas I plan to improve in the future:

- Expand the types of animals and give them unique behaviors or conditions (e.g., health status, moods).

- Implement a more flexible data structure, like an ArrayList, to handle dynamic animal counts.

- Add error handling for edge cases like trying to add more animals than the retreat can handle.
