# rahul chaudhary documentation generator

This project provide and API to generate javadoc style API documentation for Apex.

RcDoc - a tool for generating documentation from Apex class files.

# how to build

  a) Make sure you have JDK 1.8 + installed on your machine and java & javac are on PATH
  b) Make sure maven is installed and available on PATH
  
  check this project using
  git clone <URL>
  
  go to folder and run
  > mvn clean package
  
  Once build is successful, target directory will have rcdoc.jar file which is an executable and can be move around as deliverable.

# How to run :
java -jar rcdoc.jar -s <source_directory> -t <target_directory>

# program arguments
  <source_directory> - The folder location which contains your apex .cls classes
  <target_directory> - Optional. Specifies your target folder where documentation will be generated


