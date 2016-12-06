# nfllook-tools-gen
Generate source code

## Prerequisites:
1. node.js
2. Java

## Generate sample json files
npm run gen

## Build app
mvnw clean install

## Generate source code from sample json files
mvnw clean install exec:java -Dexec.mainClass="org.nfllook.tools.gen.ApplicationKt"

## Install generated classes in local maven repository
mvnw install

## Install generated classes in public repository(additional configuration required)
mvnw deploy