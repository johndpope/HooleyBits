//
//  AppControl.h
//  SenorStaff Hack
//
//  Created by steve hooley on 20/08/2008.
//  Copyright 2008 __MyCompanyName__. All rights reserved.
//

#import <Cocoa/Cocoa.h>


@class MusicDocument;
@interface AppControl : NSObject {
    MusicDocument *testDoc;
    Song *song;
    NSData *_midiData;
}

@property MusicDocument *testDoc;

+ (AppControl *)cachedAppControl;

@end
