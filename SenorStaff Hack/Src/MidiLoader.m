//
//  MidiLoader.m
//  SenorStaff Hack
//
//  Created by Steven Hooley on 6/23/09.
//  Copyright 2009 Bestbefore. All rights reserved.
//

#import "MidiLoader.h"
#import "SimpleSong.h"
#import "MIDIUtil.h"

@implementation MidiLoader

+ (MidiLoader *)midiLoader {
    return [[MidiLoader alloc] init];
}

- (void)prepareDefaultFile {
    NSString *testMidiFile = [[NSBundle mainBundle] pathForResource:@"apprhythmsvol1y2r1" ofType:@"mid"];
    NSAssert(testMidiFile != nil, @"File not found");
    _midiData = [NSData dataWithContentsOfFile:testMidiFile];
}

- (void)addDataToSong:(SimpleSong *)aSong {
    // [MIDIUtil parseMidiData:_midiData intoSong:aSong];
    
    [MIDIUtil readSong:aSong fromMIDI:_midiData];
}

@end
