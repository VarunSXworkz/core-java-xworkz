class Modulus {
	public static void main(String mod[]) {
		mod(6,2,1);
		mod(15,3,2);
		mod(50,10,5);
		mod(12,7,8);
		mod(9,4,3);
		mod(64,7,7);
		mod(49,6,2);
		mod(81,10,20);
		mod(100,12,7);
		mod(144,13,8);
	}
	public static void mod(int i,int j,int k) {
		System.out.println(i%j%k);
	}
}