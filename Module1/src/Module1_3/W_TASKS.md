# Orientation Module 1.3 Writing tasks

## Task 1

### Assignment
> Suppose you are compiling statistics on the age structure of students in our group. You should then draw 1000 age values and these should be distributed in the same way as the age distribution of the students in the group. How do you do it? Explain the algorithm in enough details to be able to program it directly. Take an idea/model from the example on the previous section 'Your own distribution'.

### Answer

To compile statistics on the age structure of students in a group by drawing 1000 age values that match the age distribution of the students, you can follow these steps:

- Define the age distribution: Create a table that represents the age distribution of the students. Each entry consists of two values: the cumulative percentage and the corresponding age. If 30% of students are 20 years old, 25% are 21 years old and so on, the table would look like this:

    | Cumulative Percentage | Age |
    |-----------------------|-----|
    | 30                    | 20  |
    | 55                    | 21  |
    | ... and so on         |     |

- Generate random numbers: Use random number generation to create 1000 random integers between 1 and 100. These numbers will be used to determine the ages based on the defined distribution.

- Map random numbers to ages: For each generated random number, determine the corresponding age by comparing it to the cumulative percentages in the age distribution table. For example, if a random number is 45, it's between 30 and 55, so the corresponding age would be 21.

- Count the times each age is selected: Use an integer array where the index represents the age and the value at that index is the count of how many times that age was generated. Increment the count each time an age is selected during the random generation process.

- Output the results: After generating all 1000 ages, print the results in a readable format, showing each age, its count, and its percentage of the total.

## Task 3

### Assignment
> Why can't a Singleton object be created from outside the Singleton class using the new operation?

### Answer

Singleton objects cannot be created from outside the class using the new operation since the constructor of a Singleton class is typically made private. This ensures that no other class can instantiate the Singleton class directly. When needed, the Singleton instance is usually accessed via a static method getInstance() that checks if an instance already exists, and if not, creates one.

### Task 4

### Assignment
> Familiarize yourself with a few distributions that could be used in the simulator for experimentation. These distributions could be used in the following situations. Find answers online. You can also study other distributions. For example, try to Google search "real life example of normal distribution."

### Answer

- Normal distribution: often used to represent real valued random variables which distributions are not known.

- Uniform distribution: often used in computer simulations where each outcome in a range is equally likely.

- Exponential distribution: often used to model the time between events in a Poisson process, such as the time between arrivals of customers at a service point.