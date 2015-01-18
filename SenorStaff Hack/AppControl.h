//
//  AppControl.h
//  SenorStaff Hack
//
//  Created by steve hooley on 20/08/2008.
//  Copyright 2008 __MyCompanyName__. All rights reserved.
//

#import <Cocoa/Cocoa.h>
#import "SongPlayer.h"

@class MusicDocument;
@interface AppControl : NSObject {
    MusicDocument *testDoc;
    Song *emptySong;
    NSData *_midiData;
    SongPlayer *songPlayer;
}

@property MusicDocument *testDoc;

+ (AppControl *)cachedAppControl;

@end
