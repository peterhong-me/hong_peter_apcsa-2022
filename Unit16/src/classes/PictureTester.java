package classes;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed() {
    Picture beach = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  
  /** Method to test keepOnlyGreen */
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  /** Method to test grayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  /** Method to test fixUnderwater */
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalLeftToRight */
  public static void testMirrorVerticalLeftToRight()
  {
    Picture caterpillar = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalLeftToRight();
    caterpillar.explore();
  }
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  
  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop()
  {
    Picture caterpillar = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/redMotorcycle.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBotToTop();
    caterpillar.explore();
  }
  
  /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal()
  {
    Picture beach = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/beach.jpg");
    beach.explore();
    beach.mirrorDiagonal();
    beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture temple = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  
  public static void testMirrorGull()
  {
    Picture temple = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test the copy method */
  public static void testCopy()
  {
    Picture canvas = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test the myCollage method */
  public static void testMyCollage()
  {
    Picture canvas = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/640x480.jpg");
    canvas.createMyCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("/Users/emmacao/Desktop/APCSA-2022/Cao_Emma_apcsa-2022/Unit16/src/images/swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
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
    // testFixUnderwater();
    //testMirrorVertical();
	//testMirrorVerticalLeftToRight();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
	//testCollage();
	//testCopy();
	//testMyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}