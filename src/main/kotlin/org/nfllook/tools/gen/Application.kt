package org.nfllook.tools.gen

import com.sun.codemodel.JCodeModel
import org.jsonschema2pojo.*
import org.jsonschema2pojo.rules.RuleFactory
import java.io.File
import java.net.URL

class Config : DefaultGenerationConfig() {
    override fun isGenerateBuilders(): Boolean {
        return true
    }

    override fun getSourceType(): SourceType {
        return SourceType.JSON
    }

    override fun isIncludeAdditionalProperties(): Boolean {
        return false
    }

    override fun isRemoveOldOutput(): Boolean {
        return true
    }
}

fun main(args: Array<String>) {
    generateFor(getUrl("2016090800.clean.json")!!, "GameData", "org.nfllook.tools.generated.gd")
    generateFor(getUrl("week_standings_bootstrap.json")!!, "Standings", "org.nfllook.tools.generated.ws")
}

private fun generateFor(source: URL, className: String, packageName: String) {
    val codeModel = JCodeModel()
    val mapper = SchemaMapper(RuleFactory(Config(), Jackson2Annotator(), SchemaStore()), SchemaGenerator())
    mapper.generate(codeModel, className, packageName, source)
    codeModel.build(File(System.getProperty("user.dir") + "/src/main/java"))
}

private fun getUrl(file: String): URL? = ClassLoader.getSystemClassLoader().getResource(file)
