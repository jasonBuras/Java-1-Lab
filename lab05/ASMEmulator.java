//Jason Buras Problem 8: ASM Emulator
/*(Assembly Programming) High-level programming languages such as Java 
must be translated into a low-level assembly language (ASM) in order to 
be executed by the underlying computational hardware. Unlike Java, ASM 
is very specific to the hardware. ASM syntax consists of only 
three types: opcodes, registers, and literal values. 
The opcode refers to the instruction that the processor must perform. 
Registers represent the available storage. Literal values are the integer numbers. 
You must implement a Simple Pseudo ASM (SPASM) emulator based on the following specifications.

if

*/
public class ASMEmulator{
	private static int eax;
	private static int ebx;
	private static int ecx;
	private static int edx;

	private static int getValue(String reg){
		switch (reg){
		case "eax": return eax; 
		case "ebx": return ebx; 
		case "ecx": return ecx; 
		case "edx": return edx;
		}
		return 0;
	}

	public static void mov(String reg1, int val){
		//moves int data into specified register via a String label ("eax", "ebx", "ecx", "edx")
		switch(reg1){
		case "eax": eax = val; break;
		case "ebx": ebx = val; break;
		case "ecx": ecx = val; break;
		case "edx": edx = val; break;
		}
	}

	public static void mov(String reg1, String reg2){
		//moves data from register to register via String labels ("eax", "ebx", "ecx", "edx")
		int val = 0;
		switch(reg2){
		case "eax": val= eax; break;
		case "ebx": val= ebx; break;
		case "ecx": val=ecx; break;
		case "edx": val=edx; break;
		}
		mov(reg1, val);
	}

	public static void add(String reg1, int val){
		//adds value with specified register, outputs result to accumulator (eax)
		int result= val + getValue(reg1);
		mov("eax", result);
	}

	public static void add(String reg1, String reg2){
		//adds the values from two registers, outputs result to accumulator (eax)
		int result = getValue(reg2)+getValue(reg1);
		mov("eax", result);

	}

	public static void imul(String reg1, int val){
		//multiplies a value with specified register, outputs result to accumulator (eax)
		int result = val * getValue(reg1);
		mov("eax", result);
	}

	public static void imul(String reg1, String reg2){
		//multiples the values from two registers, outputs result to accumulator (eax)
		int result= getValue(reg2) * getValue(reg1);
		mov("eax", result);
	}

	public static void cmp(String reg1, int val){
		//compares value to register, (0=false, 1=true) , outputs result to accumulator (eax)
		if(val == getValue(reg1)){
			eax = 1;
		}
		else {
			eax = 0;
		}
	}

	public static void cmp(String reg1, String reg2){
		//compares two registers, (0=false, 1=true) , outputs result to accumulator (eax)
		if(getValue(reg2)==getValue(reg1)){
			eax = 1;
		}
		else{
			eax = 0;
		}
	}

	public static void call(String proc, String reg1){
		//call to external procedure, "PRINT" to console value in a specified register
		if (proc.equals("PRINT")){
			System.out.printf("[%s]: %d\n", reg1, getValue(reg1));
		}
	}

}