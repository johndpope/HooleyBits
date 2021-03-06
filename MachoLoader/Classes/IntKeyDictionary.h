//
//  IntKeyDictionary.h
//  MachoLoader
//
//  Created by Steven Hooley on 25/08/2010.
//  Copyright 2010 Tinsal Parks. All rights reserved.
//


@interface IntKeyDictionary : NSObject {

	CFMutableDictionaryRef _symbolLookup;
}

- (void)addObject:(NSObject *)ob1 forIntKey:(uint64)key;
- (NSObject *)objectForIntKey:(uint64)key;

@end
