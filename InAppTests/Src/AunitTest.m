//
//  AunitTest.m
//  InAppTests
//
//  Created by steve hooley on 07/01/2010.
//  Copyright 2010 BestBefore Ltd. All rights reserved.
//

#import <SHShared/NSInvocation(ForwardedConstruction).h>
#import <SenTestingKit/SenTestCase.h>
#import <SHTestUtilities/SHTestUtilities.h>

@interface AunitTest : AsyncTests {
	TestHelp *_testHelper;
}


@end

#pragma mark -
@implementation AunitTest

- (void)setUp {
	_testHelper = [[TestHelp makeWithTest:self] retain];
}

- (void)tearDown {
	[_testHelper release];
}

- (void)_singleDocSetup {

	[_testHelper aSync:[GUITestProxy lockTestRunner]];
	NSDocumentController *dc = [NSDocumentController sharedDocumentController];
	[dc closeAllDocumentsWithDelegate:nil didCloseAllSelector:nil contextInfo:nil];
	[_testHelper aSyncAssertTrue:[GUITestProxy documentCountIs:0]];
	[_testHelper aSync:[GUI_ApplescriptTestProxy doMenu:@"File" item:@"New"]];
	[_testHelper aSyncAssertTrue:[GUITestProxy documentCountIs:1]];
}

- (void)_singleDoctearDown {
	
	[_testHelper aSync:[GUI_ApplescriptTestProxy doMenu:@"File" item:@"Close"]];
	[_testHelper aSyncAssertTrue:[GUITestProxy documentCountIs:0]];
	[_testHelper aSync:[GUITestProxy unlockTestRunner]];
}

//- (void)testMenuItems { 
//
//	[_testHelper aSync:[GUITestProxy lockTestRunner]];
//	
//	NSDocumentController *dc = [NSDocumentController sharedDocumentController];
//	[dc closeAllDocumentsWithDelegate:nil didCloseAllSelector:nil contextInfo:nil];
//	
//	[_testHelper aSyncAssertTrue:[GUITestProxy documentCountIs:0]];
//	
//	[_testHelper aSyncAssertTrue:[GUI_ApplescriptTestProxy statusOfMenuItem:@"New" ofMenu:@"File"]];
//	
//	[_testHelper aSyncAssertFalse:[GUI_ApplescriptTestProxy statusOfMenuItem:@"Close" ofMenu:@"File"]];
//	
//	[_testHelper aSync:[GUI_ApplescriptTestProxy doMenu:@"File" item:@"New"]];
//	
//	[_testHelper aSyncAssertTrue:[GUITestProxy documentCountIs:1]];
//	
//	[_testHelper aSync:[GUI_ApplescriptTestProxy doMenu:@"File" item:@"Close"]];
//	[_testHelper aSyncAssertTrue:[GUITestProxy documentCountIs:0]];
//	
//	[_testHelper aSync:[GUITestProxy unlockTestRunner]];
//}

//- (void)testDropDownMenuButton {
//
//	[self _singleDocSetup];
//
//	NSString *windowName = @"Untitled";
//	[_testHelper aSyncAssertEqual:[GUI_ApplescriptTestProxy dropDownMenuButtonText:windowName] :@"male" ];
//	[_testHelper aSync:[GUI_ApplescriptTestProxy selectPopUpButtonItem:@"female" window:windowName]];
//	[_testHelper aSyncAssertEqual:[GUI_ApplescriptTestProxy dropDownMenuButtonText:windowName] :@"female" ];
//
//	[self _singleDoctearDown];
//}

- (void)testTextField {

	[self _singleDocSetup];

	NSString *windowName = @"Untitled";
	[_testHelper aSync:[GUI_ApplescriptTestProxy setValueOfTextfield:1 ofWindow:windowName toValue:@"dirtbag"]];
	[_testHelper aSyncAssertNotEqual:[GUI_ApplescriptTestProxy getValueOfTextField:1 ofWindow:windowName] :@"crotch" ];
	[_testHelper aSyncAssertEqual:[GUI_ApplescriptTestProxy getValueOfTextField:1 ofWindow:windowName] :@"dirtbag" ];
	
	[self _singleDoctearDown];
}

//-- send to GUIFiddler applescript to call and arguments - return Notification to call with results
//-- GUIFiddler runs appescript and sends a return Notification with result
//-- assert the result is what we expected
- (void)disabled_testShit {
	
	// move to subclass? when working
	[_testHelper aSync:[GUITestProxy lockTestRunner]];

//	NSDocumentController *dc = [NSDocumentController sharedDocumentController];
//	[dc closeAllDocumentsWithDelegate:nil didCloseAllSelector:nil contextInfo:nil];
//
//	[_testHelper aSyncAssertTrue:[GUITestProxy documentCountIs:0]];
//	
//	[_testHelper aSyncAssertTrue:[GUI_ApplescriptTestProxy statusOfMenuItem:@"New" ofMenu:@"File"]];
//	
//	[_testHelper aSyncAssertFalse:[GUI_ApplescriptTestProxy statusOfMenuItem:@"Close" ofMenu:@"File"]];
//	
//	[_testHelper aSync:[GUI_ApplescriptTestProxy doMenu:@"File" item:@"New"]];
//	
//	[_testHelper aSyncAssertTrue:[GUITestProxy documentCountIs:1]];
//
//	[_testHelper aSync:[GUI_ApplescriptTestProxy doMenu:@"File" item:@"Close"]];
//	[_testHelper aSyncAssertTrue:[GUITestProxy documentCountIs:0]];
		
//	[_testHelper aSync:[GUITestProxy wait]];

//	[_testHelper aSync:[GUI_ApplescriptTestProxy openMainMenuItem:@"File"]];
//	[_testHelper aSync:[GUITestProxy wait]];

// 	STAssertTrue( 0==[[dc documents] count], @"should have made a new doc" );

//	[_testHelper aSync:[GUI_ApplescriptTestProxy closeMainMenuItem:@"File"]];


	
//	[_testHelper aSync:[GUI_ApplescriptTestProxy selectItems2And3]];

//	[_testHelper aSync:[GUI_ApplescriptTestProxy dropFileOnTableView]];


//	STFail(@"ARRRRRRRRRRRGGGGGGGGGGGGGGGGGGGG");
//	STAssertTrue(NO,@"hmm");
	
//	[_testHelper aSync:[GUITestProxy doTo:self selector:@selector(_testShit)]];

	[_testHelper aSync:[GUITestProxy unlockTestRunner]];
}

- (void)_testShit {

//	NSLog(@"aaa");
//	STAssertTrue( NO,@"hmm" );
	NSLog(@"aaa");
}






@end
