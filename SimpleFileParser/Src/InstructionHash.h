//
//  InstructionHash.h
//  SimpleFileParser
//
//  Created by Steven Hooley on 12/08/2010.
//  Copyright 2010 Tinsal Parks. All rights reserved.
//
@class Instruction, InstructionLookup;

@interface InstructionHash : NSObject {

	InstructionLookup		*_instructionLookup;
	NSMutableDictionary		*_cachedInstructions;
}

+ (InstructionHash *)cachedInstructionHashWithLookup:(InstructionLookup *)lookup;
- (id)initWithLookup:(InstructionLookup *)lookup;

// + (Instruction *)instructionForOpcode:(NSString *)opcode;

- (Instruction *)instructionForOpcode:(NSString *)opcode;

@end
