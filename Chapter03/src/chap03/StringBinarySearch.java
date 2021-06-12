package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		String[] x = {
			"abstact", "assert", "boolean", "break", "byte",
			"case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else",
			"enum", "extends", "final", "finally", "float",
			"for", "goto", "if", "implements", "import",
			"instanceof", "int", "interface", "long", "native",
			"new", "package", "private", "protected", "public",
			"return", "short", "static", "strictfp", "super",
			"switch", "synchronized", "this", "throw", "throws",
			"transient", "try", "void", "volatile", "while",
		};
		
		String ky = stdIn.next();
		
		int idx = Arrays.binarySearch(x, ky);
		
		if(idx < 0)
			System.out.println("해당 키워드가 없습니다");
		else
			System.out.println("해당 키워드는 x["+idx+"]에 있습니다.");
		
		stdIn.close();
	}
}
