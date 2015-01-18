//
//  AppControl.m
//  SenorStaff Hack
//
//  Created by steve hooley on 20/08/2008.
//  Copyright 2008 __MyCompanyName__. All rights reserved.
//
//#import <Carbon/Carbon.h>
//#import "memory.h"
//#import <iostream>
//#import <fstream>
#import "AppControl.h"

#import "MusicDocument.h"
#import "SimpleSong.h"
#import "SongPlayer.h"
#import "MidiLoader.h"
#import <FScript/FScript.h>
#import "MIDIUtil.h"

//#include "allegro.h"

static AppControl *cachedAppControl;

@implementation AppControl

@synthesize testDoc;

+ (AppControl *)cachedAppControl {
    return cachedAppControl;
}

#warning ! Tell don't ask!
- (void)awakeFromNib {
    cachedAppControl = self;
    
    /* load FScript */
    [[NSApp mainMenu] addItem:[[FScriptMenuItem alloc] init]];
    
    if (NSClassFromString(@"SimpleNoteTests") == nil) {
        NSString *testMidiFile = [[NSBundle mainBundle] pathForResource:@"apprhythmsvol1y2r1" ofType:@"mid"];
        NSAssert(testMidiFile != nil, @"File not found");
        NSData *_midiData = [NSData dataWithContentsOfFile:testMidiFile];
        
        
        testDoc = [[MusicDocument alloc] init];
        Song *emptySong = [[Song alloc] init];
        [MIDIUtil readSong:emptySong fromMIDI:_midiData];
        
        //testDoc.song = emptySong;
        
        SongPlayer *songPlayer = [[SongPlayer alloc] initWithSong:emptySong];
        [songPlayer play];
    }
}

@end
