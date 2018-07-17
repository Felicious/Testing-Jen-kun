# Testing-Jen-kun
Simple projects used to experiment with Jenkins. Followed Jenkins tutorial https://www.tutorialspoint.com/jenkins/

What I did with the Helloworld.java file:
While experimented with Jenkins, I set up a build job on Jenkins and built this simple Helloworld.java file. 

To do this, I first had to 
configure my global tool configurations from Manage Jenkins > Global Too Configuration. Make sure the git executable path is specified 
to where your git.exe file is located in your file system (For me, it was C:\Program Files\Git\bin\git.exe) Additonally, go to Manage
Jenkins > Configure System and scroll down until you see the "Git plugin" heading. There, input your Github username and email in order
to have access to your own repository.

I also added a JDK Installation to be able to use java and javac commands. I did this by clicking on "Add JDK Installation" and entering 
the file path where my jdk file was located (This was C:\Progra~1\Java\jdk1.8.0_171)

Then, I clicked build and the program ran without a hitch!

Jenkins Unit Testing

In order to do Jenkins Unit Testing, I needed to create .xml and .jar files to properly build and run the test. Still using the Helloworld
program I wrote above, I followed this informative tutorial: https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html 
  So, I made a file called helloworldtest, made a sub-file called src and put a copy of Helloworld.java in there. Then I executed the 
  following commands in command line while inside the helloworldtest directory:
      
      javac -sourcepath src -d build\classes src\oata\Helloworld.java
      
      java -cp build\classes oata.Helloworld
      
   (at this point, we see an output "Hello World! :D" and the Helloworld class file is placed in helloworldtest\build\classes)
      
      echo Main-class: Helloworld>myManifest
      
   (created an empty file myManifest in the main helloworldtest directory)
      
      md build\jar
      
      jar cfm build\jar\Helloworld.jar myManifest -C build\classes .
      
   (this places the contents of the output file into new file Helloworld.jar)
      
      java -jar build\jar\Helloworld.jar
      
   (Output: "Hello World! :D"
      
   when we run the .jar file it's like we were running the original!)
   
   Another possible file to reference is : https://github.com/junit-team/junit4/wiki/Getting-started-%E2%80%93-Ant 
      or http://www.vogella.com/tutorials/ApacheAnt/article.html#junit4 (this one helped with JUnit reports
      
      
