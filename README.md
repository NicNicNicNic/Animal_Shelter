Animal Shelter Management System 🐾

A Java application designed to ingest, validate, and manage animal shelter records (specifically Dogs and Cats) from structured text files. The project emphasizes object-oriented programming principles, strict data validation using Regular Expressions (Regex), and fixed-size array management without relying on the Java Collections Framework.

🚀 Features

Object-Oriented Hierarchy: Built with a superclass (Animal) extended by specialized subclasses (Dog and Cat), featuring overridden toString() methods for specialized formatting.

Flexible File Ingestion: Automatically parses input files supporting multiple delimiters (comma ,, vertical bar |, and semicolon ;).

Strict Regex Validation: Validates dates (YYYY-MM-DD) and owner phone numbers ((XXX)XXX-XXX) before object instantiation to ensure data integrity.

Custom Array Storage: Manages records efficiently using a standard fixed-size Java array with explicit bounds checking, deliberately bypassing ArrayList and other collection utilities.

📂 Project Structure

├── Animal.java          # Superclass containing shared attributes and methods
├── Dog.java             # Subclass for dogs, adding the breed attribute
├── Cat.java             # Subclass for cats, adding the favorite toy attribute
├── ShelterManager.java  # Core manager handling file I/O, parsing, regex validation, and array storage
└── Handler.java         # Driver class containing the main method


🛠️ Getting Started

Prerequisites

Java Development Kit (JDK) version 8 or higher.

Compilation & Execution

Open a terminal or command prompt in the project root directory.

Compile all Java source files:

javac *.java


Run the application:

java Handler


When prompted, enter the filename or relative path to your input data file (e.g., animals.txt).

📄 Input File Format

Each line in the input data file must contain 8 fields separated by commas, vertical bars, or semicolons:

Type, RegistrationNumber, Name, DateOfBirth, OwnerPhone, OwnerName, LastVaccination, ExtraField


Type: Must be Dog or Cat.

Date Format: YYYY-MM-DD

Phone Format: (XXX)XXX-XXX

ExtraField: Represents Breed for Dogs and Favorite Toy for Cats.

Sample Input Data

Dog,REG101,Buddy,2021-05-12,(843)555-0142,Sarah Jenkins,2025-01-10,Golden Retriever
Cat|REG102|Luna|2022-08-20|(843)555-8933|Michael Smith|2025-02-14|Feather Wand
