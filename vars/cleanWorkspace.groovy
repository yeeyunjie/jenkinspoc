#!/usr/bin/env groovy

def call(){
    echo "Current working directory - ${WORKSPACE}"
    echo "Cleaning ${WORKSPACE}"
    rm -rf ${WORKSPACE}/*
}
