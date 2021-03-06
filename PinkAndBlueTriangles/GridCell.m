//
//  SqFloorPatch.m
//  PinkAndBlueTriangles
//
//  Created by Steven Hooley on 10/07/2007.
//  Copyright 2007 __MyCompanyName__. All rights reserved.
//

#import "GridCell.h"
#import <OpenGL/CGLMacro.h>
#import <GLUT/glut.h>

// GLOBAL
extern CGLContextObj cgl_ctx; // defined in the view

/*
 *
*/
@implementation GridCell


#pragma mark -
#pragma mark class methods

#pragma mark init methods

- (id)init {

	/* random color */
	return [self initWithColourR:(float)random()/RAND_MAX g:(float)random()/RAND_MAX b:(float)random()/RAND_MAX ];
}

- (id)initWithColourR:(float)r g:(float)g b:(float)b {
	
	self = [super init];
	if(self) {
	
		_red = r;
		_green = g;
		_blue = b;
		fillColour = [[NSColor colorWithDeviceRed:_red green:_green blue:_blue alpha:1.0f] retain];
	}
	return self;
}


//=========================================================== 
// - dealloc
//=========================================================== 
- (void)dealloc
{
	[fillColour release];
	fillColour = nil;
	[super dealloc];
}

#pragma mark action methods

- (void)drawAtPoint:(NSPoint)p cellSize:(int)size {

	if(_visible){
		NSPoint centrePos = p;
		int width = size;
		int height = size;
		
		// draw a sq - anti clockwise from top left
		float xpos = centrePos.x - width/2.0f;
		float ypos = centrePos.y - height/2.0f;

		[fillColour set];
		NSRectFill( NSMakeRect( xpos, ypos, width, height) );
	}	
}

- (void)useAtPoint:(NSPoint)p cellSize:(int)size row:(int)r col:(int)c {

	if(_visible){
		double offset = size/2.0f;

		// draw a sq - anti clockwise from top left
	//	float xpos = centrePos.x - width/2.0
	//	float ypos = centrePos.y - height/2.0
	//
	//	NSRectFill( NSMakeRect( xpos, ypos, width, height) )
		
		glPushMatrix();
		if ((p.x != 0.0f) || (p.y != 0.0f) ) {
			glTranslatef(p.x, p.y, 0.0f);
		}

		// Scaling
	//	if ((_scaling.x != 1.0) || (_scaling.y != 1.0) ) {
	//		glScalef(_scaling.x, _scaling.y, 1.0);
	//	}

		glColor3f(_red, _green, _blue);

		glBegin(GL_QUADS);
			glVertex3f( -offset, offset, 0.0f); // top left
			glVertex3f( -offset, -offset, 0.0f); // bottom left
			glVertex3f( offset , -offset, 0.0f);
			glVertex3f( offset , offset, 0.0f);
		glEnd();
		
		[self renderCrapGLText:[NSString stringWithFormat:@"[%i,%i]", r,c] at:NSMakePoint(-offset,-offset)];

		
		glPopMatrix();
	}
}

// Cheap and nasty text, for quick hacks only.  I mean it : this is really fucking slow.
- (void)renderCrapGLText:(NSString *)text at:(NSPoint)point {
	
    int len = [text length];
    glColor3f( 1.0f, 1.0f, 1.0f );
    glRasterPos2f(point.x, point.y);
	int i;
    for( i=0; i<len; i++ ) {
        glutBitmapCharacter(GLUT_BITMAP_HELVETICA_12, [text characterAtIndex:i]);
    }
}

#pragma mark accessor methods
- (void)setRed:(float)r
{
	_red = r;
}

- (void)setGreen:(float)g
{
	_green = g;
}

- (void)setBlue:(float)b
{
	_blue = b;
}

- (BOOL)visible {return _visible;}
- (void)setVisible:(BOOL)value
{
	_visible = value;
}
@end
