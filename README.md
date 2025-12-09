# 🎓 Sprint I – Java Programming

This repository contains the activities for Java Sprint I, organized by topic and difficulty level.

Each section includes practice exercises:

- Object-Oriented Programming (OOP)
- Inheritance and Polymorphism
- Interfaces
- Static and Non-Static Methods
- Exception Handling
- Safe Keyboard Input

---

## 📁 Project Structure

The exercises are organized within the main package:

```
career01
│
├── Inheritance and Polymorphism 01
│ ├── level01A → Abstract Classes and Hierarchies (Instruments)
│ ├── level01B → Static vs. Non-Static Methods (Car)
│ └── level02A → Inheritance Between Classes (Phone / Smartphone)
│
└── Exceptions01
├── level01A → Custom Exception (EmptySaleException)
└── level02A → Safe Reading from Keyboard (Input)
```

---

## 🟣 Main Classes
## 🟣 Auxiliary Classes
## 🟣 Custom Exceptions
## 🟣 Main File to Run the Exercise

---

# 📘 Exercise Descriptions

---

## 1️⃣ Inheritance and Polymorphism (Inheritance and Polymorphism)

### 🔹 Level 01A – Musical Instruments
**Objective:** Practice abstract classes, inheritance, and hierarchies.

Includes:
- Abstract class `Instrument`
- Subclasses: `Wind Instrument`, `Percussion Instrument`, `String Instrument`
- Abstract method `play()`
- Demonstration of static blocks

---

### 🔹 Level 01B – Car Class (Static/Non-Static Methods)

**Objective:** Understand the difference between static and instance methods.

Includes:
- Static vs. Instantiated Fields
- Utility Static Methods
- Methods that operate on the object's state.

---

### 🔹 Level 02A – Phone / Smartphone

**Objective:** Explore inheritance and interfaces in greater depth.

Includes:
- Base class: `Telefono`
- Subclass: `Smartphone`
- Additional interfaces as per the instructions
- Use of @Override

---

# 2️⃣ Exceptions – Handling and Creating Exceptions

### 🔹 Level 01A: Empty Sale Exception

**Objective:** Create a custom exception.

Includes:
- Class `Product`
- Class `Sale` with a product list
- `EmptySaleException`
- Handling `IndexOutOfBoundsException`

---

### 🔹 Level 02A – Console Input Reader (Secure Keyboard Input)

**Objective:** Create a utility class for validated keyboard input.

Includes:
- Static class `Input`
- A single object `Scanner`
- Validated methods:

With InputMismatchException:
- `readByte(string message)`
- `readInt(string message)`
- `readFloat(string message)`
- `readDouble(string message)`

With custom exception `EntranceException`:
- `readChar(string message)`
- `readString(string message)`
- `readYesNo(string message)`

Features:
- Retry loop until valid input
- Custom messages
- Clean and reusable code

## 🟩 3. Java Collections (Collections)

This section covers the most commonly used collections from the `java.util` library, such as:
- `ListArray`
- `LinkedHashSet`
- `Map` Hash`
- `ListIterator`

Each exercise develops a key aspect of collections: duplicates, ordering, safe iteration, using maps, and reading/writing files.

--

### 🔹 Level 01A — Exercise 1: Duplicates (ArrayList & LinkedHashSet)

**Objectives:**
- Create an `ArrayList` with the months of the year, excluding “August”.

- Insert “August” in its correct position.

- Verify the behavior of duplicates.

- Convert the list into a `LinkedHashSet` to remove duplicates.

- Register the collection with:
- `for-each`
- `Iterator`

**Classes created:**
- `Month.java`
- `MonthsMain.java`

**Exercise status:** ✔️ *Completed*

---

### 🔹 Level 01B — Exercise 2: Iterators and Safe Modification

**Objectives:**
- Practice using `ListIterator`.

- Modify elements while iterating without generating errors.

- Avoid `ConcurrentModificationException`.

**Exercise status:** ⬜ *Pending*

---

### 🔹 Level 02A — Exercise 3: HashMap and Counters

**Objectives:**
- Use `HashMap<String, Integer>` to count elements.

- Register keys and values.

- Sort and print results.

**Exercise Status:** ⬜ *Pending*

---

### 🔹 Level 02B — Exercise 4: Reading and Writing Files

**Objectives:**
- Read files using `BufferedReader`.

- Process data and store it in a collection.

- Create an output file with the results.


**Exercise Status:** ⬜ *Pending*

---

## 🛠️ Technologies Used

- Java JDK 21
- IntelliJ IDEA Community Edition
- Git and GitHub
- Console / Terminal

---

## ▶️ How to Run the Exercises

1. Clone the repository:
```git clone https://github.com/anaruth-hub/Sprint-I.git

Open the project in IntelliJ IDEA
Navigate to the desired exercise within:

src/sprint01/...
Run the main file...

## 🤝 Contributions

This repository is part of the learning materials for Sprint I. Suggestions, improvements, or corrections are welcome.
