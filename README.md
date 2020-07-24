# simple_calculator
A basic calculator with a scientific calculator option. Functions include Basic arithmetic, Logarithm of base 10, square root and squaring of a number. 

#Requirements
  The application was run on an Android Virtual Device(AVD) for a Google Pixel 3
  AVD name: Pixel_3a_API_30_x86
  Target: Android 10.0+
  Resolution 1080 x 2220 : 440dpi


#User Stories 

  1. A student would like to change the background colour to personalize the app as well as return it to its default colour
  2. A Professor would like a mor sophistocated calculator by pressing a button to bring more functions
  3. A student atempts to calculate the Log(0) which is undefined
  4. A professor would like a visual of what buttons have been pressed.
  5. A professor would like to demonstrate the functionality of the Square Root function
  6. A parent would like to teach their child the basic princples of basic arithmetic
  
  
  
  
#System Architecture
  Some patterns that may be applied to this application is the Observer pattern as well as the Façade pattern
  The observer pattern applies because the ScienceCalc java class conatains very similar methods to its parent, MainActivity.
  Which would indicate that creating another class in the basic calculator almost always will require the other Classes mentioned to 
  build off of.
  
  The Façade pattern applies because opening the calculator shows the first activity which is very simplistic, however it is
  linked to a class which has more in comprehensive functions behind it. 
  
  Adding new features is very simple, simply import the files into Android Studio and add any widgets required in the appropriate .xml file. 
  Then go to the respective java file for each .xml file and define and program what your new widgets should be able to do/complete.
  
  The most important files are the .java files as well as their respective .xml files, these files can be found 
  For java files: src/main/java/com/example/simple_calculator
  For xml files:  src/main/res/layout
  
