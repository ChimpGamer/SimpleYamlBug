package nl.chimpgamer.simpleyamlbug

import org.simpleyaml.configuration.file.YamlFile

fun main() {
    val yamlFile = YamlFile("test.yml")

    if (!yamlFile.exists()) {
        yamlFile.createNewFile()
    }
    yamlFile.load()

    yamlFile.addDefault("test", "test")

    yamlFile.save()
}