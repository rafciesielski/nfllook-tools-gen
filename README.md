# nfllook-tools-gen
Generate source code

## Prerequisites:
1. node.js
2. Java

## Generate sample json files
npm run gen

## Build app
mvnw clean install

## Generate source code(POJOs) from sample json files
java -jar target\gen-0.0.2-SNAPSHOT.jar

## Install generated classes in local maven repository
mvnw install 