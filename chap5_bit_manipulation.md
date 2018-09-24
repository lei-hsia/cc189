1. logic right shift: the leftmost(aka. most significant bit, MSB) bit is filled with all 0, i.e. positive sign;
2. arithmetic right shift: MSB bit is filled with the previous MSB

3. logic right shift: >>>;

4. arithmetic right shift: >>

5. Multiplication by left shift: the result of left shift is a multiplication by 2^n, where n is the shifted bit positions. 

6. Division by right shift: shift right by n positions results in a division by 2^n.