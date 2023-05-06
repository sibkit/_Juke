plugins {
    id("java")
}

group = "com.github.sibkit"
version = "1.0-SNAPSHOT"


sourceSets {
    main {
        java {
            srcDir("src")
        }
    }
    test {
        java {
            srcDir("test")
        }
    }
}


dependencies {
    implementation("com.github.sibkit:SibUtils:v.0.3")
}
