plugins {
  java
  id("com.google.cloud.tools.jib") version "1.8.0"
}

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

jib {
  from.image = "gcr.io/distroless/java:8"
}
