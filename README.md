# Jython compiler project

In this project we had to write a grammare for a invented language called "Jython".
After that, implement a compiler for this language that can parse some codes defined in Jython.

Implementing the lexical and syntactic analyzer of Jaiton language.
then, implementing  the semantic analyzer.
Before we check the program errors by the semantic analyzer, we must collect some information and store it in the symbol table.
To collect information, we use the tree generated, and by navigating the tree, we collect the required information.
Finally, using the table of symbols we examin some errors in the program

### ‫‪symbol‬‬ ‫‪table‬‬

The symbol table is a data structure that is used in compilers to store and collect the identifiers defined in the input code. The design of this table can be done in different ways according to the type of language, complexity and the opinion of the designer. The simplest type of implementation of a symbol table is to use a *hashtable* in such a way that its key is the identifier name and the value assigned to this key is the set of attribute values related to the identifier.

Each symbol table has two main methods that information related to the identifier is stored in or retrieved from the table through these two methods.

### scopes

In Jython language, scopes start with '{' character and end with '}'. The main thing about scope is that each scope has a symbol table. As you know, Jython language supports the nested structure for scopes, so it is better to define a structure to maintain them in order to manage domains. We suggest the tree structure for this (you can use another structure as well)

![image](https://user-images.githubusercontent.com/45916098/183771748-9c539750-ac0d-4207-85e1-03d0de873d17.png)


The information that would be collected are:

- Classes: class name, class parent name, properties, methods, constructors
- Methods: method name, return type, parameters
- Constructors : Constructor's name, parameters
- Properties: attribute name, attribute type
- Local variables: variable name, variable type


We will check the following Errors:

*Redefining a class:* 
- Error101: in line [lineNumber], [className] has already been defined

*Redefining a method or property in a class:* 
- Error102 : in line [lineNumber] , [Name] has been defined already in [className]

*Redefining a local variable in a scope:*
- Error103: in line [lineNumber], [Name] has already been defined in current scope

*Absence of the main method in the program:*
- Error104: in line [lineNumber], Can not find main method

*Define a method named print:*
- Error105: in line [lineNumber], Definition of print as method of a class

*Using an undefined class in a field:*
- Error106 : in line [lineNumber], cannot find class [className]

*Existence of distance in inheritance:*
- Error107 : Invalid inheritance [classname1] -> [classname2] -> [classname3] …

*Using an undefined variable or attribute:*
- Error108 : in line [lineNumber], Can not find Variable [name]
