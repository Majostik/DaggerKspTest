enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "TestKspProject"
include(":app")
includeAllSubdirectories("feature")
include(":core")

data class ModulePaths(val directory: String, val paths: Set<String>)

fun includeAllSubdirectories(dir: String): ModulePaths {

    val paths = HashSet<String>()

    file(dir).listFiles()
        ?.filter { file -> file.isDirectory && (file.name != "build") }
        ?.forEach { currentFolder ->
            if (isGradleModuleDir(currentFolder)) {
                val path = ":${dir.replace('/', ':')}:${currentFolder.name}"
                paths.add(path)
                include(path)
            } else {
                paths.addAll(includeAllSubdirectories("$dir/${currentFolder.name}").paths)
            }
        }
    return ModulePaths(directory = dir, paths = paths)
}

fun isGradleModuleDir(folder: File): Boolean {
    return hasFile(folder, "build.gradle") || hasFile(folder, "build.gradle.kts")
}

fun hasFile(folder: File, fileName: String): Boolean {
    val file = File(folder, fileName)
    return file.exists() && file.isFile
}