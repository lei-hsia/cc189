

/*  CCI:  question3.1  
	Use a single array to implement 3 stacks
	Fixed Division
	
	for stack1, use [0, n/3), stack2 [n/3, 2n/3), stack3 [2n/3, n)
*/

class singleArray_3_stacks {
	private int numerOfStacks = 3;
	private int stackCapacity; // each stack's capa
	private int[] values;
	private int[] sizes;

	public singleArray_3_stacks(int stackSize){
		stackCapacity = stackSize;
		values = new int[stackCapacity * numerOfStacks];
		sizes = new int[sizes];  // record each stack's size
	}

	// push value onto stack
	public void push(int stackNum, int value) throws FullStackException{
		// check if we have space for next element
		if (isFull(stackNum)){
			throw new FullStackException();
		}
		sizes[stackNum]++;
		values[indexOfTop(stackNum)] = value;
	}

	// return index of the top of the stack
	private int indexOfTop(int stackNum){
		// choose 0,1,2 as stackNum <--- from preOccupied
		int preOccupied = stackNum * stackCapacity;
		int size = sizes[stackNum];  // stackNum: 0,1,2
		return preOccupied + size - 1;
	}

	// pop
	public int pop(int stackNum){
		if (isEmpty(stackNum)){
			throw new EmptyStackException();
		}

		int topIndex = indexOfTop(stackNum);
		int value = values[topIndex];  // Get top
		values[topIndex] = 0;  // Clear
		sizes[stackNum]--;  // Shrink
		return value;
	}

	// return top element
	public int top(int stackNum){
		if (isEmpty(stackNum)){
			throw new EmptyStackException();
		}

		return values[indexOfTop(stackNum)];
	}

	public boolean isEmpty(int stackNum){
		return sizes[stackNum] == 0;
	}

	public boolean isFull(int stackNum){
		return sizes[stackNum] == stackCapacity;
	}

}

