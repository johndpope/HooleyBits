//
//  SongPlayer.h
//  SenorStaff Hack
//
//  Created by steve hooley on 18/06/2009.
//  Copyright 2009 BestBefore Ltd. All rights reserved.
//

#import <Foundation/Foundation.h>

@class SimpleSong;

@interface SongPlayer : NSObject {
    SimpleSong *__weak _songToPlay;
}

@property (weak) SimpleSong *songToPlay;

- (id)initWithSong:(SimpleSong *)value;
- (void)play;

@end
