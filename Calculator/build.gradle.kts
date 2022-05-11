plugins {
    java
    id "org.sonarqube" version "3.3"
}

sonarqube {
  properties {
    property "sonar.projectKey", "LR7"
    property "sonar.organization", "daryarotkina-1"
    property "sonar.host.url", "https://sonarcloud.io"
  }
}

group = "radik.prog"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    mavenLocal()
    jcenter()
}

dependencies {
    testCompile("junit", "junit", "4.12")
    compile(group="org.apache.commons", name="commons-lang3", version="3.8.1")
}

buildDir=File("target")

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
