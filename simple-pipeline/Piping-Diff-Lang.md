# README for Simple Pipelining in Different Languages
## First Step: Writing a Simple Jenkinsfile Script
  
  Initially, to familiarize myself with how Jenkins handles pipelining, I created a simple Jenkinsfile script that prints Hello, world. 
  This script is the Jenkinsfile.groovy you see there. To define a pipeline, you must have a Jenkinsfile so that Jenkins knows how to build
  your job and code, and in an attempt to speed up the automation process, I am hoping that users will be able to provide their own scripts.
  
**Configuration**
Under the 'Pipeline' heading in your project configuration, you must do the following:
1. Select "Pipeline Script from SCM in 'Definition'
2. Select "Git" in 'SCM' and input your Repository URL
3. Under 'Script Path', make sure you fill in the entire file path to your Jenkinsfile.
**MY EGREGIOUS ERROR:** I omitted ".groovy" from the end of my file and Jenkins couldn't find my script. Make sure you include file endings.
