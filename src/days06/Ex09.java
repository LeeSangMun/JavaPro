package days06;

/**
 * @author sangmun
 * @date 2023. 7. 20. - 오후 4:08:04
 * @subject
 * @content
 */
public class Ex09 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("[" + i + "," + j + "]");
			} // for
			System.out.println();
		}
		
		// [1]
		/*
		for(int i=0; i<4; i++) {
			for (int j = 0; j < 4; j++) {
				if(i >= j) {
					System.out.print("*");
				}	
			} // for
			System.out.println();
		}
		*/
		
		// [2]
		/*
		for(int i=0; i<4; i++) {
			for (int j = 0; j < 4; j++) {
				if(i+j <= 3) {
					System.out.print("*");
				}	
			} // for
			System.out.println();
		}
		*/
		
		// [3]
		/*
		for(int i=0; i<4; i++) {
			for (int j = 0; j < 4; j++) {
				if(i+j >= 3) {
					System.out.print("*");
				}	else {
					System.out.print("_");
				}
			} // for
			System.out.println();
		}
		*/
		
		// [4]
		/*
		for(int i=0; i<4; i++) {
			for (int j = 0; j < 4; j++) {
				if(j >= i) {
					System.out.print("*");
				}	else {
					System.out.print("_");
				}
			} // for
			System.out.println();
		}
		*/
		
		// [5]
		/*
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3-i-1; j++) {
				System.out.print("공");
			} // for
			for(int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		} // for
		*/
		
		// [6]
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 3-i-1; j++) {
//				System.out.print("_");
//			} // for
//			for (int j = 2-i+1; j <= 0; j++) {
//				System.out.print("_");
//			} // for
//			for (int j = 0; j <i*2+1 ; j++) {
//				System.out.print("*");
//			} // for
//			System.out.println();
//		} // for
		
		// [7]
		/*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == j) {				
					System.out.print("*");
				} else {
					System.out.print("공");
				}
			} // for
			System.out.println();
		} // for
		*/
		
		// [8]
		/*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i + j == 4) {				
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			} // for
			System.out.println();
		} // for
		*/
		
		// [9]
		/*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if(i == j || i + j == 4) {				
					System.out.print("*");
				} else {
					System.out.print("_");
				}
			} // for
			System.out.println();
		} // for
		*/
		
		// [10]
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (i%3 == 0 ? 3 : i%3+3); j++) {
				if(i <= 2) {
					if(i+j == 0 || i+j == 1) {
						System.out.print("_");
					} else {			
						System.out.print("*");
					}
				} else {
					
				}
			} // for
			System.out.println();
		} // for
	}
}
