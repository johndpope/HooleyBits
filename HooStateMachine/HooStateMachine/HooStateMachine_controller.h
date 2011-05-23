//
//  HooStateMachine_controller.h
//  SHShared2
//
//  Created by Steven Hooley on 21/05/2011.
//  Copyright 2011 Tinsal Parks. All rights reserved.
//

#import <Foundation/Foundation.h>
@class HooStateMachine_state, HooStateMachine;

@interface HooStateMachine_controller : NSObject {
@private
    HooStateMachine_state *_currentState;
    HooStateMachine *_machine;
    id _commandsChannel;   
}

- (id)initWithCurrentState:(HooStateMachine_state *)startState machine:(HooStateMachine *)stateMachineInstance commandsChannel:(id)cmdCnl;
- (void)handle:(NSString *)eventName;
- (HooStateMachine_state *)currentState;
@end