#####Q: supose we had an algorithm that took in an array of strings, sorted each string, and then sorted the full array. What would the rumtime be?

- let s be the length of the longest string
- let a be the length of the array.

1. Sorting each string is O(s log s)
2. Do this for every string(there're a strings), so that's O(a*s log s)
3. Sort the array/sort all strings: There're O(a log a) comparisons (just as sort each string cost O(s log s)), each comparison takes <b>O(s) time</b> (NOT CONSTANT), therefore this will take O(a*s log a) time.
4. add up 2 parts, get O(a*s (log a + log s)).

No way to reduce further.