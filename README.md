# Quarkus Component Test Reproducer

Running `b` shows the build failing with Gradle `9.0.0-rc-3`. Running with Gradle 8.14.3 shows the deprecation warning.

This shows up when `org.gradle.parallel` is set to `true`.

- Gradle 8.14.3: https://scans.gradle.com/s/ispyasboxlgy2/deprecations
- Gradle 9.0.0-rc-3: https://scans.gradle.com/s/4uad4owi7xpe6
