plugins {
    java
    idea
    eclipse
}

repositories {
    jcenter()
}

dependencies {
    implementation("com.google.guava:guava:28.2-jre")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")

    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.6.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_14
    targetCompatibility = JavaVersion.VERSION_14
}

tasks.withType<JavaCompile> {
    //options.compilerArgs += '--enable-preview'
    options.compilerArgs.add("--enable-preview")
}


val test by tasks.getting(Test::class) {
    //jvmArgs += ""
    jvmArgs("--enable-preview")
    useJUnitPlatform()
}

