#!/usr/bin/env groovy

def call(Map config) {
   echo "hello ${config.name}"
   echo "Today is ${config.dayOfWeek}"
}