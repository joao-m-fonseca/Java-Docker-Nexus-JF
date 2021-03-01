# Java-Docker-Nexus-JF

# Introduction 
Welcome! 
This is my brand new calculator. Give it a try!

# Getting Started
My calculator has several functions, so with her you can perform the next operations:

- Sum
- Subtraction
- Multiplication
- Division

# Build and Test
This Java App is supported by openjdk-16.

In order to build the docker iamge you just need to download the dockerfile, open PS/Bash in the same directory and insert:
docker build -t javaapp-app-name . 

To run the calculator you need to perform the next step:

java -jar calculator.jar sum 2 3 -> This will get you the result of 2 plus 3.

The arguments to perform operations are:

sum -> Sum

sub -> Subtraction

times -> Times

division -> Division

Brought you by: João Fonseca