
// all algorithms
// arrayList & resizable arrays

// for arrayList, the amortized insertion running time is O(1)
ArrayList<String> merge(String[] words, String[] more){
	ArrayList<String> sentence = new ArrayList<String>();
	for (String w : words) sentence.add(w);
	for (String w : more) sentence.add(w);
	return sentence;
}


/*  when it's an array, you add something to this array,
	it's making a copy of this array A, add the new thing,
	and create a new array B.
	THE NEW ARRAY IS A DIFFERENT OBJECT FROM THE ORIGINAL ARRAY

	when it's an arrayList, there's no copy, just add to the 
	original. There's no different two objects, just one
*/

String joinWords(String[] words){
	String sentence = "";
	for (String w : words) sentence = sentence + w;
	return sentence;
} 

// StringBuilder object works like an arrayList
String joinWords(String[] words){
	StringBuilder sentence = new StringBuilder();
	for (String w : words) sentence.append(w):
	return sentence.toString();
}


// interview questions:  1.1 -- 1.9 