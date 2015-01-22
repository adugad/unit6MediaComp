/**
* This class contains class (static) methods
* that will help you test the Picture class 
* methods. Uncomment the methods and the code
* in the main to test.
* 
* @author Barbara Ericson 
*/
public class PictureTester
{
/** Method to test zeroBlue */
public static void testZeroBlue()
{
Picture beach = new Picture("beach.jpg");
beach.explore();
beach.zeroBlue();
beach.explore();
}

/** Method to test mirrorVertical */
public static void testMirrorVertical()
{
Picture caterpillar = new Picture("caterpillar.jpg");
caterpillar.explore();
caterpillar.mirrorVertical();
caterpillar.explore();
}

/** Method to test mirrorTemple */
public static void testMirrorTemple()
{
Picture temple = new Picture("temple.jpg");
temple.explore();
temple.mirrorTemple();
temple.explore();
}

/** Method to test the collage method */
public static void testCollage()
{
Picture canvas = new Picture(600,900);
canvas.createCollage();
canvas.explore();
canvas.write("H:\\GitHub\\unit6MediaComp\\PictureLab\\images\\MyCollage.jpg");
}

/** Method to test edgeDetection */
public static void testEdgeDetection()
{
Picture swan = new Picture("swan.jpg");
swan.edgeDetection(10);
swan.explore();
}

public static void testMirrorVerticalRightToLeft()
{
Picture caterpillar = new Picture("swan.jpg");
caterpillar.explore();
caterpillar.mirrorVerticalRightToLeft();
caterpillar.explore();
}

public static void testMirrorHorizontal()
{
Picture caterpillar = new Picture("swan.jpg");
caterpillar.explore();
caterpillar.mirrorHorizontal();
caterpillar.explore();
}

public static void testMirrorHorizontalBottomToTop()
{
Picture caterpillar = new Picture("swan.jpg");
caterpillar.explore();
caterpillar.mirrorHorizontalBottomToTop();
caterpillar.explore();
}

public static void testMirrorArms()
{
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
}

public static void testMirrorGull()
{
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
}

public static void testKeepOnlyBlue()
{
    Picture beach = new Picture("butterfly1.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
}

public static void testNegate()
{
    Picture beach = new Picture("pretty1.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
}

public static void testGrayscale()
{
    Picture beach = new Picture("wall.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
}

public static void testFixUnderwater()
{
    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
}

public static void testCropAndCopy()
{
    Picture water = new Picture("water.jpg");
    Picture snowman = new Picture("pretty.jpg");
    water.explore();
    water.cropAndCopy(snowman,10,100,20,200,30,40);
    water.explore();
}

/** Main method for testing. Every class can have a main
* method in Java */
public static void main(String[] args)
{
// uncomment a call here to run a test
// and comment out the ones you don't want
// to run
//testZeroBlue();
//testKeepOnlyBlue();
//testKeepOnlyRed();
//testKeepOnlyGreen();
//testNegate();
//testGrayscale();
//testFixUnderwater();
//testMirrorVertical();
//testMirrorTemple();
//testMirrorArms();
//testMirrorGull();
//testMirrorDiagonal();
testCollage();
//testCopy();
//testEdgeDetection();
//testEdgeDetection2();
//testChromakey();
//testEncodeAndDecode();
//testGetCountRedOverValue(250);
//testSetRedToHalfValueInTopHalf();
//testClearBlueOverValue(200);
//testGetAverageForColumn(0);
//testMirrorVerticalRightToLeft();
//testMirrorHorizontal();
//testMirrorHorizontalBottomToTop();
//testMirrorArms();
//testMirrorGull();
//testKeepOnlyBlue();
//testNegate();
//testCropAndCopy();
}
}