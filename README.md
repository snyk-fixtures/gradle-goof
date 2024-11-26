# gradle-goof

A test repository with zero code and a complex Gradle build setup that contains several vulnerabilities.

The goal of this repository is to showcase some of the Gradle features supported by Snyk Open Source.

- [Groovy](https://docs.gradle.org/current/userguide/groovy_build_script_primer.html) and [Kotlin](https://docs.gradle.org/current/userguide/kotlin_dsl.html) DSLs.
- [Built-in](https://docs.gradle.org/current/userguide/declaring_repositories.html#sec:declaring_public_repository) and [custom](https://docs.gradle.org/current/userguide/declaring_repositories.html#sec:declaring_custom_repository) repositories.
- Built-in objects [`ext`](https://docs.gradle.org/current/dsl/org.gradle.api.plugins.ExtraPropertiesExtension.html), [`project`](https://docs.gradle.org/current/dsl/org.gradle.api.Project.html), `rootProject`, and [`settings`](https://docs.gradle.org/current/dsl/org.gradle.api.initialization.Settings.html).
- Local and global variables, maps, and string interpolation.
- Gradle [lockfiles](https://docs.gradle.org/current/userguide/dependency_locking.html).
- [Gradle properties and system properties](https://docs.gradle.org/current/userguide/build_environment.html#sec:gradle_system_properties) (the `gradle.properties` file).
- [Dependency exclusions](https://docs.gradle.org/current/userguide/dependency_downgrade_and_exclude.html#sec:excluding-transitive-deps).
- Version catalogs declared in [Gradle](https://docs.gradle.org/current/userguide/platforms.html#sub:version-catalog-declaration) and [TOML](https://docs.gradle.org/current/userguide/platforms.html#sub::toml-dependencies-format) files (`gradle/libs.versions.toml`).
- [Multi-project builds](https://docs.gradle.org/current/userguide/declaring_dependencies_between_subprojects.html), project names, project references.
- [Spring's `mavenBom`](https://docs.spring.io/dependency-management-plugin/docs/current/reference/html/#dependency-management-configuration-bom-import).
- Maven BOMs as [`platform`](https://docs.gradle.org/current/userguide/platforms.html#sub:using-platform-to-control-transitive-deps) dependencies.
- [Script plugins](https://docs.gradle.org/current/userguide/plugins.html#sec:old_plugin_application) `apply from` method
