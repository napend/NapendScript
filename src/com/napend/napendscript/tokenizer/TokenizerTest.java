package com.napend.napendscript.tokenizer;

public class TokenizerTest {

	public static void main(String[] args) {
		String code =
				"class HelloWorld\n" +
				"method main requires ()\n" +
				"print.out \"Hello\""
		;
		
		Tokenizer tokenizer = new Tokenizer(code);
		
		while (tokenizer.hasNextToken()) {
			System.out.println(tokenizer.nextToken().getToken());
		}
	}
}