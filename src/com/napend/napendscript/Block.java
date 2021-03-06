package com.napend.napendscript;

import java.util.ArrayList;

/**
 * Represents a block of code.
 */

public abstract class Block {

	private Block superBlock;
	private ArrayList<Block> subBlocks;
	
	public Block(Block superBlock){
		this.superBlock = superBlock;
		this.subBlocks = new ArrayList<>();
	}
	
	public Block getSuperBlock() {
		return superBlock;
	}
	
	public void addBlock(Block block){
		subBlocks.add(block);
	}
	
	public abstract void run();
	
}
