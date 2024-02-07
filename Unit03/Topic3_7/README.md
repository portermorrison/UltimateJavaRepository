# 3.7 - Comparing Objects

1. Two object refernces are considered aliases when they both reference the same object.
- object reference values can be compared, using == or =!, to identify aliases.
- A reference values can be compared with null, using == or !=, to determine if the reference actually references an object.

`house = new house()`
is one object

`house myhouse = new house()`
is one object but now with an obj