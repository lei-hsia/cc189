
public class cci_p54_ex16{

    public static void main(String[] args){

    	cci_p54_ex16 example1 = new cci_p54_ex16();

	    example1.powerOf2(50);
    }

    int powerOf2(int n){
		if(n<1){
			return 0;
		}
		else if(n ==1){
			System.out.println(1);
			return 1;
		}
		else{
			int prev = powerOf2(n/2);
			int curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
}



// public class cci_p54_ex16{

//     public static void main(String[] args){

//     	// cci_p54_ex16 example1 = new cci_p54_ex16();

// 	    // example1.powerOf2(50);
// 	    powerOf2(50);
//     }

//     static int powerOf2(int n){
// 		if(n<1){
// 			return 0;
// 		}
// 		else if(n ==1){
// 			System.out.printIn(1);
// 			return 1;
// 		}
// 		else{
// 			int prev = powerOf2(n/2);
// 			int curr = prev * 2;
// 			System.out.printIn(curr);
// 			return curr;
// 		}
// 	}
// }
