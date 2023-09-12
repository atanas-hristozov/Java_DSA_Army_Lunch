Army Lunch
Rules in the army must be followed strictly so it is important for newly enlisted soldiers to get used to them as quickly as possible.

One rule, for example, dictates that all soldiers must follow a certain order in which they visit the cafeteria for lunch. Sergeants go first, Corporals are second, and Privates go last.

Given the following abbreviations: S for Sergeant, C for Corporal, and P for Private, write a program that optimizes the order in which soldiers visit the cafeteria.

For example, the following group of soldiers P, C, S, S, C, P must be transformed into S, S, C, C, P, P.

Input
On the first line you will find N - the number of soldiers
On the second line you will find exactly N soldiers that want to visit the cafeteria
Output
On a single line print the correct order under which the soldiers will go into the cafeteria. Separate each solder by a single space.
Constraints
0 < N < 100 000
Sample Tests
Input
3
S1 C1 P1
Output
S1 C1 P1
Description
The sequence remains the same since the soldiers are already in correct order.

Input
7
P4 P2 P3 S1 C2 P1 C1
Output
S1 C2 C1 P4 P2 P3 P1
Description
Sergeants (S1) get their lunch first in the order they appear.
Corporals (C1, C2) go after Sergeants and before Privates.
C2 is before C1 because it appears first in the input sequence.
All the Privates (P1, P2, P3 and P4) eat in the order they appear.
