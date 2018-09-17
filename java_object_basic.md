Cracking the Coding Interview page54, example16. This forms a tree whose depth is logN, so the time complexity is logN.

----
run a java program (basics):

1. create a class whose name is the same as the file name; 
2. 
2. CANNOT DEFINE A FUNCTION INSIDE THE main FUNCTION(i.e. public static void main()); 因为不是函数式编程，所以必需把method定义在main外面然后用main来call(これは関数型プログラミングではないので、関数はmainメソッドの外でしか定義できません); 
3. those methods should be defined outside the main, then use the main to call those functions;
4. If defined as instance methods(as compared to CLASS METHODS, STATIC METHODS), then MUST create an object (new a object) and manipulate this object to call the function, usage. object.method( ); 
5. cannot just call the function from nowhere.
6. If you want to call the function directly, define it as STATIC

4.5.6: why? :
"You can't call something that doesn't exist. Since you haven't created an object, the non-static method doesn't exist yet. A static method (by definition) always exists."  stackoverflow. 

Think instance methods as actions that this object can make. If there's no objects then no actions can ever going to happen.
