

// generate a series of prime numbers up to max
boolean[] sieveOfEratosthenes(int max){

	// flags[] REALLY starts from index 1 in function getNextPrime
	boolean flags[] = new boolean[max + 1];
	int count = 0;

	init(flags);
	int prime = 2;

	while (prime <= Math.sqrt(max)){
		// Cross off remaining multiples of prime
		crossOff(flags, prime);

		// find next value whose flag signs true
		prime = getNextPrime(flags, prime);
	}

	/*	function return type: boolean[], here, the flags
		returned with signs true indicates it's a prime number
		*/
	return flags;
}

void crossOff(boolean[] flags, int prime){
	/*	cross off remaining multiples of prime. 
		Starts with (prime * prime), because if we
		have k * prime, where k < prime, this value
		would have already been crossed off in a 
		prior iteration.
		flags.length == max
		*/
	for(int i = prime * prime; i<flags.length; i+=prime){
		flags[i] = prime;
	}
}

void getNextPrime(boolean[] flas, int prime){
	int next = prime + 1;
	// !flag[next] : so composites deleted before will pass
	while (next < flags.length && !flags[next]){
		next++;
	}
	return next;
}