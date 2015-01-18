#import "AppControl.h"
#import "MusicDocument.h"
#import "SongPlayer.h"
#import <FScript/FScript.h>
#import "MIDIUtil.h"

//#include "allegro.h"

static AppControl *cachedAppControl;

@implementation AppControl

@synthesize testDoc;

+ (AppControl *)cachedAppControl {
    return cachedAppControl;
}

- (void)awakeFromNib {
    cachedAppControl = self;
    
    /* load FScript */
    [[NSApp mainMenu] addItem:[[FScriptMenuItem alloc] init]];
    
    if (NSClassFromString(@"SimpleNoteTests") == nil) {
        NSString *testMidiFile = [[NSBundle mainBundle] pathForResource:@"apprhythmsvol1y2r1" ofType:@"mid"];
        NSAssert(testMidiFile != nil, @"File not found");
        _midiData = [NSData dataWithContentsOfFile:testMidiFile];
        
        
        testDoc = [[MusicDocument alloc] init];
        emptySong = [[Song alloc] initWithDocument:testDoc];
        [MIDIUtil readSong:emptySong fromMIDI:_midiData];
        
        NSLog(@"emptySong:%@", emptySong);
        
        
        SongPlayer *songPlayer = [[SongPlayer alloc] initWithSong:emptySong];
        [songPlayer play];
    }
}

@end
