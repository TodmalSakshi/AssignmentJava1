class exam4{
    public static void main(String  args []){
	    int binar = 0b1010; 
        System.out.println("Binary Literal (0b1010): " + binar);

       
        int octal = 012; // Octal representation of 10
        System.out.println("Octal Literal (012): " + octal);

       
        int hexx = 0xA; // Hexadecimal representation of 10
        System.out.println("Hexadecimal Literal (0xA): " + hexx);

        
        double d = 12.34;
        System.out.println("Decimal Floating-Point Literal (12.34): " + d);

       
        double h = 0x1.2p3; // (1.2 in hex) * 2^3 = 9.0
        System.out.println("Hexadecimal Floating-Point Literal (0x1.2p3): " + h);
	
	}

}