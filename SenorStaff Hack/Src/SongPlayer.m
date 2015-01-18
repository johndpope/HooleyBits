#import "SongPlayer.h"
#import "MidiInterface.h"

@implementation SongPlayer

@synthesize songToPlay = _songToPlay;

- (id)initWithSong:(SimpleSong *)value {
    self = [super init];
    if (self) {
        self.songToPlay = value;
    }
    return self;
}

- (void)play {
    [MidiInterface startAudio];
    
    
    
    
    [MidiInterface stopAudio];
}

@end
