//
//  Chord.h
//  Señor Staff
//
//  Created by Konstantine Prevas on 9/30/06.
//  Copyright 2006 Konstantine Prevas. All rights reserved.
//

#import <Cocoa/Cocoa.h>
#import "NoteBase.h"
@class Staff;

@interface Chord : NoteBase <NSCopying> {
    NSMutableArray *notes;
}

- (id)initWithStaff:(Staff *)_staff;
- (id)initWithStaff:(Staff *)_staff withNotes:(NSMutableArray *)_notes;

- (NSArray *)getNotes;

- (NoteBase *)highestNote;
- (NoteBase *)lowestNote;

- (void)addNote:(NoteBase *)note;
- (void)removeNote:(NoteBase *)note;

- (NoteBase *)getNoteMatching:(NoteBase *)note;
- (int)getEffectivePitchWithKeySignature:(KeySignature *)keySig priorAccidentals:(NSMutableDictionary *)accidentals;
@end
