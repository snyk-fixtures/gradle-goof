plugins {
  `java`
  id("io.spring.dependency-management") version "1.1.4"
}

repositories {
  maven("https://repo.maven.apache.org/maven2/")
}

dependencyManagement {
  imports {
    mavenBom("org.springframework.boot:spring-boot-dependencies:${properties["springBootDependencies"]}")
  }
}

ext["netty"] = providers.systemProperty("arch").get()

dependencies {
  implementation(project(":shared-lib"))
  implementation(commonLibs.bundles.groovy.deps)

  val netty: String by project.ext
  implementation("io.netty:netty-transport-native-epoll:${netty}")

  implementation("org.springframework.integration", "spring-integration-core")
}
