# Building Simple Jobs and Unit Testing- Java
Simple projects used to experiment with Jenkins build jobs and unit testing. Followed Jenkins tutorial https://www.tutorialspoint.com/jenkins/

## Building a Simple Job
What I did with the Helloworld.java file:
While experimented with Jenkins, I set up a build job on Jenkins and built this simple Helloworld.java file. 

To do this, I first had to configure my global tool configurations from Manage Jenkins > Global Tool Configuration. 

1. Make sure the git executable path is specified to where your `git.exe` file is located in your file system (For me, it was `C:\Program Files\Git\bin\git.exe`) 

2. Additonally, go to Manage Jenkins > Configure System and scroll down until you see the "Git plugin" heading. There, input your Github username and email in order to have access to your own repository. If this still doesn't work, add the SSH key of your device to the Github account.

3. I added a JDK Installation to be able to use java and javac commands. I did this by clicking on "Add JDK Installation" and entering 
the file path where my jdk file was located (This was C:\Progra~1\Java\jdk1.8.0_171)

Then, I clicked build and the program ran without a hitch!

  
## Jenkins Unit Testing

In order to do Jenkins Unit Testing, I needed to create .xml and .jar files to properly build and run the test. Still using the Helloworld
program I wrote above, I followed this informative tutorial: https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html 
  So, I made a file called helloworldtest, made a sub-file called src and put a copy of Helloworld.java in there. Then I executed the 
  following commands in command line while inside the helloworldtest directory:
      
      javac -sourcepath src -d build-and-unit-testing\build\classes build-and-unit-testing\src\oata\Helloworld.java
      
      java -cp build-and-unit-testing\build\classes oata.Helloworld
      
   (at this point, we see an output "Hello World! :D" and the Helloworld class file is placed in helloworldtest\build\classes)
      
      echo Main-class: Helloworld>myManifest
      
   (created an empty file myManifest in the main helloworldtest directory)
      
      md build\jar
      
      jar cfm build\jar\Helloworld.jar myManifest -C build\classes .
      
   (this places the contents of the output file into new file Helloworld.jar)
      
      java -jar build\jar\Helloworld.jar
      
   (Output: "Hello World! :D")
      
   when we run the .jar file it's like we were running the original!)
   
   Another possible file to reference is : https://github.com/junit-team/junit4/wiki/Getting-started-%E2%80%93-Ant 
      or http://www.vogella.com/tutorials/ApacheAnt/article.html#junit4 (this one helped with JUnit reports
      
   ### Scheduling Builds
   Scheduling builds and tests is another helpful tool for building jobs is the ability for Jenkins to build automatically at certain 
   times. To allow for this, check the box for "Build Periodically" under the large heading "Build Triggers". 

   For the box next to "Schedule", fill in the time you want to build the job everyday. The format is as follows:
   `minute (0-59), hour (0-23), day (1-31), month (1-12), day of the week (0-6)`

  Often, however, you don't particularly care about the day, month, and week. In that case, those inputs are filled in by an asterisk (*). 
  
  The following are example schedules for more clarity:
 
   1. Building at 4:42 PM everyday is:
    
    `42 16 * * *`
  
   2. For building multiple times a day, for example at 4PM, 6PM, 8PM, and 10PM everyday, put:
    
    `0 16,18,20,22 * * *`
    
   3. And finally, since I didn't want all my jobs to be built at the same time and overload my system, I used this schedule: 
     
     `H H(0-7) * * *`
     
 This will build the job everyday at a random time between 12 AM and 7 AM when other jobs are not being built. 

## Generating a Test Report
   Configure the build by making sure you "Invoke Ant" during the "Build Step". 
   
   Additionally, under "Post-Build Actions", add a post-build action and select "Publish JUnit Test Result Report." Make sure you 
   specify clearly where the report is located, or you will get an error. 
   
   For my Test Report XMLs, I filled in: `build-and-unit-testing\build\junitreport\*.xml`. Make sure the * is there! It indicates that
   is where JUnit should generate the reports and name them however they want. 
   
