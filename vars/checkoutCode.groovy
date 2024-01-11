#!/usr/bin/env groovy

def call(String repoUrl, String branch){
   def workingDir = "dummy"
   sh "mkdir ${workingDir}"
   sh "git clone ${repoUrl} ${workingDir}"
   sh "git checkout ${branch}"
   return workingDir
}