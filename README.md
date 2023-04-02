# water-bill-manager
water bill manager application for Fabric Group

## Introduction
This water bill manager application takes the input information from a text file and calculates the total water costs and display the output in the console.

## How to execute
- Clone the code repository
```sh
git clone https://github.com/cjpannila/water-bill-manager.git
```
- Build the executable artifact
```sh
mvn clean package
```
- Execute the application - include the input files in arguments
```sh
java -jar target/WaterBillManager-1.0-SNAPSHOT.jar <path_to_file>
```
example
```sh
java -jar target/WaterBillManager-1.0-SNAPSHOT.jar C:\temp\input1.txt C:\temp\input2.txt
```