# Java
Learning Java
## 1. Create a Java project in VS code  
- New Java project -> Maven -> archetype-quickstart-jdk8 -> 1.0.29 (latest)  
- The file structure is:  
```
root  
 └──project-name/  
    ├── src/  
    │   ├── main/  
    │   │   └── java/  
    │   │       └── package-name/   
    │   └── test/  
    │       └── java/  
    │           └── package-name/      
    └── target/  
        ├── classes/  
        └── test-classes/  
```
- terminal command to run from the root:  
`java -cp project-name\target\classes package-name.App-name args`  
check App-name.java for args

## 2. Primitive Data Types
- byte
- char
- short
- int
- long
- float
- double
- boolean

## 3. Reference Data Types
- String (immutable!)
    #### Useful String methods:
    - startsWith()
    - strip()
    - length()
    - concat()
    - indexOf()
    - replace()
    - toLowerCase()
    - to UpperCase()  
    etc.

- Array
- Object