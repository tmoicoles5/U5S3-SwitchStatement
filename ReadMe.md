# U5S3 Switch Statement

* Part A - Foundations 5.3
* Part B - Foundations Practice
* Part C - Algorithm Challenge

## Part A
### Exercise 1
Go to the package `partA.ex01` and open `Switch`
* Write the code in `Switch` per the following:
    * The user enters the month as a number
    * The corresponding month name must be displayed
    * For any invalid month, the output must be displayed as
      “Invalid month”
    * Run your program for the 8th Month of the Year

      Your program is working correctly, if when run, the following is the output:
```
August
```
  
### Exercise 2
* Go to the package `partA.ex02` and open `SwitchObservation`
    * Modify the switch statement as follows:
        * Remove the break statements for case ‘A’
          * Execute the program
          * Observe the output
      * • Remove the break statements for case ‘A’ and case ‘B’
          * Execute the program
          * Observe the output


## Part B

### Exercise 1: Next Color for a Stop Light

### Overview

The normal behavior for a stop light is to cycle from Red to Green To Yellow to Red ( and continues with this pattern). Complete `IfLight ` in the `partB.ex01` package, which will determine the next color of a stop light in this pattern, Red to Green to Yellow to Red based on the current stop light provided by the user.

![](./assets/img01.png)

### Task

You must implement the following using a suitable `if` statement:

* Have the user enter the value for the currentColor.
* Compute the next color stop light based on the currentColor.
* Alert the user for any invalid value of color.
* Test your program for the color code 1 and run the unit test

Your program is working correctly, if when run, the following is the output:

#### Expected Output 1

```
Enter a color code:
1
Next Traffic Light is green
```

#### Expected Output 2

```
Enter a color code:
3
Next Traffic Light is red.
```

#### Expected Output 3

```
Enter a color code:
0
Invalid color
```

#### Expected Output 4

```
Enter a color code:
4
Invalid color
```

### Exercise 2: Next Color for a Stop Light

### Overview

Re-Write `IfLight` in `SwitchLight` in the `partB.ex02` package, using a switch statement.

![](./assets/img01.png)

### Task

 * Implement all the functionality in `IfLight` in `SwitchLight` , using switch statement and ensure the program alert users if they've entered any invalid value.
 * Test your program for the color code 0 and run the unit test

  Your program is working correctly, if when run, the following is the output:
```
Enter a color code:
0
Invalid color
```

## Part C

### Problem 1
It's a nice day, and you're at the park and see two dogs, bulldog and lab.
The parameters bulldogGrowl and labGrowl indicates if each dog is growling.
Surrounding people are in a bit of trouble if both dogs are growling or if neither are growling but are in a stare down.

Return true if those people are in trouble.

Example:
```java
 dogTrouble(true, true) --> true
 dogTrouble(false, false) --> true
 dogTrouble(true, false) --> false
```
### Problem 2
We have a loud crying puppy in an apartment building. The "hour" parameter is the current hour time
in the range 0...23. We will get in trouble if the puppy is crying and the time is before 7 or after 20.

Return true if we will get in trouble based on if the puppy is crying during a specfic time of day.

Example:
```java
puppyCry(true, 6) --> true
puppyCry(true, 7) --> false
puppyCry(false, 6) --> false
```
