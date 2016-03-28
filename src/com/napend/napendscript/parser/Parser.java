package com.napend.napendscript.parser;

import com.napend.napendscript.Block;
import com.napend.napendscript.tokenizer.Tokenizer;

public abstract class Parser<T extends Block> {
	
	/**
	 * Takes a line and checks if it is for this parser by using reg expresions.
	 */
	
	public abstract boolean shouldParse(String line);
	
	/**
	 * Take the superBlock and the tokenizer for the line and return a block of this parser's type.
	 */
	
	public abstract T parse(Block superBlock, Tokenizer tokenizer);	
	
}
