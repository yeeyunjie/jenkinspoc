#!/usr/bin/env groovy

def call(String repoUrl, String branch){
   def workingDir = "dummy"
   sh "mkdir ${workingDir}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "pwd"
//    sh "git checkout ${branch}"
   return workingDir
}