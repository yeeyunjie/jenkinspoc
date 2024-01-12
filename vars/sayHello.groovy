#!/usr/bin/env groovy

def call(Map config) {
   sh "echo hello ${config.name}"
   sh "echo Today is ${config.dayOfWeek}"
}